package OOPIntro.Practice3a;

public class Teacher extends Person {

    private Course[] courses = new Course[10];

    public Teacher(String name, String personNumber,Course[] courses) {
        super(name, personNumber);
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }
}
