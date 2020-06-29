package br.com.modelo.fatec;

import java.io.Serializable;

public class Animal implements Serializable{
	private int idPet;
	private String nome;
	private String ra�a;
	private char genero;
	private String idade;
	public Animal(String nome,String ra�a, char genero, String idade) {
		this.nome = nome;
		this.ra�a = ra�a;
		this.genero = genero;
		this.idade = idade;
	}
	
	public char getGenero() {
		return genero;
	}
	public String getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public String getRa�a() {
		return ra�a;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public int getIdPet() {
		return idPet;
	}
	
	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}
	
	
	

}
