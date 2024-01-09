package entities;

public class IE implements NavegadorInternet{
	
	private String enderecoUrl;

	public IE () {
	}

	public IE(String enderecoUrl) {
		super();
		this.enderecoUrl = enderecoUrl;
	}

	public String getEnderecoUrl() {
		return enderecoUrl;
	}

	public void setEnderecoUrl(String enderecoUrl) {
		this.enderecoUrl = enderecoUrl;
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina...");
		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Aba adicionada");
		
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando...");
		
	}
	
	
}
