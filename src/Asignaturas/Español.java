package Asignaturas;
import java.util.Scanner;
public class Español {
    Scanner entrada = new Scanner(System.in);
    EspañolMain op = new EspañolMain();
    Empezar2 op1 = new Empezar2();
    //Calificacion
    int cal;
    int cal2;
    int cal3;
    int cal4;
    int cal5;
    // Guia
    public void GuiaP(){
        System.out.print("//////////////////// ESPAÑOL ////////////////////"+"\nBienvenido a Español, el tema principal seran los sinonimos y antonimos");        
    }
    public void GuiaP2(){
        System.out.print("\n/// EXPLICACION ///"+"\nTodas las palabras tienen sinonimos y antonimos, los sinonimos palabras que tienen el mismo significado que otra u otras palabras o expresiones, por otro lado los antonimos funcionan al reves, los antonimos son palabras con un significado opuesto o inverso al de otra palabra");        
    }
    public void GuiaP3(){
        System.out.print("\n///EJEMPLO///"+"\nA continuacion veremos una lista de verbos, con su version normal, sinonimo y antonimo en ese orden respectivamente, debera aprender los mas que pueda para la solucion del examen:"+"\nFlojo = Debil - Fuerte"+"\nFacil = Sencillo - Dificil"+"\nBonito = Hermoso - Horrrible"+"\nGuapo = Bello - Feo"+"\nProblema = Dificultad - Solucion"+"\nGritar = Chillar - Callar"+"\nBarato = Economico - Caro"+"\nTristeza = Pena - Alegria"+"\nMorir = Fallecer - Vivir"+"\nMentira = Engaño - Verdad"+"\nComprar = Adquirir - Vender");        
    }
    // Examen
    public void ExamenGuia(){
        System.out.print("\n//////////EXAMEN//////////"+"\nPara la solucion del examen, escriba la respuesta luego de que se le hagan las preguntas, por cada pregunta correcta ganara 10 puntos, y para pasar el examen, debe obtener como minimo 30 puntos de las 5 preguntas(Recuerda escribir las palabras en minuscula para que sean validas)");
    }
    public void Examen1P1(){
        System.out.print("\n¿Cual es el antonimo de facil?"+"\n");
        String R1 = entrada.next();
        if ("dificil".equals(R1)){
            cal= 10;
            
            System.out.print("¡Correcto! - Puntuacion: "+cal);
        }
        else{            
            cal = 0;
            System.out.println("Incorrecto, el antonimo de facil era ( Dificil ) - Puntuacion: "+cal);
        }
    }
    public void Examen1P2(){
        System.out.print("\n¿Cual es el sinonimo de morir?"+"\n");
        String R2 = entrada.next();
        if ("fallecer".equals(R2)){
            cal2 = cal+10;
            System.out.print("¡Correcto! - Puntuacion: "+cal2);      
        }
        else{
            cal2 = cal;
            System.out.println("Incorrecto, el sinonimo de morir era ( Fallecer )  - Puntuacion: "+cal2);
        }    
    }
    public void Examen1P3(){
        System.out.print("\n¿Cual es el antonimo de Barato?"+"\n");
        String R3 = entrada.next();
        if ("caro".equals(R3)){
            cal3 = cal2+10;
            System.out.print("¡Correcto! - Puntuacion: "+cal3);            
        }
        else{
            cal3 = cal2;
            System.out.println("Incorrecto, el antonimo de barato era ( Caro ) - Puntuacion: "+cal3);
        }
    }
    public void Examen1P4(){
        System.out.print("\n¿Cual es el sinonimo de Flojo?"+"\n"); 
        String R4 = entrada.next();
        if ("debil".equals(R4)){
            cal4 = cal3+10;
            System.out.println("¡Correcto! - Puntuacion: "+cal4);
        }
        else{
            cal4 = cal3;
            System.out.println("Incorrecto, el sinonimo de Flojo era ( Debil ) - Puntuacion: "+cal4);
        }
    }
    public void Examen1P5(){
        System.out.print("\n¿Cual es el antonimo de Comprar?"+"\n"); 
        String R5 = entrada.next();
        if ("vender".equals(R5)){
            cal5 = cal4+10;
            System.out.println("¡Correcto! - Puntuacion: "+cal5);
        }
        else{
            cal5 = cal4;
            System.out.println("Incorrecto, el antonimo de Comprar era ( Vender ) - Puntuacion: "+cal5);
        }
    }
    public void Examen1Resultado(){
        System.out.println("\nTermino el examen, para pasar debes tener una puntuacion minima de 30, y tu puntuacion fue: "+cal5);
        if (cal5 >= 30){
            System.out.println("¡Felicidades, pasaste el examen!");
            System.out.println("\nVolveras al menu para continuar");
            op1.inicio();
        }
        else{
            System.out.println("Debes volver a intentarlo, buena suerte para la proxima");
            op.IniciarEspañol();
        }
    }   
}
