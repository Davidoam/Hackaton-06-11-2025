import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduce tus dos números, separados por un espacio y con menos de 1000 dígitos");
            String N1 = sc.next();
            String N2 = sc.next(); //Paso ambos numeros a Strings porque si fuera "int" tendríamos mayores restricciones al poder ser hasta 1000 digitos por numero
            if (N1.equals("0") && N2.equals("0")) {
                break; //Este "if" Sirve para terminar el programa si resulta que nos dan dos numeros "0"
            }
            //Ahora preparamos las variables para sumar, necesitamos un contador de llevadas, ver si en la suma actual nos vamos a llevar una, y también variables i,j que apunten al final de cada numero.
            int ContadorLLevadas = 0;
            int LlevadaActual = 0;
            int i = N1.length()-1;
            int j = N2.length()-1;//Le resto uno porque el valor inicial es 0 y lo tiene en cuenta al contar el numero de "caracteres", entonces al restarle uno voy a la posicion final del numero
            while (i >= 0 || j >= 0 || LlevadaActual > 0) {
                int digito1 = 0;
                if(i >= 0) {
                    digito1 = Character.getNumericValue(N1.charAt(i)); //Aquí hago que el digito 1 pase de TEXTO a NUMERO

                }
                int digito2 = 0; //Lo mismo aquí
                if(j >= 0) {
                    digito2 = Character.getNumericValue(N2.charAt(j));
                }
                //Ahora sumaré digito a digito, TENIENDO EN CUENTA la llevada actual, que por defecto es 0 SIEMPRE.
                int SumaColumna = digito1 + digito2 + LlevadaActual;
                if (SumaColumna >= 10) {
                    ContadorLLevadas++;
                    LlevadaActual = 1;
                } else  {
                    LlevadaActual = 0;
                }
                i--;
                j--; //IMPORTANTE RESTAR la I y la J para asegurarnos de que ESTAMOS YENDO HACIA ATRAS, es decir, de izquierda a derecha para replicar como se suma en la vida real.
            }
            System.out.println(ContadorLLevadas);
        }
    }
}
