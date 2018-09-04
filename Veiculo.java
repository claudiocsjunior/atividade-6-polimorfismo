public class Veiculo{
	protected String marca;
	protected String modelo;
	protected int ano;

	public Veiculo(String marca, String modelo, int ano){
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Veiculo(){
		this.ano = 0;
		this.marca = "";		
		this.modelo = "";		
	}
 
	public void buzinar(){
		System.out.println("--BI BI--");
	}

	public void imprimirDados(){
		System.out.println("Ano: " + this.ano);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
	}

	

}
