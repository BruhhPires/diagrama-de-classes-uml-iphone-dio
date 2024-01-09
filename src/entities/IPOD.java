package entities;

public class IPOD implements ReprodutorMusical{
	
	private String name;
	private String caminho;
	
	public IPOD () {
	}

	public IPOD(String name, String caminho) {
		super();
		this.name = name;
		this.caminho = caminho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}
	
	

}
