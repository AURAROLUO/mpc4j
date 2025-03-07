package edu.alibaba.mpc4j.s2pc.pir.cppir.keyword.pai;

import edu.alibaba.mpc4j.common.tool.MathPreconditions;

/**
 * Pai client-specific preprocessing CKSPIR utilities.
 *
 * @author Weiran Liu
 * @date 2023/9/25
 */
class PaiSingleCpCksPirUtils {
    /**
     * private constructor.
     */
    private PaiSingleCpCksPirUtils() {
        // empty
    }

    /**
     * Gets row num (the same as set size).
     *
     * @param n database size.
     * @return row num.
     */
    public static int getRowNum(int n) {
        MathPreconditions.checkPositive("n", n);
        // rowNum must be greater than 1.
        return (int) Math.ceil(Math.sqrt(n));
    }

    /**
     * Gets column num.
     *
     * @param n database size.
     * @return column num.
     */
    public static int getColumnNum(int n) {
        // columnNum is n / rowNum
        return (int) Math.ceil((double) n / getRowNum(n));
    }
}
