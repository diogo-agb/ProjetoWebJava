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
public class Curso {
    
    private String nome;
    private int cargaHoraria;
    
    public Curso(){}
    
    public Curso(String nome, int cargaHoraria){
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
