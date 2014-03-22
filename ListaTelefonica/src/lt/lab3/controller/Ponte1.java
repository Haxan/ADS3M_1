package lt.lab3.controller;
import lt.lab3.models.ListaContatos;
import lt.lab3.util.Leitor;
import lt.lab3.view.ConsoleLayout;
import lt.lab3.models.DataBase;

/**
 * CLasse inicializa ambas view e models para receber e lançar valores de uma para a outra.
 * @author Haxan
 *
 */
public class Ponte1 {
	
	private Leitor leitorNumero = new Leitor();
	private Leitor leitorCaractere = new Leitor();
	private Leitor LeitorLogico = new Leitor();
	private ListaContatos listaContatos = new ListaContatos();
	private ConsoleLayout consoleLayout = new ConsoleLayout();
	private String texto;
	private int numero;
	
	
	public void metodoImpressao(String Menssagem){
		System.out.print(Menssagem);
	}
	
	public void ponteInitSystem(){
		
	}
	
	public void ponteAddContato(){
		
		/*
		 * ordenação de textos e recebmentos de valores seleção de criação
		 * contato.
		 */
		
		this.metodoImpressao(this.consoleLayout.getTextoPosition(3));
		this.metodoImpressao(this.consoleLayout.getTextoPosition(1));
		this.metodoImpressao(this.consoleLayout.getTextoPosition(2));
		this.leitorCaractere.setLeitorString();
		texto = this.leitorCaractere.getValorString();
		
		if(texto.equals("sim" ) || texto.equals("s")){
			/*
			 * Inicialização de contato
			 */
			this.metodoImpressao(this.consoleLayout.getTextoPosition(3));
			this.metodoImpressao(this.consoleLayout.getTextoPosition(4));
			this.leitorCaractere.setLeitorString();
			texto =this.leitorCaractere.getValorString();
			this.metodoImpressao(this.consoleLayout.getTextoPosition(5));
			this.leitorNumero.setLeitorInt();
			numero = this.leitorNumero.getValorInt();
			this.listaContatos.addContato(texto, numero);
			
			
			
			
		}
		else{
			System.out.println("cu tbm");
		}
	 
		}
	}


