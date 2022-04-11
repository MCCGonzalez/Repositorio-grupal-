import java.util.Scanner;

public class ValidarDigitoV {
    public static void main(String[] args) {
        int p = 0;
        int[] arr = new int[8];
        int[] Digitoverificador = new int[p];
        llenarArreglo(arr, Digitoverificador);
        mostrarArreglo(arr);
        voltearArreglo(arr);
        multiplicarArreglo(arr);
        suamrArreglo(arr, Digitoverificador, p);
    }

    private static int suamrArreglo(int[] arr, int[] Digitoverificador, int p) {
        Scanner leer = new Scanner(System.in);
        p = leer.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int div = sum / 11;
        int mul = div * 11;
        int res = sum - mul;
        int total = 11 - res;
        if (total == p) {
            System.out.println("verdadero");
        } else{
            System.out.println("Falso");
    }
        return sum;

}


    private static int[] multiplicarArreglo(int[] arr) {
        int mul = 2;
        for (int i = 0; i < arr.length; i++) {
            if (mul == 8) {
                mul = 2;
            }
            arr[i] *= mul;
            mul++;
        }
        return arr;
    }

    private static void voltearArreglo(int[] arr) {
        int num;
        for (int i = 0; i < arr.length / 2; i++) {
            num = arr[i];
            int indiceContrario = arr.length - i - 1;
            arr[i] = arr[indiceContrario];
            arr[indiceContrario] = num;
        }
    }

    private static void mostrarArreglo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println(" ");
    }

    private static int[] llenarArreglo(int[] arr, int[] DigitoVerificador) {

        Scanner leer = new Scanner(System.in);
        do {
            try {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("ingrese el digito numero " + (i + 1) + " de su rut");
                    arr[i] = leer.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("error, ingresa nuevamente un dato");
                leer.nextLine();
            }
        } while (true);
        for (int i = 0; i < DigitoVerificador.length; i++) {
            System.out.println("Ingrese su digito verificador " );
            DigitoVerificador[i]=leer.nextInt();
        }

        return arr;
    }
}
