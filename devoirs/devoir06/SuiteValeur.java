
public class SuiteValeur {

    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {

    }

    public static int genereTableau(int min, int max, int taille) {

    }

    public static int rechercheMin(int[] tab) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;

    }

    public static int rechercheMax(int[] tab) {

        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;

    }

    public static int rechercheValeurqui(int[] tab, int valeurToSearch) {

        int index = -1;
        for (int i = tab.length; i >= 0; i--) {
            if (tab[i] == valeurToSearch) {
                index = i;
                break;
            }
        }
        return index;

    }
}
