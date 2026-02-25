package aula3;

import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		double fahrenheit, celsius;
		
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o valor em fahrenheit");
		fahrenheit = ler.nextDouble();
		
		celsius = ((fahrenheit -32) * 5) /9;
		System.out.println("o valor em celsius é " + celsius);
	}

}
