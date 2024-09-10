package structure.composite;

public abstract class Employee {
    String nameEmployee;
    public void printNameEmployee(){
        System.out.println(this.nameEmployee);
    }
    protected abstract void add(Employee employee);
    protected abstract void remove(Employee employee);
}
