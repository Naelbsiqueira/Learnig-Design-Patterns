package structure.composite;

public class Manager extends Supervisor{
    public Manager(String nameSupervisor) {
        super(nameSupervisor);
        this.nameEmployee = nameSupervisor;
    }

    @Override
    public void printNameEmployee() {
        System.out.println(this.nameEmployee);
        for (Employee employeeTmp : employee){
            employeeTmp.printNameEmployee();
        }
    }

    @Override
    public void add(Employee newEmployee) {
        super.add(newEmployee);
    }

    @Override
    protected void remove(Employee removeEmployee) {
        super.remove(removeEmployee);
    }
}
