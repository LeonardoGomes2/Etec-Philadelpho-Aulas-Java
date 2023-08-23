/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinema.model;

/**
 *
 * @author LABINFO
 */
public class Filme {
    private String nomeFilme;
    private String sinopse;
    private String duracao;
    private String genero;
    
    public Filme(){//construtor sem parâmetro
}
    public Filme(String nomeFilme,String sinopse,String duracao,String genero){
        this.nomeFilme=nomeFilme;
        this.sinopse=sinopse;
        this.duracao=duracao;
        this.genero=genero;
    }
    public String getNomeFilme(){
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme){
        this.nomeFilme=nomeFilme;
    }
    public String getSinopse(){
         return sinopse;
    }
    public void setSinopse(String sinopse){
        this.sinopse=sinopse;
    }
    public String getDuracao(){
        return duracao;
    }
    public String getGenero(){
        return genero;
    }
    public void serGenero(String genero){
        this.genero=genero;
    }
    
}