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
    private Filme filme;
    private String fileiraAcento;
    private String data;
    private String hora;
    private Double preco;
    private String qtd;
//Alt+Inset para incerir altomaticamente os codigos.
    public Ingresso() {
    }

    public Ingresso(
            int idIngresso, 
            Filme filme, 
            String fileiraAcento, 
            String data, 
            String hora, 
            Double preco, 
            String qtd) 
    
    {
        this.idIngresso = idIngresso;
        this.filme = filme;
        this.fileiraAcento = fileiraAcento;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
        this.qtd = qtd;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getFileiraAcento() {
        return fileiraAcento;
    }

    public void setFileiraAcento(String fileiraAcento) {
        this.fileiraAcento = fileiraAcento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }
    
}
    
   