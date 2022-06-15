package Asignaturas;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        MatematicasMain iniciar = new MatematicasMain(); 
        InglesMain iniciar2 = new InglesMain();
        EspañolMain iniciar3 = new EspañolMain();
        Empezar inicio = new Empezar();
        System.out.println("///////////////MENU///////////////"+"\nBienvenid@ a School Tests!, ¿Cual materia deseas iniciar?: "+"\nMatematicas - Ingles - Lenguaje"+"\n");
        String m1 = entrada.next();        
        if("Matematicas".equals(m1)){
             iniciar.IniciarMatematicas();
        }else if("matematicas".equals(m1)){
             iniciar.IniciarMatematicas();
        }else if("Ingles".equals(m1)){
             iniciar2.IniciarIngles();
        }else if("ingles".equals(m1)){
             iniciar2.IniciarIngles();       
        }else if("Lenguaje".equals(m1)){
             iniciar3.IniciarEspañol();       
        }else if("lenguaje".equals(m1)){ 
             iniciar3.IniciarEspañol();
        }else{
             inicio.inicio();                           
        }       
    }  
}
