package others;

/**
 * @author Ahanabi
 * @create 2020-08-03 0:59
 * <p>
 * 题目描述：给定一个double类型的浮点数base和int类型的整数exponent。求
 * base的exponent次方。不得使用库函数，不需要考虑大数问题
 * 思路：不能用==比较两个浮点数是否相等，因为有误差。考虑输入值的多种情
 * 况。
 */
public class 数值的整数次方 {
}

class Power {
    public double power(double base, int exponent) {
        double res = 0;
        if (equal(base, 0)) {
            return 0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent > 0) {
            res = mutiply(base, exponent);
        } else {
            res = mutiply(1 / base, -exponent);
        }
        return res;
    }

    private double mutiply(double base, int e) {
        double sum = 1;
        for (int i = 0; i < e; i++) {
            sum = sum * base;
        }
        return sum;
    }

    private boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }

}
