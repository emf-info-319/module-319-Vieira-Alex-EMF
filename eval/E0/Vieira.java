package eval.E0;
/**
 * E0Vieira
 */
public class Vieira {


    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {


        int[] notesObtenues = new int[NBRE_NOTES];





    for(int i = 0 ; i < notesObtenues.length; i++) {
        int notes = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1 )) + NOTE_MIN;
        notesObtenues[i] = notes;
        System.out.print("La note obtenue est : " + notesObtenues[i]);

        switch (notes) {
            case 6:
                System.out.println(" Très bien");
                break;
                case 5 : 
                System.out.println(" Bien");
                break;
                case 4 : 
                System.out.println(" Suffisant");
                break;
                case 3 : 
                System.out.println(" Insuffisant");
                break;
                case 2 : 
                System.out.println(" Insuffisant");
                break;
                case 1 : 
                System.out.println(" Insuffisant");
                break;

        }
    }

    int totalNote = notesObtenues[0] + notesObtenues[1] + notesObtenues[2] + notesObtenues[3] + notesObtenues[4];
    float moyenne = totalNote / NBRE_NOTES;


    System.out.println("La moyenne est de : " + moyenne);
    if (moyenne >= 4) {
        System.out.println("L'élève est promu !");
    }else {
        System.out.println("L'élève est non promu !");
    }



        

    }
}