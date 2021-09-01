package Entidade;

public abstract class Funcionario {
private String nome=null;
private Double salario=null;
private Double desconto=null;

public Funcionario() {
	
}





public Funcionario(String nome, Double salario,Double desconto) {
	this.nome = nome;
	this.salario = salario;
	this.desconto=desconto;
}





public abstract double calcularSalario() ;
	


public abstract String formatado();
	



public abstract void verificacao();



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public Double getSalario() {
	return salario;
}



public void setSalario(Double salario) {
	this.salario = salario;
}





public Double getDesconto() {
	return desconto;
}





public void setDesconto(Double desconto) {
	this.desconto = desconto;
}
	






}


