package Entidade;

public class Dono {
private String login=null;
private String senha=null;

public Dono() {
	
}


public Dono(String login, String senha) {
	this.login = login;
	this.senha = senha;
}


public String getLogin() {
	return login;
}


public void setLogin(String login) {
	this.login = login;
}


public String getSenha() {
	return senha;
}


public void setSenha(String senha) {
	this.senha = senha;
}





}
