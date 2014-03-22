package lt.lab3.view;

public class ConsoleLayout {
	
	private String[] MultMensg = {
			
			"\0 Bem vindo ao sistema Lista Telefônica:"
			+ "\n1- Para iniciar Sistema. \n2- Para terminar sistema.",
			"\01 \nDeseja Adicionar um contato?",
			"\02 Digitar S para confirmar.\n  Digitar N para cancelar.\n [Sim/Não]",
			"\03 \n==============================================================\n",
			"\04  Diga o nome do contato:\n",
			"\05  Diga o telefone: do contato:\n",
			"\06\nDeseja Adicionar mais algum contato? ",
			"\07 \n1-Cancelar",
			"\08\n2-Para confirmar",
			"\09\nContato adicionado com sucesso",
			"\10\nContato removido com sucesso."
			
	};

	public int getMultMensg() {
		return MultMensg.length;
	}

	public void setMultMensg(String[] multMensg) {
		MultMensg = multMensg;
	}
	public String getTextoPosition(int position) {
		return this.MultMensg[position];
	}
	

	}
	


