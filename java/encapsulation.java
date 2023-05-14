public class encapsulation {
    public static void main(String[] args) {
    Printer p = new Printer(50, true);
    System.out.println(p.getPagesPrinted());
    int pagesPrinted=p.PrintPages(11);
    System.out.printf("pagesprinted %d get %d\n",pagesPrinted,p.getPagesPrinted());
    pagesPrinted=p.PrintPages(10);
    System.out.printf("pagesPrint %d get %d",pagesPrinted,p.getPagesPrinted());
    }
}

class Printer{
    private int tonerLevel,pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel,boolean duplex){
        this.tonerLevel=(tonerLevel>=0&&tonerLevel<=100)?tonerLevel:-1;
        this.duplex=duplex;
        this.pagesPrinted=0;
    }
    public int addTonner(int tonnerammount){
        tonerLevel = ((tonerLevel+tonnerammount)>100 || (tonnerammount+tonerLevel)<0)?-1:(tonnerammount+tonerLevel);
        return tonerLevel;
    }
    public int PrintPages(int pages){
        int jobpage = (duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted += jobpage;
        return jobpage;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}