package TomTutorial.week10.question4;

public class Phone {
    private String name;
    private String serialNumber;
    public Phone(String name, String serialNumber) throws ValidationException {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name is not null");
        } if (serialNumber == null || serialNumber.isEmpty()) {
            throw new ValidationException("Serial number is not null");
        } if (serialNumber.length() != 16) {
            throw new ValidationException("Serial number must have 16 digits");
        }
    }
    public static void main(String[] args) throws ValidationException {
        Phone phone1 = new Phone("Khang", "0913501135801146");
        Phone phone2 = new Phone("", "0913501135801146");
        Phone phone3 = new Phone("Uyen", "");
        Phone phone4 = new Phone("Khang", "09135");

    }
}
