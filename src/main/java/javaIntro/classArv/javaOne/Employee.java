package javaIntro.classArv.javaOne;

public class Employee extends Person {
    /*
    private String name = "David";
    private String address = "David Home";
    private String id = "1";
    */
    public String gender = "Male";
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String address, String id){
        super(name,address,id);
        /*this.setName(name);
        this.setAddress(address);
        this.setId(id);*/
    }
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double promotion(){
        return this.salary * (1+0.1);
    }

    @Override
    public String toString() {
        return super.getName()+" "+super.getAddress()+" "+super.getId();
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
