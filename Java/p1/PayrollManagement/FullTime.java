package PayrollManagement;

public class FullTime extends Employee implements Payable {
    public FullTime(String n,String d,int a,int s){
        super(n,d,a,s);
    }

    public double calculate(){
        return salary;
    }
}
