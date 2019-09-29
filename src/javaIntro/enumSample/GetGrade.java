package javaIntro.enumSample;

import java.util.EnumSet;


public class GetGrade {
    public static void main(String[] args) {
        EnumSet<Grade> pass = EnumSet.range(Grade.A,Grade.D);
        for(Grade grade:pass){
            System.out.println(grade);
        }

        EnumSet<GradeWithNumber> passTest = EnumSet.allOf(GradeWithNumber.class);
        for(GradeWithNumber number : passTest){
            System.out.print(number+" ");
            System.out.print(number.getNumber()+" ");
        }
    }
}
