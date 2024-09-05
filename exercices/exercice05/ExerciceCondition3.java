package exercices.exercice05;

public class ExerciceCondition3 {
    public static void main(String[] args) {
        int valeur1 = 23;
        int valeur2 = -42;


        if ((valeur1 > 0) && (valeur2 > 0)) {
            System.out.println("La valeur 1 est positive");
        }else if ((valeur1 < 0) && (valeur2 < 0)) {
            System.out.println("La valeur 1 est négative");
        }

    }
}
