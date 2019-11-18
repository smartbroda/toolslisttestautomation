package syntax;

import org.junit.Test;


public class EmployeeTest {


    @Test
    public void testEmployee() {

        // This is where we create our objects
       Employee hannah = new Employee();
        Employee bob = new Employee();
        // Create a sales employee object
        SalesEmployee victoria = new SalesEmployee();


        // This is where we employ hannah and fire bob
        hannah.employ();
        bob.fire();

        // Let's print their state on screen
        System.out.println("Hannah employment state: " + hannah.isEmployed());
        System.out.println("Bob employment state: " + bob.isEmployed());

        // This is where we employ victoria and give here a bmw
        victoria.isEmployed();
        victoria.changeCar("bmw");

        // Let's print their states to screen
        System.out.println("Hannah employment state: " + hannah.isEmployed());
        System.out.println("bob employment state: " + bob.isEmployed());
        System.out.println("victoria employment state: " + victoria.isEmployed());
        System.out.println("victoria's car: " + victoria.car);

        hannah.setEmployed(true);
        System.out.println(hannah.isEmployed());

        // when you change classes, variables and methods to static, objects do not need to be created


    }


}
