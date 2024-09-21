
/**
 * devoir03
 */
public class devoir03 {



    public final static int DayMax = 31;
    public final static int DayMin = 1;

    public final static int MonthMax = 12;
    public final static int MonthMin = 1;

    public final static int YearMax = 2024;
    public final static int YearMin = 1;


// Bloquage



    public static void main(String[] args) {
        int calendrier = 365;
        int day ;
        int month ;
        int year;

        day = (int) (Math.random() * ( DayMax - DayMin + 1)) - DayMin;

        month = (int) (Math.random() * ( MonthMax - MonthMin + 1)) - MonthMin;

        year = (int) (Math.random() * ( YearMax - YearMin + 1)) - YearMin;

        System.out.println(day + "/" + month);
        if (month > 1) {
            day *= month;
            System.out.println(day);
        }


        

        




    

        
        


    }
}