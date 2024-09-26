
/**
 * devoir03
 */
public class devoir03 {

    public static void main(String[] args) {
        int day ;
        int month;
        int year ;

        day = 21;

        month = 2;

        year = 2024;

        int[] joursMois;
        joursMois = new int[]{31,28,31,31,30,31,31,30,31,30,31};
        int jourtotal = 0;

        if (year % 4 == 0 || year % 400 == 0) {
            joursMois[1] = 29;
        }
        for(int i = 0; i < month - 1; i++) {
            jourtotal = jourtotal + joursMois[i];
                        
        }
        jourtotal = jourtotal + day;
        System.out.println("Le " + day + "/" + month + "/" + year + " est le jour " + jourtotal + " de l'An");

        

        




    

        
        


    }
}