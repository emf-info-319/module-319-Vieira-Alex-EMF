import java.util.Scanner;

/**
 * Binaire
 */
public class Binaire {

    public static void main(String[] args) {


        
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Veuillez entrer un nombre décimal : "); 

        int nombreDecimal = scanner.nextInt(); 

        if (nombreDecimal > "F") {
            
            System.out.println("Valeur Incorrect ! ");
        }

        String binaire = Integer.toBinaryString(nombreDecimal);
        String hexa = Integer.toHexString(nombreDecimal);
        System.out.println("Voici la valeur en Hexa " + hexa);
        System.out.println("Voici la valeur en Binaire " + binaire);


    }
}


