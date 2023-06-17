package servicios;
import entidades.Persona;

import java.util.Scanner;


    import java.util.Scanner;

    public class PersonaServicio {

        private Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        public boolean esMayorDeEdad(Persona persona){
            if(persona.getEdad()>=18){
                return true;
            }else{
                return false;
            }
        }

        public Persona crearPersona(){
            System.out.println("Nombre: ");
            String nombre = entrada.next();
            System.out.println("Edad: ");
            int edad = entrada.nextInt();
            System.out.println("Sexo");
            char sexo = entrada.next().charAt(0);
            System.out.println("Peso: ");
            int peso = entrada.nextInt();
            System.out.println("Altura: ");
            double altura = entrada.nextDouble();

            if(sexo!='H' && sexo!='M' && sexo!='O'){
                System.out.println("Sexo incorrecto");
                System.out.println("Devolviendo persona con datos vacios...");
                return new Persona();
            }else{
                return new Persona(nombre,edad,sexo,peso,altura);
            }
        }

        public int calcularIMC(Persona persona){
            int peso = persona.getPeso();
            double altura = persona.getAltura();
            if((peso/altura*altura)<20){
                return -1;
            }
            else if((peso/altura*altura)>=20 && (peso/altura*altura)<=25){
                return 0;
            }
            else if((peso/altura*altura)>25){
                return 1;
            }else{
                System.out.println("Alguno de los valores es incorrecto");
                return 119329;
            }

        }
    }

