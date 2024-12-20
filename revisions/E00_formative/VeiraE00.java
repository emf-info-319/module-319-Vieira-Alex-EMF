public class VeiraE00 {

    public final static int NOMBRE_PTS_VICTOIRE = 3;

    public static void main(String[] args) {

        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int i = 0; i < 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (10 - 1 + 1)) + 1 ;
            int scoreEquipe2 = (int) (Math.random() * (10 - 1 + 1)) + 1 ;
            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " et le resultat est : " + scoreEquipe1 + " à " + scoreEquipe2);

            if (scoreEquipe1 > scoreEquipe2) {
                System.out.println(nomEquipe1 +" à gagner !");
                nombrePointEquipe1 = nombrePointEquipe1 + NOMBRE_PTS_VICTOIRE;
            }else if (scoreEquipe1 < scoreEquipe2){
                System.out.println(nomEquipe2 +" à gagner !");
                nombrePointEquipe2 = nombrePointEquipe2 + NOMBRE_PTS_VICTOIRE;
            }else if(scoreEquipe1 == scoreEquipe2) {
                System.out.println("Match nul");
                nombrePointEquipe1 = nombrePointEquipe1 + 1;
                nombrePointEquipe2 = nombrePointEquipe2 + 1;
            }
        }
        System.out.println(nomEquipe1 + " a " + nombrePointEquipe1 + " points");
        System.out.println(nomEquipe2 + " a " + nombrePointEquipe2 + " points");
    }
}
