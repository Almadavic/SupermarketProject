package Servicos;

public abstract class abstractService implements iBandeiraCart�o {
private Integer setor=null;



public abstractService(Integer setor) {
	this.setor = setor;
}



public Integer getSetor() {
	return setor;
}

public void setSetor(Integer setor) {
	this.setor = setor;
}
	


}
