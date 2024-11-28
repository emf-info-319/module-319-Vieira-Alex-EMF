/**
 * ExerciceTableaux3
 */
public class ExerciceTableaux3 {
    public final static int Max = 6;
    public final static int Min = 1;

    public static void main(String[] args) {
        int[] tab;
        tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            int valeurrandom = (int) (Math.random() * (Max - Min + 1)) + Min;
            tab[i] = valeurrandom;
            System.out.println("Elèves " + i + " : " + tab[i]);

        }

        int valeurCellule = 0;
        for (int i = 0; i < tab.length; i++) {
            valeurCellule = valeurCellule + tab[i];
            System.out.println("Note élèves " + (i + 1) + " : " + tab[i]);
        }

        float moyendenote = valeurCellule / tab.length;
        System.out.println(" Moyennes de classe : " + moyendenote);

    }

}
