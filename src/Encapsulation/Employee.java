package Encapsulation;
/**
 * 1. Employee
 *         int id
 *         String name
 *         double salary //write only
 *         double bonus  //read only
 *         String email
 *    Create double calculateBonus() - salary + bonus*/

public class Employee {
    private int id;
    private String name;
    private double salary;
    private double bonus;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(11);
        emp.setName("pranali");
        emp.setSalary(50000.0);
        emp.setBonus(20000.0);
        emp.setEmail("pc15@gmail.com");
        System.out.println(emp.getId()+"\n "+emp.getName()+"\n "+emp.getSalary()+"\n "+emp.getBonus()+"\n"+emp.getEmail());
    }
}