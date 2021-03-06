package br.com.modelo.fatec;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private Telefone telefone;
	private Enderešo enderešo;
	private String nome;
	private String CPF;
	
	public Pessoa(Telefone telefone, Enderešo enderešo, String nome, String CPF) {
		this.telefone = telefone;
		this.enderešo = enderešo;
		this.nome=nome;
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Enderešo getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(Enderešo enderešo) {
		this.enderešo = enderešo;
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
