import java.util.Scanner;

public class PersonerMedAlder{

    private String[] navne;
    private int[] aldre;

    public void start(){
        writeWelcome();
        getInputs();
        calculateAndPrintResults();
    }

    public void writeWelcome(){
        System.out.println("Velkommen, lad os beregne gennemsnitsalderen af en række personer!");
    }

    public void getInputs(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange personer har du?");
        int antal = Integer.valueOf(scanner.nextLine());
        aldre = new int[antal];
        navne = new String[antal];

        for (int i = 0; i < antal; i++){
            System.out.println("Indtast navn for person: ");
            navne[i] = scanner.nextLine();
            System.out.println("Indtast alder for " + navne[i] + ": ");
            aldre[i] = Integer.valueOf(scanner.nextLine());
        }
    }

    public void calculateAndPrintResults(){
        int sum = 0;
        for (int alder : aldre){
            sum += alder;
        }
        double gennemsnit = (double) sum / aldre.length;
        String formattedGennemsnit = String.format("%.2f", gennemsnit);

        System.out.println("Total alderen er: " + sum);
        System.out.println("Gennemsnitsalderen er: " + formattedGennemsnit);
    }

    public static void main(String[] args){
        PersonerMedAlder app = new PersonerMedAlder();
        app.start();
    }
}