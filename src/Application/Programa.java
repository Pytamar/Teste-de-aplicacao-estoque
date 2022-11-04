package Application;

import java.util.Scanner;

import entities.Produtos;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
				
		System.out.println("Entre com os valores do produto ");
		
		System.out.print("Nome: ");
		String name = teclado.nextLine();
		
		System.out.print("Preço: ");
		double valor = teclado.nextDouble();
		
		/*System.out.print("A quantidade no estoque: ");
		int quantidades = teclado.nextInt();
		*/
		Produtos produtos = new Produtos(name, valor);
		
		System.out.print("Informações do produto: " + produtos);
		
		System.out.println( );
		System.out.print("Entre com numero dos produtos para adicionar no estoque: ");
		int quantidade = teclado.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println( );
		System.out.print("Atualização do produto: " + produtos);
		System.out.println( );
		
		System.out.print("Entre com numero de quantos produtos você quer tirar do estoque: ");
		quantidade = teclado.nextInt();
		produtos.removeProdutos(quantidade);
		
		System.out.println( );
		System.out.print("Atualização do produto: " + produtos);
	}

}
