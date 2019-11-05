package serviços;

public interface RepositorioServiços {
	public void inserir (Serviços serviço);
	public void remover (String codigo);
	public void atualizar (Serviços serviço);
	public void procurar (String codigo);

}
