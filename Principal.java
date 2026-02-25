package aula3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco, distancia, mediaTotal, litrosGastos, custoTotal;

		Scanner ler = new Scanner(System.in);

		System.out.println("digite o preço do combustível: ");

		preco = ler.nextDouble();

		System.out.println("digite a distância percorrida: ");

		distancia = ler.nextDouble();

		System.out.println("digite o consumo médio do seu carro: ");

		mediaTotal = ler.nextDouble();

		litrosGastos = distancia / mediaTotal;

		custoTotal = litrosGastos * preco;

		System.out.println("você gastou " + litrosGastos + "litros" + "com o valor de:" + custoTotal);

		ler.close();
	}

}
