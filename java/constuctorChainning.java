public class constuctorChainning {
    public static void main(String[] args) {
        // Rectangle a =new  Rectangle();
        // System.out.println(a.area());
        // Rectangle b =new Rectangle(10.0);
        // System.out.println(b.area());
        // Rectangle c =new Rectangle(10,20);
        // System.out.println(c.area());
        Rectangle s = new Rectangle();
        System.out.println(s);
    }
}

class Rectangle{
    protected double x,y;
    public Rectangle(){
        this(0, 0);
    }
    public Rectangle(double x){
        this(x, x);
    }
    public Rectangle(double x, double y){
        this.x=x;this.y=y;
    }
    public double area(){
        return (x*y);
    }
}
class square extends Rectangle{
    public square(double x,double y){
        super(x, y);
    }
    @Override
    public String toString(){
        return "area is " + x*y;
    }
}