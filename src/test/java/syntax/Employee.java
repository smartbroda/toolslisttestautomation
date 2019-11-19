package syntax;

public class Employee {

    private boolean employed;
    private int salary;

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed (boolean employed) {
        this.employed = employed;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public  void fire() {
        System.out.println("House is burning up");
        employed = false;
    }

    public  void employ() {
        employed = true;
    }

    public  void givePayRise() {
        salary = salary + 250;
    }
}
