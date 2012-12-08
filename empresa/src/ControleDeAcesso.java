public class ControleDeAcesso {
	
	public static void main (String[] args) {
	
		GerenciadorDeUsuario gdu = new GerenciadorDeUsuario();
	
		Gerente maria = new Gerente();
		
		maria.setSenha(12345);
		
		gdu.fazLogin(maria);
	
	}
}
