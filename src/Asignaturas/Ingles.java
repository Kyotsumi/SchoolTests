package Asignaturas;
import java.util.Scanner;
public class Ingles {
    Scanner entrada = new Scanner(System.in);
    InglesMain op = new InglesMain();
    Empezar2 op1 = new Empezar2();
    //Calificacion
    int cal;
    int cal2;
    int cal3;
    int cal4;
    int cal5;
    // Guia
    public void GuiaP(){
        System.out.print("//////////////////// ENGLIS ////////////////////"+"\nWelcome to English, the main topic will be irregular verbs");        
    }
    public void GuiaP2(){
        System.out.print("\n/// EXPLANATION ///"+"\nthere are some verbs that in their simple past and past participle version have a different way of writing, unlike regular verbs, the only way is to learn them");        
    }
    public void GuiaP3(){
        System.out.print("\n///EXAMPLE///"+"\nNext you will see a short list of some irregular verbs in it's normal form, past and past participle respectively, you must learn as many as you can to solve the exam:"+"\nBe - Was - Been"+"\nBuy - Bought - Bought"+"\nCut - Cut - Cut"+"\nDo - Did - Done"+"\nDrink - Drank - Drunk"+"\nDrive - Drove - Driven"+"\nEat - Ate - Eaten"+"\nFall - Fell - Fallen"+"\nFly - Flew - Flown"+"\nGet - Got - Gotten"+"\nGo - Went - Gone"+"\nMake - Made - Made"+"\nPut - Put - Put"+"\nRun - Ran - Run"+"\nSleep - Slept - Slept"+"\nSpeak - Spoke - Spoken"+"\nWrite - Wrote - Written");        
    }
    // Examen
    public void ExamenGuia(){
        System.out.print("\n//////////TEST//////////"+"\nTo solve the exam, write the answer after the questions are asked, for each correct question you will earn 10 points, and to pass the exam, you must obtain at least 30 points from the 5 questions(remember to write the verbs in lowercase so that they can be valid)");
    }
    public void Examen1P1(){
        System.out.print("\n¿What is the past tense of ( Run )?"+"\n");
        String R1 = entrada.next(); 
        if ("ran".equals(R1)){
            cal= 10;
            
            System.out.print("¡That's right! - Score: "+cal);
        }
        else{            
            cal = 0;
            System.out.println("Wrong, the past tense of ( run ) was ( run ) - Score: "+cal);
        }
    }
    public void Examen1P2(){
        System.out.print("\n¿What is the past participle tense of ( Write )?"+"\n"); 
        String R2 = entrada.next();
        if ("written".equals(R2)){
            cal2 = cal+10;
            System.out.print("¡That's right! - Score: "+cal2);      
        }
        else{
            cal2 = cal;
            System.out.println("Wrong, the past participle tense of ( Write ) was ( Written ) - Score: "+cal2);
        }    
    }
    public void Examen1P3(){
        System.out.print("\n¿What is the past tense of ( Cut )?"+"\n");
        String R3 = entrada.next();
        if ("cut".equals(R3)){
            cal3 = cal2+10;
            System.out.print("¡That's right! - Score: "+cal3);            
        }
        else{
            cal3 = cal2;
            System.out.println("Wrong, the past tense of ( Cut ) was ( Cut ) - Score: "+cal3);
        }
    }
    public void Examen1P4(){
        System.out.print("\n¿What is the past participle tense of ( Eat )?"+"\n"); 
        String R4 = entrada.next();
        if ("eaten".equals(R4)){
            cal4 = cal3+10;
            System.out.println("¡That's right! - Score: "+cal4);
        }
        else{
            cal4 = cal3;
            System.out.println("Wrong, the past participle tense of ( Eat ) was ( Eaten ) - Score: "+cal4);
        }
    }
    public void Examen1P5(){
        System.out.print("\n¿What is the past tense of ( Fly )?"+"\n"); 
        String R5 = entrada.next();
        if ("flew".equals(R5)){
            cal5 = cal4+10;
            System.out.println("¡That's right! - Score: "+cal5);
        }
        else{
            cal5 = cal4;
            System.out.println("Wrong, the past tense of ( Fly ) was ( Flew ) - Score: "+cal5);
        }
    }
    public void Examen1Resultado(){
        System.out.println("\nYou finished the exam, to pass you must have a minimum score of 30, and your final score was: "+cal5);
        if (cal5 >= 30){
            System.out.println("¡Congratulations, you passed the exam.!");
            System.out.println("\nEl idioma volvio al español y volveras al menu para continuar");
            op1.inicio();
        }
        else{
            System.out.println("You have to try again, good luck next time");
            op.IniciarIngles();
        }
    }
}
