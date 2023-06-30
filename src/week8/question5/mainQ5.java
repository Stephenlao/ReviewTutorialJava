package week8.question5;

import java.util.*;
import java.io.*;
public class mainQ5 {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("src/week8/question5/vietnam-temperature-from-1901-2015.csv"));
        double sumTemperature = 0;
        double countTemperature = 0;
        double coldestTemperature = Double.MAX_VALUE;
        double hottestTemperature = Double.MIN_VALUE;
        int coldestMonth = 0;
        int coldestYear = 0;
        int hottestMonth = 0;
        int hottestYear = 0;
        if (fileScanner.hasNextLine()) {
            fileScanner.nextLine();
        }
        while (fileScanner.hasNext()) {
            StringTokenizer fileTokenizer = new StringTokenizer(fileScanner.nextLine(),",");
            // when using "Stringtokenizer" should check tokens seperated by commas (ex: temperature, year, month and country)
            // if you do not have line 16 errors appear
            if (fileTokenizer.countTokens() >= 4) {
                double temperature = Double.parseDouble(fileTokenizer.nextToken());
                sumTemperature += temperature;
                countTemperature ++;
                int year = Integer.parseInt(fileTokenizer.nextToken());
                int month = Integer.parseInt(fileTokenizer.nextToken());
                String country = fileTokenizer.nextToken();

                if(coldestTemperature > temperature) {
                    coldestTemperature = temperature;
                    coldestMonth = month;
                    coldestYear = year;
                }
                if(hottestTemperature < temperature) {
                    hottestTemperature = temperature;
                    hottestMonth = month;
                    hottestYear = year;
                }
            }
        }
        if (countTemperature > 0) {
            double averageTemperature = sumTemperature / countTemperature;
            System.out.printf("Average temperature: %.2f\n",averageTemperature);
            System.out.printf("Coldest temperature: %.2f in month %d year %d\n", coldestTemperature,coldestMonth,coldestYear);
            System.out.printf("Hottest temperature: %.2f in month %d year %d",hottestTemperature,hottestMonth,hottestYear);
        } else {
            System.out.println("There is no temperature input");
        }
        fileScanner.close();
    }
}
