import java.util.Scanner;

public class Strings{

    public void start(){
        String[] nameParts = getNameParts();
        System.out.println("Fornavn: " + capitalize(nameParts[1]));
        System.out.println("Mellemnavn: " + capitalize(nameParts[2]));
        System.out.println("Efternavn: " + capitalize(nameParts[0]));

        String[] twoNames = {"Lupin", "Remus"};
        String aFullName = getFullName(twoNames);
        System.out.println(aFullName);

        String[] threeNames = {"Potter", "Harry", "James"};
        String aFullName2 = getFullName(threeNames);
        System.out.println(aFullName2);
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

    public String getFullName(String lastName, String firstName, String middleName){
        if (middleName == null) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }

    public String getFullName(String lastName, String firstName){
        return getFullName("Harris", "Benjamin", null);
    }

    public String getFullName(String[] nameParts){
        if (nameParts.length == 3) {
            return getFullName(nameParts[0], nameParts[1], nameParts[2]);
        } else if (nameParts.length == 2){
            return getFullName(nameParts[0], nameParts[1], null);
        } else {
            return "Indtast venligst fuldt navn!";
        }
    }

    public String capitalize(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args){
        Strings app = new Strings();
        app.start();
    }
}