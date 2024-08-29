package exercices.exercice04;

public class EchangeValeurs {
    

  

    public static void main(String[] args) {
        
         int variable1= 1;
         int variable2=2;



         System.out.println("variable 1 = " + variable1 + ", variable 2 = " + variable2);
         System.out.println("Transcript...");

         variable1 = variable2;
         variable2 =   variable1;


         System.out.println("variable 1 = " + variable1 + ", variable 2 = " + variable2);



    }
}
