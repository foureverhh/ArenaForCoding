package javaIntro.enumSample;

public enum GradeWithNumber {
    A(90),B(80),C(70),D(60),F(50);
    private int number;
    GradeWithNumber(int n){
        number = n;
    }

    public int getNumber() {
        return number;
    }

}
