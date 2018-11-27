package minicalculadora;

import java.util.Scanner;

public class operacionesbinarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String sell;
		String stBinario;
		char vecBinario[];
		int Binario;
		int posicionElevada;
		int strLargo;
		int numero;
	        int exp=0;
                int digito;
	        boolean band;
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
        	double aux;
		String mensajeError = "Numero binario NO VALIDO";
		System.out.println("A seleccionado BINARIO A DEC"
				  + "\n Ingrese numero BINARIO:");
		Scanner in = new Scanner(System.in);
		Binario=0;
		aux=0;

		do{
		

		stBinario = in.nextLine();
		stLargo = stBinario.length();
		vecBinario = new char[strLargo];

		for (int i=0; i<strLargo; i++){ 
		vecBinario[i]=strBinario.charAt(i);

		}

		band = false;
		for (int j=0; j<strLargo; j++){
		if (vecBinario[j] != '1' && vecBinario[j]!= '0'){

		System.out.println(mensajeError);
		j=strLargo;
		band = true;

		} else {
		aux = Math.pow(2, (strLargo-1-j)); 
		posicionElevada = (int) aux; 
		digito = vecBinario[j]-'0'; 
		Binario = Binario + digito*posicionElevada; 
		band = false;
		       }
		    }
		}
	        while (band == true);
		System.out.println("SU DECIMAL ES:"+Binario);
       
	

		in.close();
		   } 
        
   }
}  
        
        
        		 
		
		
        
  
    	  
			 
       

        
        
        		
        		
        		
        		
        	
        	
        	
       
       
       
       
        	
		
        
        
        
        
        	
        	
        	
        
