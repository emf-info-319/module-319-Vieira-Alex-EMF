/**
 * Methodes
 */
public class Methodes {

    public static void main(String[] args) {
        direBonjour();
        dire(args);
        Math();

    }

    public static void direBonjour() {
        System.out.println("Bonjour ! ");
    }

    public static void dire(String[] args) {
        System.out.println("J'ai comme paramètre 'String' !");
    }

    public static void Math() {
        int min = Math.min(1, 2);// Le minimum entre des valeurs

        int max = Math.max(15, 2); // Le maximum entre des valeurs

        int pow = (int) Math.pow(4, 5);// La puissance
         

        int sqrt = (int) Math.sqrt(15);// La racine cubique
        

        int abs = (int) Math.abs(12); // Donne la valeur en positif
        
    }
}