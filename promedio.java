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
	        
	        System.out.println("¿Desea ponderar las notas?");
	        
	        System.out.println("(1)Si");
	        
	        System.out.println("(2)No");
	        int p=variable.nextInt();
	        
	        if(p==2) {
	       
	        
	        for(int i=1; i<= notas; i++){
	            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
	            
	            nota = sed.nextInt();  
	            
	            suma = 0;
	                 
	            suma = suma + nota;
	            prom= prom + suma /notas;
	             if (nota>70.0){System.out.println("error");
	             break;
	             }
	        else{System.out.println("promedio de alumno "+k+": es "+prom+"\n" );}
	            } 
	        }
	        if(p==1) {
	        	for( int s=1;s<=notas;s++) {
	        		System.out.println("ingrese nota "+s+" de "+notas);
	        		int n=variable.nextInt();
	        		System.out.println("Indique ponderacion nota "+s);	        		
	        		double ponderacion = 0;
	        		ponderacion=variable.nextDouble();
	        			        		
	        		double ponderado = n*(ponderacion/100);	
	        		
	        	}	        	
	        }
			}
			
		
		variable.close();
		
	}

}

