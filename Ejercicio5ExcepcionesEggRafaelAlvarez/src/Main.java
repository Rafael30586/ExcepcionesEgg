import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroAdivinar = (int)(Math.random()*500);
        System.out.println("Numero escondido: "+numeroAdivinar);
        String numeroJugador = "";
        int intentos = 0;
        boolean acerto = false;
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        do{
            System.out.println("Adivine el número (de 0 a 500)");
            numeroJugador = entrada.next();
            try{
                if(numeroAdivinar==Integer.parseInt(numeroJugador)){
                    acerto = true;
                }else if(numeroAdivinar>Integer.parseInt(numeroJugador)){
                    System.out.println("El número desconocido es mayor que el introducido");
                }else{
                    System.out.println("El número desconocido es menor que el introducido");
                }
            }catch(Exception e){
                System.out.println("No se puede ingresar letras");

            }finally{
                intentos++;
            }
        }while(!acerto);

        System.out.println("Ganaste");
        System.out.println("Número de intentos: "+intentos);

        //System.out.println("Hello world!");
    }

}