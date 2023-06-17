public class Main3 {
    public static void main(String[] args){

        try{
            System.out.println(Tres.metodo()); //Ya que el método metodo() es estático es necesario invocarlo después de...
        }catch (Exception e){ //... escribir el nombre de la clase seguido por un punto
            System.err.println("Excepción en método()");
            e.printStackTrace(); //este método muestra el mensaje de la excepción aunque la hayamos atrapado
        }

    }

    class Tres{
        private static int metodo(){
            int valor=0;

            try{
                valor = valor +1;
                valor = valor + Integer.parseInt("w");
                valor = valor +1;
                System.out.println("Valor final del try: "+valor);
            }catch (NumberFormatException e){
                valor = valor + Integer.parseInt("w");
                System.out.println("Valor final del catch: "+valor);
            }finally {
                valor = valor +1;
                System.out.println("Valor final del finally: "+valor);
            }
            valor = valor +1;
            System.out.println("Valor antes del return: "+valor);
            return valor;
        }
    }
}
