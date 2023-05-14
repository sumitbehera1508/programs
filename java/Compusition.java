public class Compusition {
    public static void main(String[] args) {
    ComputerCase theCase = new ComputerCase("2200", "HP", "240 V");
    Monitor theMonitor = new Monitor("Dragov Monitor", "Dell", 27, "2540x1440");
    Motherbord tMotherbord = new Motherbord("Intel i5700u", "Intel", 2, 3, "V3.24");
    personalComputer thrPersonalComputer = new personalComputer("Probook 440 G4", "Hp", theCase, theMonitor, tMotherbord);

    thrPersonalComputer.getMonitor().drawPixelAt(10,10,"black");
    }
    
}

class product{
    private String model,menufecture;
    // private int height,width,depth;
    public product(String model,String menufecture){
        this.menufecture = menufecture;
        this.model = model;
    }
}

class personalComputer extends product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherbord motherbord;
    personalComputer(String model,String menufecture,ComputerCase computerCase,Monitor monitor,Motherbord motherbord){
        super(model, menufecture);
        this.computerCase=computerCase;
        this.monitor=monitor;
        this.motherbord=motherbord;
    }
    public ComputerCase getComputercase(){
        return computerCase;
    }
    public Monitor getMonitor(){
        return monitor;
    }
    public Motherbord getMotherbord(){
        return motherbord;
    }
}

class Motherbord extends product{
    private int ramSlots,cardSlots;
    private String bios;
    public Motherbord(String model,String menufecture){
        super(model, menufecture);
    }
    public Motherbord(String model,String menufecture,int ramSlots,int cardSlots,String bios){
        super(model, menufecture);
        this.bios = bios;
        this.cardSlots=cardSlots;
        this.ramSlots=ramSlots;
    }
    public void loadProgram(String p){
        System.out.println("Programe "+p+" is now loading....");
    }
}

class Monitor extends product{
    private int size;
    private String resolution;
    public Monitor(String model,String menufecture){
        super(model, menufecture);
    }
    public Monitor(String model,String menufecture,int size,String resolution){
        super(model, menufecture);
        this.size = size;
        this.resolution=resolution;
    }
    public void drawPixelAt(int x,int y ,String color){
        System.out.println(String.format("Drawing pixel at %d %d and color %s",x,y,color));    }
}

class ComputerCase extends product{
    private String powerPlay;
    public ComputerCase(String model,String menufecture){
        super(model, menufecture);
    }
    public ComputerCase(String model,String menufecture,String powerPlay){
        super(model, menufecture);
        this.powerPlay=powerPlay;
    }
    public void pressButton(){
        System.out.println("Button Pressed");
    }
}