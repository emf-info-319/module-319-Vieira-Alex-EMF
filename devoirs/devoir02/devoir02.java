package devoirs.devoir02;

/**
 * devoir02
 */
public class devoir02 {

    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (8 - 0 + 1)) + 0; // Quantité totale à remplir
        System.out.println("Il y a " + remplissage + " litres à remplir");

        while (remplissage > 0 && reservoirA < CAPACITE_RESERVOIR_A) { 
            System.out.println("Remplissage Réservoir A ...");
            // Quantité à ajouter : soit toute la quantité restante, soit ce qui reste pour remplir le réservoir
            int ajout = Math.min(remplissage, CAPACITE_RESERVOIR_A - reservoirA);
            
            // Ajoute la quantité au réservoir A
            reservoirA += ajout;
            remplissage -= ajout; // Réduit la quantité restante à remplir
            
            System.out.println("Réservoir A : " + reservoirA + " Réservoir B : " + reservoirB);
            
        }
        while (remplissage > 0 && reservoirB < CAPACITE_RESERVOIR_B) { 
            // Quantité à ajouter : soit toute la quantité restante, soit ce qui reste pour remplir le réservoir
            int ajout = Math.min(remplissage, CAPACITE_RESERVOIR_B - reservoirB);

            System.out.println("Remplissage Réservoir B ...");
            
            // Ajoute la quantité au réservoir A
            reservoirB += ajout;
            remplissage -= ajout; // Réduit la quantité restante à remplir
            
            System.out.println("Réservoir A : " + reservoirA + " Réservoir B : " + reservoirB);

        
        }
        System.out.println("Remplissage Terminé ! ");
        
    }
}
