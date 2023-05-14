public class polymorphisim1{
    public static void main(String[] args) {
        Car theCar = new Car("BMW 29");
        Car ferrari = new GassCar("Ferrari nexon 2023", 120.5, 3);
        //theCar.RunEnguine();
        theCar.Startenguine();
        theCar.Drive();
        ferrari.Startenguine();
        ferrari.Drive();
    }
}
class Car{
    private String description;
    public Car(String description){
        this.description=description;
    }
    public void Startenguine() {
        System.out.println("STARTING THE ENGUINE of "+getClass().getSimpleName());
    }
    protected void RunEnguine() {
        System.out.println(description+" IS RUNNING");
    }
    public void Drive(){
        System.out.println("driving car of type : "+ getClass().getSimpleName());
        RunEnguine();
    }
}

class GassCar extends Car {
    private double Avgmilage;
    private int cylinders =6;
    public GassCar(String desc){
        super(desc);
    }
    public GassCar(String desc,double Avgmilage,int cylinders){
        super(desc);
        this.Avgmilage=Avgmilage;
        this.cylinders=cylinders;
    }

    @Override
    public void Startenguine(){
        System.out.printf("the %d cylinders of %s are fired up \n",cylinders,getClass().getSimpleName());
    }
    @Override
    protected void RunEnguine(){
        System.out.printf("the car's average milage is %.2f \n",Avgmilage);
    }
}