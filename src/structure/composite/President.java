package structure.composite;

public class President extends Supervisor {
    public President(String nameSupervisor) {
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
    protected void add(Employee newEmployee) {
        super.add(newEmployee);
    }

    @Override
    protected void remove(Employee removeEmployee) {
        super.remove(removeEmployee);
    }
}
