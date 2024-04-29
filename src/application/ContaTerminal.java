package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, digite o número da conta !");
		numero = sc.nextInt();

		System.out.print("Por favor, digite o número da Agencia !");
		agencia = sc.next().toString();

		System.out.print("Por favor, digite o nome do cliente !");
		nomeCliente = sc.next();

		System.out.print("Por favor, digite o valor do seu primeiro deposito !");
		saldo = sc.nextDouble();

		sc.close();

		System.out.println("Olá " 
				+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " 
				+ "sua agencia é "
				+ agencia 
				+ ", conta " 
				+ numero 
				+ " e seu saldo " 
				+ saldo + " já está disponível para saque.");

	}

}
