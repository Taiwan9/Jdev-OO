package cursojava.classeAuxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrat o da interface PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitiracesso;
	
	public boolean autenticar() {
		return permitiracesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitiracesso = acesso;
	}
}
