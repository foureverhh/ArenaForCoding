package OOPIntro.Practice3a;

import java.util.ArrayList;

public class Student  extends Person{

    private Course[] courses = new Course[10];

    public Student(String name, String personNumber,Course[] courses) {
        super(name, personNumber);
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }
}
