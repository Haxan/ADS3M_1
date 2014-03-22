package lt.lab3.util;
import java.util.Scanner;
public class Leitor {
	
	private Scanner leitor1 = new Scanner (System.in);
	
	private String valorLeitorString;
	private int valorLeitorInt;
	private char valorLeitorChar;

	public void setLeitorInt(){
		this.valorLeitorInt = this.leitor1.nextInt();
		
	}
	
	public void setLeitorString(){
		this.valorLeitorString =this.leitor1.nextLine();
		
	}
	
	public void setLeitorChar(){
		//forma de pegar um valor char na posição 0.
		this.valorLeitorChar = this.leitor1.next().charAt(0);
	}
	
	public String getValorString(){
		return this.valorLeitorString;
	}
	public int getValorInt(){
		return this.valorLeitorInt;
	}
	public char getValorChar(){
		return this.valorLeitorChar;
	}
}
