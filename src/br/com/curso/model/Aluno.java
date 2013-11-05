package br.com.curso.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class Aluno {
	
    private String nome;
    private String ra;
    private List <Disciplina> disciplinas;

    
    
    //Construtor
    public Aluno(){
    	disciplinas = new ArrayList<>();
    }   
        
    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    
    //Getters and Setters
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }


}