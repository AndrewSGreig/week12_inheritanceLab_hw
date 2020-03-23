package staff.management;

import staff.Employee;

public class Manager extends Employee {
    // instance variables
    private String deptName;

    //constructor
    public Manager(String name, String niNumber, Double salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    //Getters and Setters

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    //Methods
}
