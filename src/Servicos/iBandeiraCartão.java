package Servicos;

import Erro.Personalizado;

public interface iBandeiraCart�o {
	
 String verificarBandeira() throws Personalizado;
 
 
 default String senha(int senha) throws Personalizado {
	 if (senha==123) {
		 return "Senha V�lida";
	 } else {
		 throw new Personalizado("Senha Inv�lida");
	 }
 }
	
			
}
