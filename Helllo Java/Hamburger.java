import java.util.ArrayList;

public class Hamburger {
    private String name;
    private String meat;
    private double price;

    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    ArrayList<String> a = new ArrayList<>() ;
    public  void addHamburgerAddition1(String name, double price){
        this.addition1Price =price;
       this.addition1Name =name;
    }
    public  void addHamburgerAddition2(String name, double price){
        this.addition2Price =price;
        this.addition2Name =name;

    }
    public  void addHamburgerAddition3(String name, double price){
        this.addition3Price =price;
        this.addition3Name =name;
    }
    public  void addHamburgerAddition4(String name, double price){
        this.addition4Price =price;
        this.addition4Name =name;
    }
    public  double itemizeHamburger(){
        double p= this.price;
        System.out.println(this.name +  " hamburger " + this.breadRollType  +" roll " + "price is" +p);
         if ( this.addition1Name != null){
             p+=addition1Price;
             System.out.println("Added " + addition1Name + " for " + addition1Price);
         }
        if ( this.addition2Name!= null){
            p+=addition2Price;
            System.out.println("Added " + addition2Name + " for " + addition2Price);
        }
        if ( this.addition3Name != null){
            p+=addition3Price;
            System.out.println("Added " + addition3Name + " for " + addition3Price);
        }
        if ( this.addition4Name != null){
            p+=addition4Price;
            System.out.println("Added " + addition4Name + " for " + addition4Price);
        }
        return p;
    }
}
