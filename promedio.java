package minicalculadora;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sed =  new Scanner(System.in);
        int notas;
        
        System.out.print("ingrese cantidad de notas:");
        notas = sed.nextInt();
        
        for(int i=1; i<= notas; i++){
            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");

            int nota = sed.nextInt();  
           
            int suma = 0;
            int prom = 0;         
            suma = suma + i;
            prom= prom + suma /notas;
             if (suma<70){System.out.println("error");
             break;}
        else{System.out.println("promedio:"+prom );}
            } 
        
      
            
  }     

		

}	


