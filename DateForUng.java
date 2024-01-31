import java.util.Scanner;

public class DateForUng {

  int myAge;
  int dateAge;

  public void start(){
    writeWelcome();
    getInputs();
    if(isDateOldEnough()){
      System.out.println("Din date er ikke for ung.");
    } else {
      System.out.println("Din date er for ung!");
    }
  }
  
  public void writeWelcome() {
    System.out.println("Velkommen til er din date for ung");
  }

  public void getInputs(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Indtast din alder:");

    myAge = Integer.valueOf(scanner.nextLine());

    System.out.println("Indtast din dates alder:");

    dateAge = Integer.valueOf(scanner.nextLine());
  }

  public int getMinimumAge(){
    return (myAge / 2) + 7;
  }

  public boolean isDateOlder(){
    return myAge < dateAge;
  }

  public boolean isDateOldEnough(){
    return dateAge >= getMinimumAge();
  }


  public static void main(String[] args) {
    DateForUng app = new DateForUng();
    app.start();

  }
}