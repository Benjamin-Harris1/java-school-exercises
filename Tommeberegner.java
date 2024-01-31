import java.util.Scanner;

public class Tommeberegner{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast en længde i tommer:");

        double tommer = Double.valueOf(scanner.nextLine());

        double cm = tommer * 2.54;
        
        System.out.println(tommer + " tommer er " + cm + " centimeter");
    }
}