import java.util.Scanner;
public class Prueba {
    public static void main(String[] args){
        int[] arreglo= new int[8];
        llenarRut(arreglo);
        mostrarArr(arreglo);
        invertir(arreglo);
        multArr(arreglo);
        sumarArr(arreglo);
    }

    private static int sumarArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        int div = sum / 11;
        int mul = div*11;
        int res = sum - mul;
        int total = 11 - res;
        System.out.println("su digito verificador es: "+ total);
        if(total ==10) {
            System.out.println("su verdadero dijito verificador es: k");
        }else if(total==11){
            System.out.println("su verdadero dijito verificador es 0");
        }
        return sum;
    }

    private static int[] multArr(int[] arreglo) {
        int mul = 2;
        for (int i = 0; i < arreglo.length; i++) {
            if(mul==8){
                mul=2;
            }
            arreglo[i] *= mul;
            mul++;
        }
        return arreglo;
    }
    public static void invertir(int[] arreglo) {
        int num;
        for (int i = 0; i < arreglo.length / 2; i++) {
            num = arreglo[i];
            int indiceContrario = arreglo.length - i - 1;
            arreglo[i] = arreglo[indiceContrario];
            arreglo[indiceContrario] = num;
        }

    }


    private static void mostrarArr(int[] arreglo) {

        for(int i=0;i< arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }

    private static int[] llenarRut(int[] arreglo) {
        Scanner leer= new Scanner(System.in);

        for(int i=0;i<arreglo.length;i++) {
            System.out.println("ingrese el digito numero "+( i+1 )+" de su rut");
            arreglo[i]=leer.nextInt();
        }
        return arreglo;
    }
}
