package structure.composite;

public class Boxe extends Employee {

    public Boxe(String nameBoxe) {
        this.nameEmployee = nameBoxe;
    }

    @Override
    public void printNameEmployee() {
        super.printNameEmployee();
    }

    @Override
    protected void add(Employee employee) {

    }

    @Override
    protected void remove(Employee employee) {

    }
}
