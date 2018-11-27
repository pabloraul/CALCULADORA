package minicalculadora;

import java.util.Scanner;

public class pruebabinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strBinario;
		char vecBinario[];
		int intBinario, posicionElevada, strLargo, digito;
		double aux;
		String mensajeError = "Numero binario NO VALIDO";
		String mensaje1 = "Ingrese un numero binario";
		Scanner in = new Scanner(System.in);
		intBinario=0;
		aux=0;


		boolean band;

		do{
		System.out.println(mensaje1);

		strBinario = in.nextLine();
		strLargo = strBinario.length();
		vecBinario = new char[strLargo];

		//Verificamos el ingreso que sea binario
		for (int i=0; i<strLargo; i++){ 
		vecBinario[i]=strBinario.charAt(i);

		}

		band = false;
		for (int j=0; j<strLargo; j++){
		if (vecBinario[j] != '1' && vecBinario[j]!= '0'){

		System.out.println(mensajeError);
		j=strLargo;
		band = true;

		//en caso de que si...
		} else {
		aux = Math.pow(2, (strLargo-1-j)); //auxiliar para potencia
		posicionElevada = (int) aux; // lo paso a integer para que pueda ser compatible
		digito = vecBinario[j]-'0'; // paso chart a int
		intBinario = intBinario + digito*posicionElevada; // hago la operacion para conseguir el decimal
		band = false;

		}
		}

		}while (band == true);
		System.out.println(intBinario);

		in.close();

	}
	}