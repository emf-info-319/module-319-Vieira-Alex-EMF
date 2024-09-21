public class ExerciceTableaux2 {


    public final static int Max = 6;
    public final static int Min = 1;

    public static void main(String[] args) {
        
        
 
       int[] tab; tab = new int[10] ;




        for(int i = 0 ; i< tab.length; i++) {
            int valeurrandom = (int) (Math.random() * (Max - Min + 1 )) + Min;
            tab[i] = valeurrandom;
            System.out.println("Cellule "+ i + " : " +tab[i]);
        }


    }
    
}
