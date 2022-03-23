public class Taller1 {
    public static void main(String[] args) {
        int largo=(int) (Math.random() * 20 + 1);;
        int[] arreglo = new int[largo];
        LargoArr(arreglo);
        MostarArr(arreglo);
        MultProductos(arreglo);
    }

    private static int[] MultProductos(int[] arreglo) {
        int productos=500;
        for (int i = 0; i < arreglo.length; i++){
        }
        return arreglo;
    }

    private static void MostarArr(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println(" ");

    }

    private static int[] LargoArr( int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 14 + 1);
        }
        return arreglo;
    }
}