package minicalculadora;

import java.util.Scanner; 

public class calculadora {
// OPERACIONES MATEMATICAS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tech=null;
		double a = 0;
		double b = 0;
		double c = 0;
		double res = 0;
		double cociente=0;
		
		
		Scanner entrada=new Scanner(System.in);
		 System.out.println("Seleccione Operacion:");
		   System.out.println("+: Suma"
		           +"\n -: Resta"
				   +"\n *: Multiplicacion"
				   +"\n /: Division"
				   +"\n ^: Potencia");
		  tech=entrada.nextLine();
		  switch(tech){
		  
		  case("*"):
			  System.out.println("A seleccionado MULTIPLICACION"
					  + "\n Ingrese primer numero:"
					  + "\n Y PRESIONE ENTER");
		   a=entrada.nextDouble();
		   System.out.println("INGRESE SEGUNDO NUMERO:");
		   b=entrada.nextDouble();
		   
		  for (int i = 0; i <b; i ++) {
			res = a + c;
			c = res;
		}
		   System.out.println (c);
		
		break;
		
		  case("+"):
			  System.out.println("A seleccionado SUMA"
					  + "\n Ingrese primer numero:"
					  + "\n Y PRESIONE ENTER");
		   a=entrada.nextDouble();
		   
		   System.out.println("Ingrese el segundo número:");
		   b=entrada.nextDouble();
		   res=a+b;
		   System.out.println(a+"+"+b+"="+res);
		   break;
		   
		  case("-"):
		   System.out.println("A seleccionado RESTA"
					  + "\n Ingrese primer numero:"
					  + "\n Y PRESIONE ENTER");
		   a=entrada.nextDouble();
		   
		   System.out.println("Ingrese el segundo número:");
		   b=entrada.nextDouble();
		   res=a-b;
		   System.out.println(a+"-"+b+"="+res);
		   break;
		   
		  case("/"):
	
			  System.out.println("A seleccionado DIVISION"
					  + "\n Ingrese dividendo:"
					  + "\n Y PRESIONE ENTER");
		   a=entrada.nextDouble();
		   
		   System.out.println("Ingrese el divisor:");
		   b=entrada.nextDouble();
		   if(b==0){
				System.out.println("division indeterminada");
			}
		   else{
			   while(a>=b){
			   cociente++;
			   a=a-b;
		   }
			   
		   System.out.println("cociente:"+cociente);
		   System.out.println("resto:"+a);
		   
		   }
		   break;
		   
		   case("^"):
			  System.out.println("A seleccionado POTENCIA"
					  + "\n Ingrese primer numero:"
					  + "\n Y PRESIONE ENTER");
		   a=entrada.nextDouble();
		   
		   System.out.println("Ingrese el segundo número:");
		   b=entrada.nextDouble();
		   double potencia=a;
		   for(int i=0; i<b-1;i++){
			   potencia=potencia*a;
			}
		   System.out.println(potencia);
		   break; 
		   }   	
			   
		
		   
		   
		   
		   
		   
		   
		   
		  
		     
			   
	}
		  
			   
		   
		  
}		   
			  
			  
		  
		  
		      
		
		   
		
		   
		  
		  
		 
		
	   
	   
	   
	   
	 
	


