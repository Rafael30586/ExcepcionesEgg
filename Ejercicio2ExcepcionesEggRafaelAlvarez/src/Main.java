public class Main {
    public static void main(String[] args) {
        ClaseCualquiera claseCualquiera = new ClaseCualquiera();

        boolean[] arreglo = claseCualquiera.getVerdaderos();

        try{
            for(int i=0;i<=5;i++){
                arreglo[i] = true;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de rango");
        }


        //System.out.println("Hello world!");
    }
}