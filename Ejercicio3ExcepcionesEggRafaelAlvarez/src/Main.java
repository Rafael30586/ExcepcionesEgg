import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar un número: "); //dividir por cero: ArithmeticException
        String n1 = entrada.next(); //numero con coma: NumberFormatException, tambien para letras
        System.out.println("Ingresar otro número: ");


        try{
            int n2 = entrada.nextInt();
            int numero1 = Integer.parseInt(n1);
            //int numero2 = Integer.parseInt(n2);

            DivisionNumero divisionNumero = new DivisionNumero(numero1,n2);

            int resultado = divisionNumero.getNumero1()/ divisionNumero.getNumero2();

            System.out.println("Resultado de la división: "+resultado);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }catch (NumberFormatException e){
            System.out.println("No se permiten letras ni números decimales");
        }catch(InputMismatchException e){
            System.out.println("No se permiten letras ni números decimales");
        }

        //System.out.println("Hello world!");
    }
}