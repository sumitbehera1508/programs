/* Redefine the Circle class in exercise 1 to use value of Pi as a constant and a variable to
count number of instances created as you go on creating objects.  */

public class exp8 {
public static void main(String sumit[]) {
        circle c = new circle(3);
        circle c2 = new circle();
        System.out.println("the area is "+c.getArea());
        System.out.println("the area is "+c2.getArea());
        System.out.println("Total Circles : "+circle.count);
    }
}

class circle {
    public static int count =0;
    private int len;
    private double area;
    @Deprecated
    public int getLength(){
        return this.len;
    }
    @Deprecated
    public void setLength(int len){
        this.len=len;
    }
    circle(int len){
        count++;
        this.len = len;
        area = 2*Math.PI*len;
    }
    circle(){
        this(0);
    }
    public double getArea(){
        return area;
    }
}