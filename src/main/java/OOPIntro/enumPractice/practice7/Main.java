package OOPIntro.enumPractice.practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*  List<Figure> figures = new ArrayList<>();
        figures.add(new Circle());
        figures.add(new Rectangle());
        figures.add(new EquilateralTriangle());
        List newList = Figure.figures;*/

        Factory factory = new Factory();
        Figure figure = factory.getInstance();
        figure.PrintShape();
    }
    static class Factory{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Figure getInstance(){
            Figure figure = null;
            if(input.equalsIgnoreCase("rund")){
                figure = new Circle();
            }
            if(input.equalsIgnoreCase("trekantig")){
                figure = new EquilateralTriangle();
            }
            if(input.equalsIgnoreCase("fyrkantig")){
                figure = new Rectangle();
            }
            return figure;
        }
    }

    static class Circle extends Figure{
        private double r;


        public double getR() {
            return r;
        }

        public Circle() {

            Figure.figures.add(this);
        }

        @Override
        void PrintShape() {
            System.out.println("I am "+this.getClass().getSimpleName());
        }
    }

    static class Rectangle extends Figure{



        public Rectangle() {
            Figure.figures.add(this);
        }

        @Override
        void PrintShape() {
            System.out.println("I am "+this.getClass().getSimpleName());
        }
    }

    static class EquilateralTriangle extends Figure{


        public EquilateralTriangle() {
            Figure.figures.add(this);
        }

        @Override
        void PrintShape() {
            System.out.println("I am "+this.getClass().getSimpleName());
        }
    }
}
