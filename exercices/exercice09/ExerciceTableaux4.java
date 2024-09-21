public class ExerciceTableaux4 {

    public final static int Max = 100;
    public final static int Min = 0;

    public static void main(String[] args) {

        int[] tab;
        tab = new int[5];
        int start = (int) (Math.random() * (Max - Min + 1)) + Min;
        System.out.println("Nombre de départ" + start);
        
        for (int i = 0; i < tab.length; i++) {
            start++;

            System.out.println("Cellule " + i + " : " + start);

        }

    }
}
