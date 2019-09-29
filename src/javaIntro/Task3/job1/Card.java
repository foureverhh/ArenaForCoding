package javaIntro.Task3.job1;

public class Card {
    private String color;
    private String number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color+" "+this.number;
    }
}
