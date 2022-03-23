public class Taller1 {
    public static void main(String[] args) {
        int largo = (int) (Math.random()*20);
        LargoArr(largo);
    }

    private static int[] LargoArr(int largo) {

        int[] arreglo = new int[largo];
        for(int i=0;i< arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");

        return arreglo;
    }
}

