import java.util.Random;
import java.util.Scanner;

/**
 * devoir05
 */
public class devoir05 {
    public final static int LimiteSupComprise = 100;
    public final static int LimiteInfComprise = 1;
    public static void main(String[] args) {
        //int nbre = (int) (Math.random() * (LimiteSupComprise - LimiteInfComprise + 1)) + LimiteInfComprise;
        // On crée un scanner pour lire sur la ligne de commande les touches pressées


        String[] joke = new String[] {"Pfff" , "Je te croyais meilleur que ça" , "T'es trop nul" , "Au le naz" ," Meme Marine le Pen est meilleur"};

        for (int i = 0; i < joke.length; i++) {
            
        
        int valeur;

        do{
            Scanner scanner = new Scanner( System.in );
            // Voici comment lire un entier depuis la console
                System.out.print( "Entrez une valeur svp (entre 1 - 100): " );
             valeur = scanner.nextInt();
            scanner.nextLine(); // pour ignorer la touche RETURN
            // On continue à utiliser le scanner dans le programme…
            if (nbre < valeur ) {
                System.out.println("Trop Grand ! T'es trop null ");
            }else if (nbre > valeur ) {
                System.out.println("Trop Petit ! Je te croyais meilleur que ça ");
            }else {
                System.out.println("Bravo, trouvé ! Enfin ");
            }
            if (nbre == valeur) {
                scanner.close();
            }
        }while(nbre != valeur);}
        // On referme le scanner à la fin du programme
        
        
        
    }
}