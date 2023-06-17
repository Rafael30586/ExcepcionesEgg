import entidades.Persona;
import servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona p = null;

        try{
            System.out.println(personaServicio.esMayorDeEdad(p));

        }catch (NullPointerException e){
            System.out.println("El método falló porque el objeto era null");
        }


        //System.out.println("Hello world!");
    }
}