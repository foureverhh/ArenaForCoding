package covariance_contravariance;

public class ArraySample {
    static class Fruit{

    }
    static class ExoticFruit extends Fruit{

    }

    static class CommonFruit extends Fruit{

    }

    static class PieApple extends ExoticFruit{

    }

    public static void main(String[] args) {
        Fruit[] fruits = new ExoticFruit[4];
        /*
        fruits[0] = new CommonFruit();
        fruits[1] = new ExoticFruit();
        fruits[2] = new Fruit();
        fruits[3] = new PieApple();
        */

    }
}
