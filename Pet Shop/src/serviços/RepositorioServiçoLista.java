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
		if (this.serviço != null && this.serviço.getCodigo().equals(codigo)) {
			this.serviço = this.proximo.serviço;
			this.proximo = this.proximo.proximo;
		}
		else if (this.serviço == null) {
			//gerar erro
		}
		else {
			this.proximo.procurar(codigo);
		}
		
	}
	public void atualizar(Serviços serviço) {
		if (this.serviço != null && this.serviço.equals(serviço)) {
			this.serviço.setNome(serviço.getNome());
			this.serviço.setCodigo(serviço.getCodigo());
			this.serviço.setPreco(serviço.getPreco());
		}
		else if (this.serviço == null) {
			//gerar erro
		}
		else {
			this.proximo.atualizar(serviço);
		}
	}
	
	public Serviços procurar(String codigo) {
		if (this.serviço != null && this.serviço.getCodigo().equals(codigo)) {
			return this.serviço;
		}
		else if (this.serviço == null) {
			return null;
		}
		else {
			return this.proximo.procurar(codigo);
		}
		
	}

}
