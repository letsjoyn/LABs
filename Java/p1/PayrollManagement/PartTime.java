package PayrollManagement;

public class PartTime extends Employee implements Payable{
    public int hrs;
    public PartTime(String n,String d,int h,int a,int s){
        hrs=h;
        super(n,d,a,s);
    }
    public double calculate(){
            return hrs*salary;
        }
}
