import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Ingrese un número para la cantidad de filas y columnas que quiere: ");
       int num_usuario = sc.nextInt();
       boolean validar ;
       char [][] matriz= new char[num_usuario][num_usuario];
       if(validar = (num_usuario >= 2 && num_usuario <= 50)){
           validar = true;
       }else if(validar = (num_usuario == 0)){
           validar = false;
       }
       do{
        System.out.println("Hola");
           num_usuario = sc.nextInt();
           if(validar = (num_usuario >= 2 && num_usuario <= 50)){
               validar = true;
           }else if(validar = (num_usuario == 0)){
               validar = false;
           }
       }while(validar = true);
    }
}