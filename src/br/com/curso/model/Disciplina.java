package br.com.curso.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Marcelo
 */
public class Disciplina {

	private String nome;
	private List<Float> notas;
	private List<Integer> faltas;
	
	
	//Contrutor 
	public Disciplina() {
		notas = new ArrayList<>();
		faltas = new ArrayList<>();
	}
	
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Float> getNotas() {
		return notas;
	}
	public void setNotas(List<Float> notas) {
		this.notas = notas;
	}
	public List<Integer> getFaltas() {
		return faltas;
	}
	public void setFaltas(List<Integer> faltas) {
		this.faltas = faltas;
	}
	
	

}