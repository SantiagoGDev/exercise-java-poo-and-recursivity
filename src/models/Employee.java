package models;

public class Employee extends Person {
    private Profession profession;
    private double salary;

    public Employee(String name, int age, String gender, Profession profession, double salary) {
        super(name, age, gender);
        this.profession = profession;
        this.salary = salary;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void show() {
        super.show();
        System.out.println("Soy un " + profession.getName() + " y mi salario es " + salary + ".");
    }
}
