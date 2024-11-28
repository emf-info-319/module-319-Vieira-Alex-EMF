/**
 * ExercicesInversionTableau
 */
public class ExercicesInversionTableau {
    
    public static final int MIN = 0;
    public static final int MAX = 100;


    public static void main(String[] args) {
        int[] tableauInitial = new int[4];


        for (int i = 0; i < tableauInitial.length; i++) {
            
            int random = (int) (Math.random() * (MAX - MIN + 1 ) - MIN);

            tableauInitial[i] += random;

            System.out.println("Tableau initial ["+ i + "] = " + tableauInitial[i]);
            System.out.println("");
        }
        System.out.println("--------------------------");
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau Final ["+i+"] = "+tableauFinal[i]);
            System.out.println("");
        }
    }

    public static int[] inverseLeTableau(int[] tableauInitial){
        int[] newtab = new int[tableauInitial.length];
        

        for (int i = 0; i < newtab.length; i++) {
            newtab[ tableauInitial.length - 1 - i] = tableauInitial[i];

        }
      

        return newtab;

    }
}