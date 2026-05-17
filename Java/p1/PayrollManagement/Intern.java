package PayrollManagement;

public class Intern extends Employee implements Payable{
    public Intern(String n,String d,int a,int s){
        super(n,d,a,s);
    }

    public double calculate(){
        return salary;
    }
}
