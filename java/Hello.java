public class Hello{
    public static void main(String[] args) {
       customer a = new customer();
       customer b= new customer("sumnta","sdad@gmail.com");
       customer c= new customer("Diptesh", 100, "ChaUDJARI@gmail.com");
       a.details();
       b.details();
       c.details();

    }

}

class c{
    private int Age;
    private String Name;
    public void setAge(int Age){
        this.Age = Age;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
}

class customer{
    private String name;
    private int cLimit;
    private String email;
    public String getName(){
        return name;
    }
    public int getcLimit(){
        return cLimit;
    }
    public String getEmail(){
        return email;
    }
    customer(String name,int cLimit,String email){
        this.name=name;
        this.cLimit=cLimit;
        this.email=email;
    }
    customer(){
        this.name ="Sumit";this.cLimit=2000;this.email="s1508b@gmail.com";
    }
    customer(String name,String email){
        this(name,2000,email);
    }
    public void details(){
        System.out.println("name : "+name+"\ncLimit :"+cLimit+"\nemail :"+email);
    }

}