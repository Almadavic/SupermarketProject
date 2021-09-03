package Entidade;

import Erro.Personalizado;

public class Caixa extends Funcionario {
private Integer caixa=null;

public Caixa() {
	
}



public Caixa(String nome, Double salario, Double desconto, Integer caixa) {
	super(nome, salario, desconto);
	this.caixa = caixa;
}



public Integer getCaixa() {
	return caixa;
}

public void setCaixa(Integer caixa) {
	this.caixa = caixa;
}



@Override
public double calcularSalario() {
	return getSalario()-getDesconto();
}



@Override
public String formatado() {
	return "Nome "+getNome()+" Guiche : "+getCaixa()+" Sal�rio Base : "+getSalario()+" Sal�rio Final : "+calcularSalario();
}



@Override
public void verificacao() throws Personalizado {
	if (getNome()==null || getSalario()==null || getDesconto()==null || caixa==null) {
		throw new Personalizado("N�o pode haver valores nulos");
	}
}




}
