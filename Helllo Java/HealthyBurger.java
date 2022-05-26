public class HealthyBurger  extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;
    public HealthyBurger(  String meat,double price){
    super("Healthy",meat,price,"Brown Rye");
}

    public void addHealthyAddition1(String name, double price){
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
}
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

//    @Override
//    public double itemizeHamburger() {
//        double p =super.itemizehamburger();
//        if ( this.healthyExtra1Name != null){
//            p+=healthyExtra1Price;
//            System.out.println("Added " + healthyExtra1Name + " for " + healthyExtra1Price);
//        }
//        if ( this.healthyExtra2Name!= null){
//            p+=healthyExtra2Price;
//            System.out.println("Added " + healthyExtra2Name + " for " + healthyExtra2Price);
//        }
//        return p;
//    }
}
