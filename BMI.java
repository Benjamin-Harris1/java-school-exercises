import java.util.Scanner;

public class BMI{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til BMI-beregneren");
        System.out.println("Indtast din vægt i kg:");

        int vægt = Integer.valueOf(scanner.nextLine());

        System.out.println("Indtast din højde i meter:");

        double højde = Double.valueOf(scanner.nextLine());

        double bmi = (double)vægt / (højde * højde);

        String vægtniveau;
        if(bmi < 18.5){
            vægtniveau = "undervægtig";
        } else if (bmi >= 18.5 && bmi < 25){
            vægtniveau = "normalvægtig";
        } else if (bmi >= 25 && bmi < 30) {
            vægtniveau = "overvægtig";
        } else {
            vægtniveau = "svært overvægtig";
        }

        System.out.println("Du har en BMI på " + bmi);
        System.out.println("Du er " + vægtniveau);
        
        
    }
}