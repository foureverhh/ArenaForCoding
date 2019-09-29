package OOPIntro.Practice3a;

public class App {
    public static void main(String[] args) {
        Course courseA = new Course("CourseA");
        Course courseB = new Course("CourseB");
        Course courseC = new Course("CourseC");
        Course courseD = new Course("CourseD");
        Course courseE = new Course("CourseE");
        Course courseF = new Course("CourseF");

        Student studentA = new Student("StudentA","SA",new Course[]{courseA,courseB,courseD,courseE});
        Student studentB = new Student("StudentB","SB",new Course[]{courseA,courseC,courseD,courseE});
        Student studentC = new Student("StudentC","SC",new Course[]{courseA,courseB,courseD,courseF});
        Student[] students =  {studentA,studentB,studentC};

        Teacher teacherA = new Teacher("TeacherA","TA",new Course[]{courseA,courseB,courseC,courseD,courseE,courseF});

        Student[] studentsForCourseA = findStudents(courseA.getCourseName(),students);
        Teacher   teacherForCourseA = findTeacher(courseA.getCourseName(),teacherA);
        System.out.println(studentsForCourseA.length);
        System.out.println("Course A");
        System.out.println("Teacher is "+teacherForCourseA.getName());
        System.out.println("Students are "+showStudents(studentsForCourseA));



    }
    public static Student[] findStudents(String courseName, Student[] students){
        Student[] sArray = new Student[100];
        int index = 0;
        for(Student student: students){
            for(Course course:student.getCourses()){
                if(course.getCourseName().equals(courseName)){
                    sArray[index]=student;
                    index++;
                }
            }
        }
        return sArray;
    }
    public static Teacher findTeacher(String courseName,Teacher teacher){
        for(Course course: teacher.getCourses()){
            if(course.getCourseName().equals(courseName))
                return teacher;
        }
        return null;
    }
    private static String showStudents(Student[] students){
        StringBuilder str = new StringBuilder();
        for(Student student:students){
            if(student!=null)
                str.append(student.getName()+" "+student.getPersonNumber()).append("\n");
        }
        return str.toString();
    }


}
