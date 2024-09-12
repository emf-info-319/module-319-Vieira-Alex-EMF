package devoirs.devoir02;

public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {

        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * ( 8 - 0 + 1 )) + 0;


        System.out.println("Il y a " + remplissage + " litres à remplir. ");
        System.out.println( "Le reservoir A a " + reservoirA + " litres" + " Le reservoir B a " + reservoirB + " litres");

        while (reservoirA < CAPACITE_RESERVOIR_A) {
            reservoirA = reservoirA + remplissage;
            System.out.println("Voici le reservoir A : " + reservoirA + " Litres");
            if (reservoirA == CAPACITE_RESERVOIR_A) {
                
                reservoirB = reservoirB + remplissage;
                System.out.println("Voici le reservoir B : " + reservoirB + " Litres");
            }
        }

    }
    
}
