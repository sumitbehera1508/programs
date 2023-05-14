import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.println("1. Holorectangle");
        System.out.println("2. Inverted Pyramid"); 
        System.out.println("3. inverted Pyraaamid with number");
        System.out.println("4. Floyed's Triangle");
        System.out.println("5. Zero One Triangle");
        System.out.println("6. Butterfly");
        System.out.println("7. SOlid Rumbus");
        System.out.println("8. Holo Rumbus");
        System.out.println("9. Diamond");
        System.out.println("10. Holo Diamond");
        System.out.println("11. Number Square");
        System.out.println("12. Number Pyramid");
        System.out.println("13. palindromic Number Pyramid");
        System.out.print("Choose a operation : ");
        int t= sc.nextInt();
        switch(t){
            case 1 -> holoRectangle(n);
            case 2 -> invertedPyramid(n); 
            case 3 -> invertedHalfPyramidNumber(n);
            case 4 -> floydsTriangle(n);
            case 5 -> zeroOneTriangle(n);
            case 6 -> ButterFly(n);
            case 7 -> rumbus(n);
            case 8 -> holoRumbus(n);
            case 9 -> diamond(n);
            case 10 -> holoDiamong(n);
            case 11 -> numberSquare(n);
            case 12 -> numberPyramid(n);
            case 13 -> palindromicNumber(n);
            default -> System.out.println("invalid Input");
        }
    }
    public static void holoRectangle(int n){
        if(n<3) System.out.println("invalid input");
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==n-1||j==n-1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
    public static void invertedPyramid(int n){
        if(n<1) System.out.println("Invalid input");
        else {
            for(int i=1;i<=n;i++){
                for(int j=0;j<n-i;j++ ) System.out.print("  ");
                for(int j=0;j<i;j++) System.out.print("* ");
                System.out.println();
            }
        }
    }

    public static void invertedHalfPyramidNumber(int n){
        if(n<1) System.out.println("Invalid inputr");
        else {
            for(int i=5;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.printf("%d ",j);
                }
                System.out.println();
            }
        }
    }

    public static void floydsTriangle(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.printf("%d ",k);
                k++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.printf("%d ",k);
                k^=1;
            }
            System.out.println();
        }
    }

    public static void ButterFly(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) System.out.print("* ");
            for(int j=i;j<n;j++) System.out.print("    ");
            for(int j=0;j<i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++) System.out.print("* ");
            for(int j=i;j<n;j++) System.out.print("    ");
            for(int j=0;j<i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void rumbus(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<n;j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void holoRumbus(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<n;j++) {
                if(i==1|| j==0|| i==n||j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void diamond( int n ) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<i;j++) System.out.print("* ");
            for(int j=0;j<i-1;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<i;j++) System.out.print("* ");
            for(int j=0;j<i-1;j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void holoDiamong(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<i;j++){ 
                if(j==0) System.out.print("* "); 
                else System.out.print("  ");
            }
            for(int j=0;j<i-1;j++) {
                if(j==i-2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<i;j++) { 
                if(j==0) System.out.print("* "); 
                else System.out.print("  ");
            }
            for(int j=0;j<i-1;j++){
                if(j==i-2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void numberSquare(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++) System.out.printf("%d ",i);
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=0;j<i;j++) System.out.printf("%d   ",i);
            System.out.println();
        }
    }

    public static void palindromicNumber(int n) {
        if(n<1){ System.out.println("Invalid input"); return;}
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) System.out.print("  ");
            for(int j=i;j>=1;j--) System.out.printf("%d ",j);
            for(int j=2;j<=i;j++) System.out.printf("%d ",j);
            System.out.println();
        }
    }
}
