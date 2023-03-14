import java.util.ArrayList;
import java.util.List;

import models.CalcThings;
import models.Employee;
import models.Profession;

public class App {
    public static void main(String[] args) throws Exception {
        Profession programmer = new Profession("Programador", "Diseña y desarrolla aplicaciones informáticas.");
        Profession accountant = new Profession("Contador", "Maneja y registra la información financiera de una empresa.");

        Employee john = new Employee("John", 30, "Masculino", programmer, 5000);
        john.show();
        john.setName("Carlos");
        john.show();
        john.getProfession().show();
        Employee sarah = new Employee("Sarah", 25, "Femenino", accountant, 6000);
        sarah.show();

        Integer numFactorial = 5;
        Integer factorial  = CalcThings.calcFactorial(numFactorial);
        System.out.println("Factorial del numero "+numFactorial+" = "+factorial);

        Integer elevar = CalcThings.myPow(10, 31);
        System.out.println("Elevacion de un numero = "+elevar);

        List<Employee> list = new ArrayList<>();
        list.add(sarah);
        list.add(john);
        Double sumSalary = CalcThings.sumSalaryEmployees(list);
        System.out.println("El salario total de los empleados es : "+sumSalary);
    }
}
