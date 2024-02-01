import java.util.Scanner;

public class GennemSnitsBeregner{

    public void start(){
        writeWelcome();
        getInputs();
    }

    public void writeWelcome(){
        System.out.println("Velkommen, lad os beregne gennemsnittet af et antal numre!");
    }

    public void getInputs(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange numre har du?");

        int antal = Integer.valueOf(scanner.nextLine());

        System.out.println("Indtast venligst en række numre");

        int nummer = Integer.valueOf(scanner.nextLine());        

        

    }

    public static void main(String[] args){
       GennemSnitsBeregner app = new GennemSnitsBeregner();
       app.start();
    }
}