package models;

import java.util.List;

public class CalcThings {
    
    public static Integer calcFactorial(Integer number){
        if (number == 1) { // Caso base: el factorial de 1 es 1
            return 1;
        } else { // Caso recursivo: calcular el factorial de n-1 y multiplicarlo por n
            return number * calcFactorial(number - 1);
        }
    }

    public static int myPow(int base, int exponent) {
        if (exponent == 0) { // Caso base: cualquier número elevado a 0 es 1
            return 1;
        } else if (exponent % 2 == 0) { // Caso recursivo: exponente par
            int half = myPow(base, exponent / 2);
            return half * half;
        } else { // Caso recursivo: exponente impar
            int half = myPow(base, (exponent - 1) / 2);
            return base * half * half;
        }
    }

    public static double sumSalaryEmployees(List<Employee> employees) {
        if (employees.isEmpty()) {
            return 0;
        } else {
            Employee employee = employees.get(0);
            employees.remove(0);
            return employee.getSalary() + sumSalaryEmployees(employees);
        }
    }
}
