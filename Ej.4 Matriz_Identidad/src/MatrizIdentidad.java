import java.util.Scanner; // Importamos Scanner para entrada

public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_usuario;

        do {
            // Validar tamaño válido o fin con 0
            do {
                System.out.println("Introduce el tamaño de la matriz (2-50), o 0 para terminar:");
                num_usuario = sc.nextInt();
                if (num_usuario == 0) break;
                if (num_usuario < 2 || num_usuario > 50) {
                    System.out.println("Por favor, introduce un valor entre 2 y 50.");
                }
            } while (num_usuario < 2 || num_usuario > 50);

            if (num_usuario == 0) break;
            int[][] matriz = new int[num_usuario][num_usuario];
            // Leer valores con validación de rango y asignar
            for (int i = 0; i < num_usuario; i++) {
                for (int j = 0; j < num_usuario; j++) {
                    int valor;
                    do {
                        System.out.println("Introduce un valor entre -1000 y 1000 para posición [" + i + "][" + j + "]:");
                        valor = sc.nextInt();
                        if (valor < -1000 || valor > 1000) {
                            System.out.println("Valor fuera de rango, intenta de nuevo.");
                        }
                    } while (valor < -1000 || valor > 1000);
                    matriz[i][j] = valor;
                }
            }
            // Mostrar matriz completa en formato tabla
            System.out.println("Matriz introducida:");
            imprimirMatriz(matriz, num_usuario);

            // Verificar si matriz es identidad
            if (esIdentidad(matriz, num_usuario)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } while (true);
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] );
            }
            System.out.println();
        }
    }

    // Método para verificar que es una identidad
    public static boolean esIdentidad(int[][] matriz, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}