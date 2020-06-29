package br.com.modelo.fatec;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private Telefone telefone;
	private Endere�o endere�o;
	private String nome;
	private String CPF;
	
	public Pessoa(Telefone telefone, Endere�o endere�o, String nome, String CPF) {
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.nome=nome;
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Endere�o getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	

}
