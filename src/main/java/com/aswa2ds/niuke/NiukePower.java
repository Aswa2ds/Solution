package com.aswa2ds.niuke;

/**
 * @author aswa2ds
 */
public class NiukePower {

    public static double Power(double base, int exponent) {
        if (base == 0) {
            if (exponent > 0) {
                return 0;
            } else {
                throw new ArithmeticException();
            }
        }
        if (exponent == 0) {
            return 1;
        }
        boolean sign = true;
        if (exponent < 0) {
            sign = false;
            exponent = -exponent;
        }

        double res = 1;
        double cur = base;
        while (exponent > 0) {
            int indicator = exponent & 1;
            exponent >>= 1;
            if (indicator == 1) {
                res *= cur;
            }

            cur = cur * cur;
        }
        if (!sign) {
            return 1 / res;
        }
        return res;
    }

}
