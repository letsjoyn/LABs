package Company;
import PayrollManagement.*;

public class Company {
    public static void main(String[] args){
        Employee[] employee=new Employee[3];
        
        employee[0]=new FullTime("Nayvedya0","SDE0",19,100000);
        employee[1]=new PartTime("Nayvedya1","SDE1",5,30,23);
        employee[2]=new Intern("Nayvedya2","SDE2",39,200000);

        System.out.println("-----Payroll System------");

        for(Employee emp: employee){
            Payable p=(Payable)emp;

            System.out.println("Name: "+ emp.name +" Age: "+ emp.age+ "Salary: " +p.calculate());
        }
    }
}
