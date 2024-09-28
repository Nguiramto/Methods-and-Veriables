import java.util.List;

public class Main {

    public static void main(String[] args) {

        Partner partner1 = new Partner("Francesca", 2345);
        Partner partner2 = new Partner("Fatima", 9776);
        Partner partner3 = new Partner("Mohamed Ali", 5467);

        System.out.println(partner1);
        System.out.println(partner2);
        System.out.println(partner3);

       Platform platform = new Platform("Sky Rock", List.of(partner1,partner2,partner3),2024);
       System.out.println(platform);
    }
}
