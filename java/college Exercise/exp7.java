/* Define a class called SimpleMath with overloaded methods to carryout arithmetic
operations using it. Use static methods appropriately.  */

public class exp7 {
public static void main(String Sumit[]) {
    SimpleMath m = new SimpleMath();
    int a= 15,b=19;
    double c = 5.0,d=9.0;
    System.out.println("addition : " + m.add(a, b) + " " + m.add(c, d)+" " + m.add(a, d));
}
}

class SimpleMath {
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a,int b) {
        return (int) this.add((double)a,(double) b);
    }
    public double sub(double a,double b){
        return a-b;
    }
    public int sub(int a,int b){
        return (int) this.sub((double)a, (double)b);
    }

    public double mult(double a,double b){
        return a*b;
    }
    public int mult(int a, int b){
        return (int) this.mult((double)a,(double) b);
    }
    public double divide(double a, double b){
        if(b==0) return -1;
        return a/b;
    }

    public double divide(int a,int b){
        return this.divide((double)a,(double) b);
    }

}