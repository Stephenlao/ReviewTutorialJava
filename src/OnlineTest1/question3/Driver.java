package OnlineTest1.question3;

public class Driver {
    private String name;
    private double wallet;
    private Service service;

    public Driver(String name) {
        this.name = name;
        this.wallet = 0;
    }
    public Driver(String name,double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public void Accept(Service service) {
        service.setStatus("Delivering");
        System.out.printf("The driver %s has accepted the delivery and is currently delivering it!\n",this.name);
        this.service = service;
    }
    public void Complete() {
        this.service.setStatus("Delivered");
        System.out.printf("The driver %s has completed the delivery!\n",this.name);
        this.wallet += service.calculateDistance();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

}
