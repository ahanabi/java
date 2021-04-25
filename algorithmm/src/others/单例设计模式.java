package others;

/**
 * @author Ahanabi
 * @create 2020-07-29 22:08
 */
public class 单例设计模式 {
}

class Solution4 {
    private static Solution4 solution4;

    private Solution4() {
        super();
    }

    public Solution4 getSolution4() {
        return solution4;
    }
}

class Solution5 {
    private static Solution5 solution5 = null;

    private Solution5() {
        super();
    }

    public static synchronized Solution5 getSolution5() {
        if (solution5 == null) {
            synchronized (Solution5.class) {
                if (solution5 == null) {
                    solution5 = new Solution5();

                }
            }

        }
        return solution5;
//        if (solution5 == null) {
//            solution5 = new Solution5();
//        }
//        return solution5;
    }
}
