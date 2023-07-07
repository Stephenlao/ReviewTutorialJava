package week2;

public class question6 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 100; i++) {
            /*
            (Math.random() * 10) means it will randomly
            number from 0 to 9 in decimal, then convert
            into int using (int)
             */
            int randomNumber = (int) (Math.random() * 10);
            count ++;
            System.out.print(randomNumber + " ");
            System.out.println(count);
        }
    }
}
