import java.util.Scanner;

public class Strings{

    public void start(){
        String[] nameParts = getNameParts();
        System.out.println("Fornavn: " + nameParts[1]);
        System.out.println("Mellemnavn: " + nameParts[2]);
        System.out.println("Efternavn: " + nameParts[0]);

        getFullName(nameParts);
    }

    public String[] getNameParts(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast venligst dit navn:");

        String fullName = scanner.nextLine();

        String fornavn = fullName.substring(0, fullName.indexOf(" "));
        String efternavn = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String mellemnavn = null;

        if (fullName.indexOf(" ") != fullName.lastIndexOf(" ")) {
            mellemnavn = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        }

        return new String[] {efternavn, fornavn, mellemnavn};
    }

    public void getFullName(String lastName, String firstName, String middleName){
        if (middleName == null) {
            System.out.println(firstName + " " + lastName);
        } else {
            System.out.println(firstName + " " + middleName + " " + lastName);
        }
    }

    public void getFullName(String lastName, String firstName){
        getFullName("Harris", "Benjamin", null);
    }

    public void getFullName(String[] nameParts){
        getFullName(nameParts[0], nameParts[1], nameParts[2]);
    }

    public static void main(String[] args){
        Strings app = new Strings();
        app.start();
    }
}