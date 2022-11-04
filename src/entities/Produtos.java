package entities;

public class Produtos {
	
	public String name;
	public double valor;	
	public int quantidades;
	
	public Produtos(String name, double valor, int quantidades) {
	
		this.name = name;
		this.valor = valor;
		this.quantidades = quantidades;
	
	}
	
	public Produtos(String name, double valor) {
		
		this.name = name;
		this.valor = valor;
		
	}

	
	public double totalValueInStock() {
		return valor * quantidades;
	}
	
	public void addProdutos(int quantidades) {
		this.quantidades += quantidades;
	}
	
	public void removeProdutos(int quantidades) {
		this.quantidades -= quantidades;
	}
	
	public String toString(){
		return name
			+ ", R$ "
			+ String.format("%.2f", valor)
			+ ", "
			+ quantidades
			+ " unidades, Total: R$ "
			+ String.format("%.2f", totalValueInStock());
	}
}