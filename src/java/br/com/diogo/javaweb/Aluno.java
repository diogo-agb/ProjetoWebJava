/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogo.javaweb;

/**
 *
 * @author Diogo
 */
public class Aluno extends Pessoa{
    
    private int ra; 
    private Curso curso;
    
    public Aluno(){}
    
    public Aluno(int ra, Curso curso){
        super();
        this.ra = ra;
        this.curso = curso;
    }
    
    public Aluno(String nome, String email, int idade, int ra, Curso curso) {
        super(nome, email, idade);
        this.ra = ra;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
