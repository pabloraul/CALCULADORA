package minicalculadora;

import java.util.Scanner;

public class operacionesbinarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sell=null;
	int numero;
	int exp=0;
    int digito;
    int resultado=0;
    double binario;
        Scanner sec = new Scanner(System.in);
        System.out.println("1.-: CONVERSION DEC A BINARIO"
        		     + "\n 2.-: CONVERSION BINARIO A DEC");
        sell=sec.nextLine();
        switch(sell){
       
        case("1"):
        	  System.out.println("A seleccionado DEC A BINARIO"
					  + "\n Ingrese numero:");
        numero = sec.nextInt();
        while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
        	
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
                
        }
        System.out.printf("Binario: %.0f %n", binario);
        break;
        
        case("2"):
        	
        Scanner sed=new Scanner(System.in);
        System.out.println("ingrese binario:");
        numero=sed.nextInt();
        do{
        	digito=numero%10;
        	resultado=resultado+digito*(int)Math.pow(2, exp);
        	exp++;
        	numero=numero/10;
        	}
       while(numero>0);
        
       System.out.println("DEC ES:"+resultado);
        }
        
        
        
   }
}     		 
		
		
        
  
    	  
			 
       

        
        
        		
        		
        		
        		
        	
        	
        	
       
       
       
       
        	
		
        
        
        
        
        	
        	
        	
        
