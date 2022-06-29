package Asignaturas;
import java.util.Scanner;
public class Matematicas {
    Scanner entrada = new Scanner(System.in);
    MatematicasMain op = new MatematicasMain();
    Empezar2 op1 = new Empezar2();
    //Respuestas
    int R1;
    int R2;
    int R3;
    int R4;
    int R5;
    //Calificacion
    int cal;
    int cal2;
    int cal3;
    int cal4;
    int cal5;
    // Guia
    public void GuiaP(){
        System.out.print("//////////////////// MATEMATICAS ////////////////////"+"\nBienvenido a Matematicas, el tema a emplear sera la solucion de variables");        
    }
    public void GuiaP2(){
        System.out.print("\n/// EXPLICACION ///"+"\nPara solucionar una variable, primero sera asignada a una letra, luego se deben despejar todos los demas valores pasandolos al otro lado del ( = ), al pasarlos deberan ser invertidas las operaciones que previamente estaban realizando (sumar pasa a restar, multiplicar a dividir y viceversa), finalmente cuando la variable quede sola, se debe solucionar el otro lado del (=) y ese sera el valor de la variable");        
    }
    public void GuiaP3(){
        System.out.print("\n///EJEMPLO///"+"\n¿Cual es el valor de la variable x? en: "+"\n4x-2=14"+"\nSe pasan al otro lado todos los valores excepto la variable y se va solucionando:"+"\n4x=14+2"+"\nx=16/4"+"\nFinalmente nos da como resultado:"+"\nx=4");        
    }
    // Examen
    public void ExamenGuia(){
        System.out.print("\n//////////EXAMEN//////////"+"\nPara la solucion del examen, escriba la respuesta luego de que se le hagan las preguntas, por cada pregunta correcta ganara 10 puntos, y para pasar el examen, debe obtener como minimo 30 puntos de las 5 preguntas");
    }
    public void Examen1P1(){
        System.out.print("\n¿Cual es el valor de la variable x? en: "+"\n20x-20=40"+"\n");
        R1 = entrada.nextInt();
        if (R1 == 3){
            cal= 10;
            
            System.out.print("¡Correcto! - Puntuacion: "+cal);
        }
        else{            
            cal = 0;
            System.out.println("Incorrecto, el resultado era 3 - Puntuacion: "+cal);
        }
    }
    public void Examen1P2(){
        System.out.print("\n¿Cual es el valor de la variable x? en: "+ "\n8x-2=14"+"\n");
        R2 = entrada.nextInt();
        if (R2 == 2){
            cal2 = cal+10;
            System.out.print("¡Correcto! - Puntuacion: "+cal2);      
        }
        else{
            cal2 = cal;
            System.out.println("Incorrecto, el resultado era 2 - Puntuacion: "+cal2);
        }    
    }
    public void Examen1P3(){
        System.out.print("\n¿Cual es el valor de la variable x? "+"\n5x+10=80"+"\n");
        R3 = entrada.nextInt();
        if (R3 == 14){
            cal3 = cal2+10;
            System.out.print("¡Correcto! - Puntuacion: "+cal3);            
        }
        else{
            cal3 = cal2;
            System.out.println("Incorrecto, el resultado era 14 - Puntuacion: "+cal3);
        }
    }
    public void Examen1P4(){
        System.out.print("\n¿Cual es el valor de la variable x? "+"\n10x-5x+2=52"+"\n"); 
        R4 = entrada.nextInt();
        if (R4 == 10){
            cal4 = cal3+10;
            System.out.println("¡Correcto! - Puntuacion: "+cal4);
        }
        else{
            cal4 = cal3;
            System.out.println("Incorrecto, el resultado era 10 - Puntuacion: "+cal4);
        }
    }
    public void Examen1P5(){
        System.out.print("\n¿Cual es el valor de la variable x? "+"\n8x-16=40"+"\n"); 
        R5 = entrada.nextInt();
        if (R5 == 7){
            cal5 = cal4+10;
            System.out.println("¡Correcto! - Puntuacion: "+cal5);
        }
        else{
            cal5 = cal4;
            System.out.println("Incorrecto, el resultado era 7 - Puntuacion: "+cal5);
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
            op.IniciarMatematicas();
        }
    }
}
