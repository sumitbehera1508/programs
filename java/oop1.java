public class oop1 {
   // @SuppressWarnings("Deprecation")
    public static void main(String []Sumitkumarsk){
        ex a= new ex();
        //ex2 b= new ex2();
       System.out.println(a);
    //   System.out.println(b);
    }
}
class ex extends ex2{
    // @Override
    // public String toString(){
    //     System.out.println("jhfaedj fjhfadjhdjohgfs");
    //     return "age : "+age+"\nname : "+name+super.toString();
    // }
    public ex(){
        super();
        System.out.println("chid constructor");
    }
}
class ex2{
    protected int age;
    protected String name;
    public void details(){
        System.out.println("age is "+age+"\nname is"+name);
    }
    public ex2(){
        System.out.println("PArent constructor is called");
    }
    @Override
    public String toString(){
        System.out.println("jhfaedj fjhfadjhdjohgfs");
        return "age : "+age+"\nname : "+name;
    }
}
