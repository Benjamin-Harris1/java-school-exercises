import java.util.Scanner;

public class Strings{

    public void start(){
        String[] nameParts = getNameParts();
        System.out.println("Fornavn: " + nameParts[1]);
        System.out.println("Mellemnavn: " + nameParts[2]);
        System.out.println("Efternavn: " + nameParts[0]);
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

    public static void main(String[] args){
        Strings app = new Strings();
        app.start();
    }
}