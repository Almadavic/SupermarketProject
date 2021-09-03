package Entidade;

public class ItemVenda {
private Integer numero=null;
private String nomeProduto=null;
private Double valorUnitario=null;
private Integer quantidade=null;

public ItemVenda() {
	
}

public ItemVenda(Integer numero, String nomeProduto, Double valorUnitario, Integer quantidade) {
	this.numero = numero;
	this.nomeProduto = nomeProduto;
	this.valorUnitario = valorUnitario;
	this.quantidade = quantidade;
}



public double subTotal() {
	return quantidade*valorUnitario;
}


@Override
public String toString() {
	return numero+" - "+nomeProduto+" R$"+valorUnitario+" x "+quantidade+" = R$"+subTotal();
}





public Integer getNumero() {
	return numero;
}

public void setNumero(Integer numero) {
	this.numero = numero;
}

public String getNomeProduto() {
	return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}

public Double getValorUnitario() {
	return valorUnitario;
}

public void setValorUnitario(Double valorUnitario) {
	this.valorUnitario = valorUnitario;
}

public Integer getQuantidade() {
	return quantidade;
}

public void setQuantidade(Integer quantidade) {
	this.quantidade = quantidade;
}




}
