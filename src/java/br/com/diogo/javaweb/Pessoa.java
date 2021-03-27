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
public class Pessoa {
    
    private String nome;
    private String email;
    private int idade;    
    
    //Assinatura do método: Pessoa
    public Pessoa(){}
    
    //Assinatura do método: Pessoa string string int
    public Pessoa(String nome, String email, int idade){
        setNome(nome);
        setEmail(email);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
