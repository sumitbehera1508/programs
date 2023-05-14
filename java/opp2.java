public class opp2 {
    public static void main(String[] args) {
        Worker a = new Worker("SUMIT", "2001");
        Employee c = new Employee("x", "1011", "20/02/2002");
        Employee b = new Employee("SUMIT", "2002","15/08/2022");
        System.out.println(a);
        System.out.println(b);
    }
}
class Employee extends Worker {
    private long employeeId;
    private static long employeeNo=1;
    private String hireDate;
    public Employee(String name,String dob,String hireDate){
        super(name, dob);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }
    @Override 
    public String toString(){
        return "Employee { Employee ID : "+employeeId+" , Hire Date : "+ hireDate+" } "+ super.toString() ;
    }
}
class Worker{
    private String name;
    private String dob;
    protected String edate;
    public Worker(String name,String dob){
        this.name = name;
        this.dob = dob;
    }
    public int getAge(){
        int currentage = 2023;
        int Dob = Integer.parseInt(dob);
        return (currentage-Dob);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String edate){
        this.edate = edate;
    }
    @Override
    public String toString(){
        return "Worker { name : "+ name+", Birthdate : "+dob+", EndDate : "+edate+"}";
    }

}