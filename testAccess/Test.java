package testAccess;

import Business.Employee;
import Business.Entreprise;

public class Test {

    public static void main(String[] args) {

        Entreprise ent = new Entreprise();
        System.out.println("Testing access from a different package");

        System.out.println("The Entreprise Name is :" + ent.entrepriseName);

        ent.entrepriseName();
        ent.displaySalary();



        Employee emp = new Employee();
        System.out.println("Testing access from the Employee class which is a subclass in the same package");

        System.out.println("The Employee Name is :" + emp.Fullname);
        emp.displaySalary();
    }
}
