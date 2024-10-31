/**
 * ExerciceMethodeTableau
 */
public class ExerciceMethodeTableau {

    public static void main(String[] args) {
        
        tableauCreate(3);
        tablRemplis(45);
        tabRandom((int)Math.random() * (4 - 5 + 1 ));
        int[] tab1 = new int[tabtaille()];
        affichertab(tab1);



    }



    public static int[] tableauCreate(int taille){
        int[] tab1 = new int[taille];
        return tab1;
    }

    public static void tablRemplis( int tabsettings){
        int[] tab1 = new int[] {tabsettings};
    }

    public static int[] tabRandom(int random) {
        int[] tab1 = new int[] {random};
        return tab1;
    }

    public static int tabtaille(){
        int taille = 3;
        return taille;
    }

    public static void affichertab(int[] tab1){
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }
        
    }

    public static int minTab(int[] tab1){

    }
}