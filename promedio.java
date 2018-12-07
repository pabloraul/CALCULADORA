package minicalculadora;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner variable=new Scanner(System.in);
		System.out.println("Ingrese cantidad de alumnos: ");
		int alumnos=variable.nextInt();
		
		for(int k=1;k<=alumnos;k++){
			System.out.println("Para alumno N° "+k+"\n");
			Scanner sed =  new Scanner(System.in);
	        int notas;
	        double nota;
	        double suma;
	        double prom=0;    
	        System.out.print("ingrese cantidad de notas:"+"\n"); //rango entre 10 y 70
	        notas = sed.nextInt();
	        
	        for(int i=1; i<= notas; i++){
	            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");

	            nota = sed.nextInt();  
	            
	            suma = 0;
	                 
	            suma = suma + nota;
	            prom= prom + suma /notas;
	             if (nota>70.0){System.out.println("error");
	             break;
	             }
	        else{System.out.println("promedio de alumno: "+k+" es "+prom+"\n" );}
	            } 
	        
		}
		
		variable.close();
		
        
	}

}


