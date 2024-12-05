/**
 * TournoiVieiraAlex
 */
public class TournoiVieiraAlex {

    public final static String[] EQUIPES = new String[] {"FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF", "Etoile Sport"};
    public final static int MAX_GOALS = 10;
    public static int[] pointEquipes;

    public static void main(String[] args) {
        pointEquipes = new int[EQUIPES.length];


        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println(EQUIPES[i] + "  " +pointEquipes[i] + " pts");
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < EQUIPES.length; i++) {

            if ( i == (EQUIPES.length - 1)) {
                simuleMatch(i, i - EQUIPES.length);
            }
            simuleMatch(i,i++);
        }

        System.out.println("---------------------------------");


        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println(EQUIPES[i] + "  " +pointEquipes[i] + " pts");
        }
        
    }

    public static void simuleMatch(int index1, int index2){

        int score_equipe1 = (int) (Math.random() * (MAX_GOALS - 0 + 1 ) - 0);
        int score_equipe2 = (int) (Math.random() * (MAX_GOALS - 0 + 1 ) - 0);

        System.out.println(EQUIPES[index1] + " vs " + EQUIPES[index2] + "\nResultat : " + score_equipe1 + ":" + score_equipe2);





        if (score_equipe1 > score_equipe2) {
            pointEquipes[index1] =+ 3;
        } else if (score_equipe1 < score_equipe2) {
            pointEquipes[index2] =+ 3;
        } else if ( score_equipe1 == score_equipe2 ){
            pointEquipes[index1] =+ 1;
            pointEquipes[index2] =+ 1;
        } else if (index1 == index2) {
            pointEquipes[index1] =+ 0;
            pointEquipes[index2] =+ 0;
        } 

        


    }


    public static void maxpoint(){
        int nombre = 0;


        for (int i = 0; i < EQUIPES.length; i++) {
            if (nombre < pointEquipes) {
                
            }
        }
    }
}