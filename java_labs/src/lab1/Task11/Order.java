package Lab1.Task11;

public class Order {
    final private double costkm = 2;
    private double price;
    private double dist;

    public void price(){
        price = costkm * dist;
    }

    public void order (final Taxi taxi ){

        if (taxi.driver.ready){
            System.out.println("Order started!\n" +"Price = " + price + "\n" + "Your driver is : "  + taxi.driver.name +"." + " Wait for " + taxi.colour +" "+
                    taxi.carbrand + " with plate number: " + taxi.platenumber + ".\n");
            taxi.driver.ready = false;
        }
        else
            System.out.println("driver is busy!\n" + "choose another or wait\n");
    }

    public void finish (final Taxi taxi){

        if (!taxi.driver.ready) {
            taxi.driver.ready = true;
            System.out.println("Order canceled\n");
        }
    }

    public static void main(final String[] args) {

        final Taxi Taxi1 = new Taxi("Audi", 1111 ,"purple");
        final Taxi Taxi2 = new Taxi("BMW", 7265, "white");
        final Taxi Taxi3 = new Taxi("MB",2121,"black");

        final Driver driver1 = new Driver("Yura",true);
        final Driver driver2 = new Driver("Billy",true);
        final Driver driver3 = new Driver("Leatherman",true);

        Taxi1.driver = driver1;
        Taxi2.driver = driver2;
        Taxi3.driver = driver3;

        final Order obj1 = new Order();
        final Order obj2 = new Order();

        obj1.dist = 4;
        obj1.price();
        obj1.order(Taxi1);
        obj2.dist = 7;
        obj2.price();
        obj2.order(Taxi2);
        obj1.finish(Taxi1);
        obj2.dist = 12;
        obj2.price();
        obj2.order(Taxi3);
        obj1.dist = 6;
        obj1.price();
        obj1.order(Taxi3);


    }
}

