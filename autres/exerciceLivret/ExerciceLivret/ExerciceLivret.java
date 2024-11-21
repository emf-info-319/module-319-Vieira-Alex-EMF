
/**
 * ExerciceLivret
 */
public class ExerciceLivret {


    public static final int MIN = 5;
    public static final int MAX = 20;

    public static void main(String[] args) {

        int a = choisirNombre();
        int b = choisirNombre();

        System.out.println("Premier chiffre choisi : " + a + "\nDeuxième chiffre choisi : " + b);
        String[] tab = construireTableMultiplication(a, b);

        
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        



    }


    public static int choisirNombre() {
        
        int random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        return random;
    }


    public static String[] construireTableMultiplication(int valeur1 ,int valeur2) {

        String[] tab = new String[valeur1 * valeur2];

        int a = 1;
        int b = 1;

        for(int i = 0; i < tab.length; i++) {
            do{
            tab[i] = a +  " X " + b + " = " + (a * b);
            }while (b != valeur2);
            if (b == valeur2) {
                a++;
                b = 1;
                break;

            }
            b++;
            break;
            

            
                        
        }

        return tab;
    }

}