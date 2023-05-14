public class polymorphisim {
    public static void main(String[] args) {
        movie theMovie = new Advanture("Star Wars");
        theMovie.watchMovie();
        movie theMovie2 = new comedy("Scary movie");
        theMovie2.watchMovie();
    }
}

class movie{
    private String tittle;
    public movie(String tittle){
        this.tittle=tittle;
    } 
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(tittle+" is a "+instanceType+" Film.");
    } 
}
class Advanture extends movie{
    public Advanture(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"plesant scehenes","scarry music","bad happens");
    }
}

class comedy extends movie{
    public comedy(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"plesant scehenes","Funny music","funny Schenes happens");
    }
}