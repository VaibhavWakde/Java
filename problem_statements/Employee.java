package java_task.problem_statements;

//next and nextLine Scanner difference


/**
 *      Define a class "Employee" having private members (id,name,department,salary).
 *       Define default and parametrised constructor.create subclass called "Manager" with
 *       private member bonus.
 *       Define method accept() & display() in  both class.
 *       Create n objects of the manager class & display details of manager class
 *       having max total salary(salary+bonus)
 */

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public double getSalary() {
        return salary;
    }

    Employee(){

    }

    Employee(int id,String name, String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary = salary;

        System.out.println("at constructor");

        System.out.println(this.salary);
        
    }

    void accept(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID: ");
        id= scanner.nextInt();
        System.out.println("Enter Name: ");
        name= scanner.next();
        System.out.println("Enter Department: ");
        department=scanner.next();
        System.out.println("Enter Salary: ");
        salary=scanner.nextInt();

        Employee employee = new Employee(id,name,department,salary);


    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(salary);
    }


}

class Manager extends Employee{
    private double bonus;

    @Override
    void accept(){
        Scanner scanner = new Scanner(System.in);
        super.accept();

        System.out.println("Enter Bonus: ");
        bonus = scanner.nextDouble();

    }

    @Override
    void display(){
        super.display();
        System.out.println("at manager display");
        System.out.println(super.getSalary());

        System.out.println("total Salary: "+ (bonus+super.getSalary()));
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Manager manager= new Manager();
        manager.accept();
        manager.display();

    }
}
