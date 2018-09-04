public class Carro extends Veiculo{
	private int chassi;
	private boolean quatroPortas;
	

	public Carro(int chassi, boolean quatroPortas, String marca, String modelo, int ano){
		super(marca, modelo, ano);
		this.chassi = chassi;
		this.quatroPortas = quatroPortas;
	}
	
	public Carro(){
		super();
		this.chassi = 0;
		this.quatroPortas = false;
	}

	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("Chassi: " + this.chassi);
		System.out.println("Quatro portas: "+this.quatroPortas);	
	}


}
