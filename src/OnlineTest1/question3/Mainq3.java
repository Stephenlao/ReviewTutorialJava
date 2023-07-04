package OnlineTest1.question3;

public class Mainq3 {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Tom");
        Client client1 = new Client("Jerry");
        Client client2 = new Client("Phong");

        Service client1Booked = client1.ClientBooked(2,"Food delivery");
        client1.printAll();
        driver1.Accept(client1Booked);
        client1.printAll();
        driver1.Complete();

        // Show the wallet amount of driver Tom.
        System.out.printf("Tom's wallet: %.1f\n", driver1.getWallet());

        // Show the status and cost of all booked services of client jerry.
        client1.printAll();

        // Client phong books a service of 10km express delivery.
        Service s2 = client2.ClientBooked(10, "Express Delivery");

        // Show the status and cost of all booked services of client phong.
        client2.printAll();

        // Driver Tom accepts the service of 2km food delivery from client jerry.
        driver1.Accept(s2);

        // Show the status and cost of all booked services of client phong.
        client2.printAll();

        driver1.Complete();

        // Show the status and cost of all booked services of client phong.
        client2.printAll();

        // Show the wallet amount of driver Tom.
        System.out.printf("Tom's wallet: %.1f\n", driver1.getWallet());
    }
}
