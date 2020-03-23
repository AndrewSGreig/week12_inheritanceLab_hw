package staff;

public abstract class Employee {
    //instance variables
    private String name;
    private String niNumber;
    private Double salary;


    //constructor
    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    //methods
    public Double raiseSalary(Double increment){
        return this.salary + increment;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
