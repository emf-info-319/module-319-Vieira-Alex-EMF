

public class ExerciceMethodeTableau {

    public static void main(String[] args) {
        
        tableauCreate(3);
        tablRemplis(45);
        int[] tab = new int[tabtaille()];
        affichertab(tab);



    }



    public static int[] tableauCreate(int taille){
        int[] tab = new int[taille];
        return tab;
    }

    public static void tablRemplis( int tabsettings){
        int[] tab = new int[] {tabsettings};
    }

    public static int[] tabRandom(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int random = (int) (Math.random() * (5 - 1 +1)) +1;
            tab[i] = random;
        }
        return tab;
    }

    public static int tabtaille(){
        int taille = 3;
        return taille;
    }

    public static void affichertab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        
    }

    public static int mintab(int[] tab){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
        
    }
    public static int maxtab(int[] tab){

        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    public static  int nbfoisvaleurtab(int[] tab, int valeur){
        int nbFois = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                nbFois++;
            }
        }
        return nbFois;
    }

    public static int sommeTab(int[] tab){
        int somme = 0;

        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        return somme;
    }

    public static double calculerMoyenneTableau(int[] tab){
        int somme = 0;
        double moyenne = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        moyenne = (double) somme / tab.length;

        return moyenne;
    }



    public static void Remplacer(int[] tab, int valeurToSeach, int Replace){
        for (int i = 0; i < tab.length; i++) {
            if (valeurToSeach==tab[i]) {
                tab[i] = Replace;
            }
        }

    }



    public static int PremiereOcurrence(int[] tab, int valeurToSeach){
        int index = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurToSeach) {
                index=i;
                break;
            }
        }

        return index;
    }


    public static int rechercherDernierOccurence(int[] tab, int valeurToSeach){
        int index = -1;
        for (int i = tab.length; i >= 0; i--) {
            if (tab[i] == valeurToSeach) {
                index=i;
                break;
            }
        }
        return index;
    }


    
}