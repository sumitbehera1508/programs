public class billsBurger {
    public static void main(String[] args) {
        Items coke =new Items("DRINK", "CocaCola", 85);
        coke.printdetails();
        coke.setSize("LARGE");
        coke.printdetails();
    }
}

class Items{
    private String type,name,size = "Medium";
    private double price;
    public Items(String type,String name,double price){
        this.type=type.toUpperCase();
        this.name=name.toUpperCase();
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        if(type.equals("SIDE")||type.equals("DRINK"))
        return  size+" "+name;
        return name;
    }
    public double adjustPrice(){
        return switch (size) {
            case "SMALL" -> getPrice()-25;
            case "LARGE" -> getPrice()+30;
            default -> getPrice();
        };
    }
    public void setSize(String size){
        this.size=size;
        price = adjustPrice();
    }
    public void printdetails(String name,double price){
        System.out.printf("%20s : %.2f%n",name,price);
    }
    public void printdetails(){
        System.out.printf("%20s : %.2f%n",size+" "+name,price);
    }
    public void printName(){
        printdetails(getName(),getPrice());
    }
}