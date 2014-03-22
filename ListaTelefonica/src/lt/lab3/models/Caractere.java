package lt.lab3.models;
import lt.lab3.models.Contato;
import lt.lab3.models.ListaContatos;

public class Caractere {
	
	private  String [] alfabeto=  {"a","b","c","d","e","f","g","h","i","j","k","l",
			"m","n","o","p","q","r","s","t","u","v","w","v","y","z"
	};
		
	
	public String[] getAlfabeto(int position) {
		return alfabeto;
	}

	public void setAlfabeto(String[] alfabeto) {
		this.alfabeto = alfabeto;
	}





}