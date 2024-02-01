import java.util.Scanner;

public class GennemSnitsBeregner{

    private double[] numre;

    public void start(){
        writeWelcome();
        getInputs();
        calculateAndPrintResults();
    }

    public void writeWelcome(){
        System.out.println("Velkommen, lad os beregne gennemsnittet af et antal numre!");
    }

    public void getInputs(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange numre har du?");
        int antal = Integer.valueOf(scanner.nextLine());
        numre = new double[antal];

        for (int i = 0; i < antal; i++){
        System.out.println("Indtast venligst en række numre");
        numre[i] = Double.valueOf(scanner.nextLine());      
        }
    }

    public void calculateAndPrintResults(){
        double sum = 0;
        for (double nummer : numre){
            sum += nummer;
        }
        double gennemsnit = sum / numre.length;

        System.out.println("Totalen er: " + sum);
        System.out.println("Gennemsnittet er: " + gennemsnit);
    }

    public static void main(String[] args){
       GennemSnitsBeregner app = new GennemSnitsBeregner();
       app.start();
    }
}