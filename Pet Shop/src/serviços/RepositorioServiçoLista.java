package serviços;

public class RepositorioServiçoLista implements RepositorioServiços {
	private Serviços serviço;
	private RepositorioServiçoLista proximo;
	
	public RepositorioServiçoLista () {
		this.serviço = null;
	}
	public void inserir (Serviços serviço) {
		if (this.serviço == null) {
			this.serviço = serviço;
			this.proximo = new RepositorioServiçoLista();
			return;
		}
		this.proximo.inserir(serviço);
	}

	public void remover(String codigo) {
		
		
	}
}
