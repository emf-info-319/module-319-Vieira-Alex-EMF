import java.util.Scanner;

/**
 * DaSilva_E2 - Jeu de Nim
 */
public class DaSilva_E2 {

    public static final int NOMBRE_BATONNETS = 21; 
    public static final int MIN = 1; 
    public static final int MAX = 3; 

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS]; 
        initialiserBatonnets(batonnets); 

        System.out.println("Bienvenue dans le jeu de Nim !");
        System.out.println("Règles : Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");

        Scanner scanner = new Scanner(System.in); 
        boolean tourJoueur = true; 

        while (nbBatonnetsRestants(batonnets) > 0) {
            afficherBatonnets(batonnets); 

            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner, nbBatonnetsRestants(batonnets));
                enleverBatonnets(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = Math.min(nbBatonnetsRestants(batonnets),
                        MIN + (int) (Math.random() * (MAX - MIN + 1)));
                System.out.println("L'IA a enlevé " + nbEnleveIA + " bâtonnets.");
                enleverBatonnets(batonnets, nbEnleveIA);
            }

            tourJoueur = !tourJoueur; 
        }


        if (tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet !");
            System.out.println("Vous avez perdu.");
        } else {
            System.out.println("L'IA a retiré le dernier bâtonnet !");
            System.out.println("Vous avez gagné !");
        }

        scanner.close(); 
    }


    public static void initialiserBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
    }

    public static void afficherBatonnets(int[] batonnets) {
        System.out.println();
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

  
    public static int nbBatonnetsRestants(int[] batonnets) {
        int nombre = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nombre++;
            }
        }
        return nombre;
    }


    public static void enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbEnleveMax = nbEnleve;
        for (int i = 0; i < batonnets.length && nbEnleveMax > 0; i++) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0; 
                nbEnleveMax--;
            }
        }
    }


    public static int demanderNombre(Scanner scanner, int nbRestants) {
        System.out.print("\nEntrez un nombre entre 1 et " + Math.min(MAX, nbRestants) + " : ");
        int nombre = scanner.nextInt();

        while (nombre < MIN || nombre > Math.min(MAX, nbRestants)) {
            System.out.println(
                    "Nombre invalide. Veuillez entrer un nombre entre 1 et " + Math.min(MAX, nbRestants));
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();
        }

        return nombre;
    }
}
