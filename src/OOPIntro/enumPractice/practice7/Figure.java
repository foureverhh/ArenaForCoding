package OOPIntro.enumPractice.practice7;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    Point point;
    abstract void PrintShape();
    static List<Figure> figures = new ArrayList<>();
}
