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
	return "Nome : "+getNome()+" Salário base : "+getSalario()+" Salário Final : "+calcularSalario();
}

@Override
public void verificacao() throws Personalizado {
	
	if(getNome()==null || getSalario()==null || getDesconto()==null || comissao==null) {
		throw new Personalizado("Não pode ter valores nulos");
	}
}


}
