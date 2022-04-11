package jvbank;

public interface AcessoInterno {

	//os metodos não tem comportamento(corpo) so tem assinatura

	
	/**
	 * @param String usuario => pode-se informar um usuario valido
	 * @param String senha => pode-se informar uma senha com ate 255 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	
	public boolean autenticarSistema(String usuario,String senha);
	public boolean mudarSenha(String senhaAntiga,String senhaNova);
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	}
