package OnlineTest1.question3;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Service> service;

    public Client(String name) {
        this.name = name;
        service = new ArrayList<>();
    }
    public Service ClientBooked(double distance, String type) {
        Service services;
        if (type.equalsIgnoreCase("Food Delivery")) {
            services = new FoodDelivery(distance);
        } else {
            services = new ExpressDelivery(distance);
        }
        service.add(services);
        return services;
    }

    public void printAll() {
        System.out.printf("%s Service:", this.getName());
        for(Service s: service) {
            System.out.println(s);
        }
    }
    public String getName() {
        return name;
    }
}
