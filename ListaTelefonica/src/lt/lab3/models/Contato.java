package lt.lab3.models;

public class Contato {
	
	private String nomeContato;
	private int numTelefone;
	private Contato prox =null;
	private Contato Anterior= null;
	private static int indice;
	private int valorPosition;
	
	public int getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(int numTelefone) {
		this.numTelefone = numTelefone;
	}

	public int getValorPosition() {
		return valorPosition;
	}

	public void setValorPosition(int valorPosition) {
		this.valorPosition = valorPosition;
	}

	public Contato(String nome, int numTelefone){
		this.nomeContato = nome;
		this.numTelefone = numTelefone;
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public int getNumeroTelefone() {
		return numTelefone;
	}
	public void setNumeroTelefone (int numeroTelefone) {
		
			this.numTelefone = numeroTelefone;
	
	}
	public Contato getProx() {
		return prox;
	}
	public void setProx(Contato prox) {
		this.prox = prox;
	}
	public Contato getAnterior() {
		return Anterior;
	}
	public void setAnterior(Contato anterior) {
		Anterior = anterior;
	}
	
	

}
