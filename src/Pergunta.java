
public class Pergunta {

	//data class: classe que serve para armazenar dados
	//definir os atributos
	
	private int numero;
	private String questao;
	private String tema;
	
	//criar 2 construtores
	public Pergunta() {
		//construtor padrão ou default	
	} 
	
	public Pergunta(int number, String question, String theme) {
		numero = number;
		questao = question;
		tema = theme;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	
	public String getQuestao() {
		return questao;
	}
	
	public void setQuestao(String q) {
		questao = q;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void setTema(String t) {
		tema = t;
	}
}
