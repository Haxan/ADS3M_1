package lt.lab3.models;
import lt.lab3.models.Contato;

public class ListaContatos {
	
	private Contato primeiro = null;
	private Contato ultimo = null;
	private int tamanho =0;
	private String auxNome;
	private int auxNumeroTelefone;
	private int auxNumeroIndice;
	private  String [] alfabeto=  {"a","b","c","d","e","f","g","h","i","j","k","l",
			"m","n","o","p","q","r","s","t","u","v","w","v","y","z"
	};
	
	
	

	public void addContato(String nome, int numTelefone){
		if(primeiro == null) {
			primeiro = new Contato("",0);
			ultimo = primeiro;
			Contato novoContato = new Contato(nome,numTelefone);
			novoContato.setProx(null);
			primeiro.setProx(novoContato);
			ultimo = novoContato;
			ultimo.setAnterior(primeiro);
			tamanho++;
			ultimo.setIndice(tamanho);
			
		}
		else{
			Contato novoContato = new Contato(nome, numTelefone);
			ultimo.setProx(novoContato);
			ultimo = ultimo.getProx();
			tamanho++;
			ultimo.setIndice(tamanho);
		}
	}
	
	public void percorrerLista(){
		
		Contato percorre = primeiro.getProx();
		while(percorre !=null){
		 auxNome = percorre.getNomeContato();
		 auxNumeroTelefone = percorre.getNumeroTelefone();
		 auxNumeroIndice = percorre.getIndice();
		percorre = percorre.getProx();
		}
		
	}
	public void mudarLugarConto(){
		
	}
	
	public void organizarLista(ListaContatos lista){
		
		
		for(int i=0;i<= lista.getTamanho();i++ ){}
	}
	
	
	
	public Contato getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Contato primeiro) {
		this.primeiro = primeiro;
	}

	public Contato getUltimo() {
		return ultimo;
	}

	public void setUltimo(Contato ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	}
		

