package assignment2;

public class BankEmployee extends Employee {
    private String bankName; 
    
    public BankEmployee(String name, int employeeType, int age, int salary){
    super(name, employeeType, age, salary);
}
    
    public BankEmployee(String name, int employeeType, int age, int salary, String bankName){
    super(name,employeeType,age,salary);
    this.bankName = bankName; 
}

    @Override
    public void displayEmployee() {
       super.displayEmployee();
        System.out.println(" Bank name: " + this.bankName);
    }
    
    @Override
    public String toString(){
        String details = super.toString();
        return details + " " + bankName; 
    }

    @Override
    public void activateEmployee() {
    }
    
}
