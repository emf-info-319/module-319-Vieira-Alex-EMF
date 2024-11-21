package exercices.exercice12;

public class ExerciceString {
    public static void main(String[] args) {
        String maChainedeCaractere = "Voici du contenu stocker dans un String";

        System.out.println("Nombre de caractère contenu dans la variable maChainedeCaractere " + maChainedeCaractere.length());
        System.out.println("le mot contenue commence à la position : "+ maChainedeCaractere.indexOf("contenu"));
        System.out.println("La position 17 contient la lettre : "+maChainedeCaractere.charAt(17));


/// Mettre le texte en majuscule

        String monPrenom = "Alex".toUpperCase();

        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        
        if (monPrenom.contains("test")) {
            System.out.println(monPrenom + "contient le texte test");
        }else{
            System.out.println(monPrenom +  " ne contient pas le texte \"test\"");
        }
        


        monPrenom.isEmpty()

        monPrenom.equals(monPrenom)


    }
}
