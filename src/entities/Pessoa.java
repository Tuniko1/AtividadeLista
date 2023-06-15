package entities;

public class Pessoa {
	private String telefone;
	private String nome;
	private int idade;
	
	public String getNome(){
		return nome;
	}
	//public Pessoa(String nome, String telefone, int idade);
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "nome: "+nome
				+"\nTelefone: "+telefone
				+"\nIdade" +idade;
		
		
	}

}
