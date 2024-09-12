package exercices.exercice08.ExercicesBoucles1;

/**
 * ExercicesBoucles1
 */
public class ExercicesBoucles1 {

    public static void main(String[] args) {
        

        // Boucle for
        for (int i = 1; i<=5; i++){
                System.out.println("Boucle for, iteraction " + i);
            }
            int i = 1;

        // Boucle while
        while (i<=5) {
            System.out.println("Boucle while, itération " + i);
            ++i;
        }
        // Boucle do while
        int l = 1;
        do {
            System.out.println("Boucle do-while, itéraction " + l);
            l++;
        } while (l <= 5);
        // Boucle en sautant un chiffre
        for (int x = 1; x<=5; x++){
            if (x == 3) {
                continue;
            }
            System.out.println("Boucle for, iteraction " + x);
        }
        int y = 1;

        // Boucle en stoppant au 3
        while (y<=5) {
            if (y == 4) {
                break;
            }
            System.out.println("Boucle while, itération " + y);
            ++y;
            
        }
    }
}