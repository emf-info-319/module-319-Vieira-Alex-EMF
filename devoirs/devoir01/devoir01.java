package devoirs.devoir01;

public class devoir01 {

    public static void main(String[] args) {
        
        int monAge = 30;
        int estMajeur = 18;

        System.out.println("Je m'appelle Vieira Alex");

        System.out.println("J'ai " + monAge + " ans");


        if (estMajeur > monAge) { 
            System.out.println("Je suis mineur");
            
        }else {
            System.out.println("Je suis Majeur");
        }
    }
}
