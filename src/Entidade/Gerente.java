package Entidade;

import Erro.Personalizado;

public class Gerente extends Funcionario {
private Double comissao=null;

public Gerente() {
	
}





public Gerente(String nome, Double salario, Double desconto, Double comissao) {
	super(nome, salario, desconto);
	this.comissao = comissao;
}





@Override
public double calcularSalario() {
	return ((getSalario()-getDesconto())+comissao);
}

@Override
public String formatado() {
	return "Nome : "+getNome()+" Sal�rio base : "+getSalario()+" Sal�rio Final : "+calcularSalario();
}

@Override
public void verificacao() throws Personalizado {
	
	if(getNome()==null || getSalario()==null || getDesconto()==null || comissao==null) {
		throw new Personalizado("N�o pode ter valores nulos");
	}
}


}
