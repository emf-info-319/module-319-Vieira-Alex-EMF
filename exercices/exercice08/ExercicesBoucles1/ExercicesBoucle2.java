package exercices.exercice08.ExercicesBoucles1;



public class ExercicesBoucle2 {
    public static void main(String[] args) {
        System.out.println("Boucle for :");

        for (int i = 5; i >= 1; --i) {

            System.out.println(i);
            if (i == 1) {
                System.out.println("Décollage !!");
            }
        }
        System.out.println("Boucle while :");
        int i = 5;
        while (i >= 1) {
            System.out.println(i);
            --i;
            if (i == 0) {
                System.out.println("Décollage !! ");
            }
        }
        System.out.println("Boucle do-while :");
        int l = 5;  
        do {
            System.out.println(l);
            l--;
            if (l == 0) {
                System.out.println("Décollage !!");
            }
        } while (l >= 1);

    }
}
