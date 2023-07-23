public class exp10{
    public static void main(String[] args) {
        Book Library[] = new Book[10];
        int i =0;
        String Author1[] ={"sumit","Amit","Pablo"}; 
        Book b1 = new Book(Author1,"BOOK1","#1211","OUTR","2023","BBSR","WE","IN");
        Library[i]=b1;i++;
        String Author2[] = {"sumit","Denish Ritche"};
        Book b2  = new Book(Author2,"BOOK2","&12k31","CET","2022","CUTTUK","org2","INDIA");
        Library[i]=b2;i++;
        String name = "sumit";
        for(int j=0;j<i;j++){
            Library[j].cheak(name);
        }
    }
}

class Book{
    private String Authors[]= new String[10];
    private String title,ISBN,publisher,year,designation,organization,contry;
    Book(String Authors[],String title,String ISBN,String publisher,String year,String designation,String org,String contry){
        this.title = title; this.Authors = Authors;
        this.ISBN = ISBN; this.publisher = publisher;
        this.year = year; this.designation = designation;
        this.organization = org; this.contry = contry;
    }

    public void cheak(String name){
        for(String s:Authors){
            if(s==name){
                System.out.print("Authors : ");
                for(String k :Authors){
                    System.out.print(k+" , ");
                }
                System.out.println("\nTitle is : "+this.title);
                System.out.println("ISBN : "+this.ISBN);
                System.out.println("publisher : "+this.publisher);
                System.out.println("Year : "+this.year);
                System.out.println("Designation : "+this.designation);
                System.out.println("Organization : "+this.organization);
                System.out.println("Country : "+this.contry+"\n\n");
            }
        }
    }
}