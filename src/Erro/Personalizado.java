package Erro;

public class Personalizado extends Exception {
	private static final long serialVersionUID=1L;
	
	public Personalizado(String text) {
		super(text);
	}
}
