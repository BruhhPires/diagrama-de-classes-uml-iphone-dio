package entities;

public class Telefone implements AparelhoIphone{
	
	private String name;
	private int numeroContato;
	
	public Telefone() {
	}

	public Telefone(String name, int numeroContato) {
		super();
		this.name = name;
		this.numeroContato = numeroContato;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumeroContato() {
		return numeroContato;
	}

	public void setNumeroContato(int numeroContato) {
		this.numeroContato = numeroContato;
	}

	@Override
	public void ligar(){
		System.out.println("Ligando para:");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void correioDeVoz() {
		System.out.println("Correio de voz");
		
	}
	
	
}
