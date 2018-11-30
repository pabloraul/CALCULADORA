package minicalculadora;

import java.util.Scanner;

public class lista_acendente_descendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sec = new Scanner(System.in);
		   String can="";
	       int cont=0;
	       int a=0;
	       int b;
	       int s;
	       int k;
	       int tem;
	        System.out.println("ingresa longitud del arreglo");              
	       int c = sec.nextInt();
	       int N[]=new int[c];
	       while(cont!=c){
	      
	       System.out.println("Ingresa numero");   
	       		int num=sec.nextInt();
	       		N[cont]=num;
	      		cont++;
	       	}
	      for(b=0;b<c;b++){
	    	   can=can+" "+N[b];
	       	}
	       	
	        System.out.println(can);
	       	System.out.println("Seleccione: ");
	       	System.out.println("(1) Orden Decreciente");
	       	System.out.println("(2) Orden Creciente");
	       	s=sec.nextInt();
	       	
	      if(s==1){
	      while(a!=(c-1)){
	    	   a=0;
	    	   
	      for (k=0;k<(c-1);k++){
	    	  if(N[k]>=N[k+1]){
	    	  a=a+1;
	          }
	    	  
	      else{
	          tem=N[k];
	          N[k]=N[k+1];
	          N[k+1]=tem;         
	                 }
	               }             
	          }
	          can="";
	          
	      for(b=0;b<c;b++){
	         can=can+" "+N[b];
	         }
	      
	       System.out.println(can);       
	         }
	      
	      else{
	      while(a!=(c-1)){
	          a=0;
	          
	     for (k=0;k<(c-1);k++){
	     if(N[k]<=N[k+1]){
	          a=a+1;
	         }
	     
	     else{
	         tem=N[k];
	         N[k]=N[k+1];
	         N[k+1]=tem;
	          }
	        }  
	      }    
	         can="";
	    for(b=0;b<c;b++){
	        can=can+" "+N[b];
	   }
	   System.out.println(can);
	       }
	    }


	
	
}                                        //falta leer tipos de textos;

