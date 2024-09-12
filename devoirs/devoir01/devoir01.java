package devoirs.devoir01;

public class devoir01 {

    public static void main(String[] args) {

        int monAge = 30;
        boolean estMajeur;

        System.out.println("Je m'appelle Vieira Alex");

        System.out.println("J'ai " + monAge + " ans");

        if (monAge >= 20) {
            estMajeur = true;

        } else {
            estMajeur = false;
        }
        if (estMajeur) {
            System.out.println("Je suis Majeur");
        } else {
            System.out.println("Je suis Mineur");
        }
    }
}
