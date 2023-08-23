/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cinema.model;

/**
 *
 * @author caroline
 */
public class Ingresso {
    private int idIngresso;
    private String nomeFilme;
    private String fileiraAcento;
    private String data;
    private String hora;
    private Double preco;
    
    public Ingresso(){} //construtor sem paramentros 
    
    //Logo a baixo eu defino os parametros dos meus construtores para futuros objetos.
    public Ingresso(
        int idIngresso,
        String nomeFilme,
        String fileiraAcento,
        String data,
        String hora,
        Double preco){
        
    idIngresso = this.idIngresso;
    nomeFilme = this.nomeFilme;
    fileiraAcento = this.fileiraAcento;
    data = this.data;
    hora = this.hora;
    preco = this.preco;
    }
    //Seguindo com o encpsulamento de dados get e set!!
    
        public int getIdIngresso(){
        return idIngresso;
        }
        public void setIdIngresso(int idIngresso){
        this.idIngresso = idIngresso;
        }
        public String getNomeFilme(){
        return nomeFilme;
        }
        public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
        }
        public String getFileiraAcento(){
        return fileiraAcento;
        }
        public void setFileiraAcento(String fileiraAcento){
        this.fileiraAcento = fileiraAcento;
        }
        public String getData(){
        return data;
        }
        public void setData(String data){
        this.data = data;
        }
        public String getHora(){
        return hora;
        }
        public void setHora(String hora){
        this.hora = hora;
        }
        public Double getPreco(){
        return preco;
        }
        public void setPreco(Double preco){
        this.preco = preco;
        }
    
}
