package structure.composite;

import java.util.ArrayList;

public class Supervisor extends Employee{
    ArrayList<Employee> employee = new ArrayList<Employee>();
    public Supervisor(String nameSupervisor){
        this.nameEmployee = nameSupervisor;
    }
    @Override
    public void printNameEmployee(){
        System.out.println(this.nameEmployee);
    }


    protected void add(Employee newEmployee) {
        this.employee.add(newEmployee);

    }

    protected void remove(Employee removeEmployee) {
        this.employee.remove(removeEmployee);

    }

}
