package Servicos;

import Erro.Personalizado;

public interface iBandeiraCartão {
	
 String verificarBandeira() throws Personalizado;
 
 
 default String senha(int senha) throws Personalizado {
	 if (senha==123) {
		 return "Senha Válida";
	 } else {
		 throw new Personalizado("Senha Inválida");
	 }
 }
	
			
}
