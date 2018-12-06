package minicalculadora;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sed =  new Scanner(System.in);
        int notas;
        double nota;
        double suma;
        double prom=0;    
        System.out.print("ingrese cantidad de notas:");//rango entre 10 y 70
        notas = sed.nextInt();
        
        for(int i=1; i<= notas; i++){
            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");

            nota = sed.nextInt();  
            
            suma = 0;
                 
            suma = suma + nota;
            prom= prom + suma /notas;
             if (nota>70.0){System.out.println("error");
             
             }
        else{System.out.println("promedio:"+prom );}
            } 
        
      
            
            
  }     

		

}	


