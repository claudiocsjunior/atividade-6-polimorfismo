public class Principal{
	public static void main(String[] args){
		Veiculo carro = new Carro(12345, true, "Fiat", "Uno", 2015);
		carro.imprimirDados();
		carro.buzinar();
	}


}
