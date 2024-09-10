package structure.composite;

public class Attendant extends Employee{

    public Attendant(String nameAttendant) {
        this.nameEmployee = nameAttendant;
    }

    @Override
    public void printNameEmployee() {
        System.out.println(this.nameEmployee);
    }

    @Override
    protected void add(Employee employee) {

    }

    @Override
    protected void remove(Employee employee) {

    }
}
