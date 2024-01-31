import java.util.Scanner;

public class Hvadhedderdu {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hvad hedder du?");

    String name = scanner.nextLine();

    System.out.println("Hej " + name + ", hvor gammel er du?");

    String age = scanner.nextLine();

    int year = 2024;

    System.out.println("Okay, så må du være født i " + (year - Integer.valueOf(age)-1) + ", medmindre du allerede har haft fødselsdag i år");
  }
}