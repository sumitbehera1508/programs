public class COmposition2 {
    public static void main(String[] args) {
        SmartKitchen myKitchen = new SmartKitchen();
        myKitchen.getCoffieMaker().HasWork(true);
        myKitchen.getCoffieMaker().brewCoffie();
        myKitchen.getDishwasher().HasWork(true);
        myKitchen.getDishwasher().WashDishes();
        myKitchen.getRefregirator().HasWork(true);
        myKitchen.getRefregirator().OrederFood();


    }
}

class SmartKitchen{
    private CoffieMaker brewmaster;
    private Refregirator icebox;
    private Dishwasher dishwasher;

    public SmartKitchen(){
        brewmaster = new CoffieMaker();
        icebox = new Refregirator();
        dishwasher=new Dishwasher();
    }
    public CoffieMaker getCoffieMaker(){
        return brewmaster;
    }
    public Refregirator getRefregirator(){
        return icebox;
    }
    public Dishwasher getDishwasher(){
        return dishwasher;
    }

}
class CoffieMaker{
    private boolean hasWorkToDo;
    public void HasWork(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void brewCoffie(){
        if(hasWorkToDo){
            System.out.println("Browing Coffie ........");
            hasWorkToDo = false;
        }
    }

}

class Refregirator{
    private boolean hasWorkToDo;
    public void HasWork(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void OrederFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food ........");
            hasWorkToDo = false;
        }
    }
    
}

class Dishwasher{
    private boolean hasWorkToDo;
    public void HasWork(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void WashDishes(){
        if(hasWorkToDo){
            System.out.println("Washing DIshesss ........");
            hasWorkToDo = false;
        }
    }
    
}