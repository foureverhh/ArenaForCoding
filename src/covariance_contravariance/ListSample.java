package covariance_contravariance;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<? super ArraySample.Fruit> fruits = new ArrayList<>();
        fruits.add(new ArraySample.PieApple());

    }


}
