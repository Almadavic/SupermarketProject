package Servicos;

import Erro.Personalizado;

public class MasterCard extends abstractService {

	public MasterCard(Integer setor) {
		super(setor);
	}

	@Override
	public String verificarBandeira() throws Personalizado {
		if (getSetor()!=54 && getSetor()!=55 && getSetor()!=56 && getSetor()!=57) {
			throw new Personalizado("**BANDEIRA NÃO CONFERE PARA MASTERCARD");
		} else {
			return "**BANDEIRA CONFERE";
		}
	}

	

}
