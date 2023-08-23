package br.com.cinema.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABINFO
 */
public class Produto {
    /*private para cadastro privado nao visando o publico,
     int é um tipo inteiro que esta guardado numero positivos ou negativos*/
     private int idProduto;
     private String nomeProduto;//String aceita numeros fazendo parte de um texto e o texto em si.
     private int quantidade;
     private Double preco;//Double ou float é usado para numeros com virgulas.
     private String validade;
     
     
     //Criando os construtores
    public Produto(){}//construtor ele diz que um produto pode ser criado e nao importa como ele vai ser criado.
    //construtor com o paramentro pode criar um produto mais seguindo as seguintes classes.
    public Produto(int idProduto,String nomeProduto,int quantidade,Double preco,String validade){
    idProduto = this.idProduto;
    nomeProduto = this.nomeProduto;
    quantidade = this.quantidade;
    preco = this.preco;
    validade = this.validade;
    }
    //Os metodos get e set usados em consjunto sao chamados de ecapsulamento.!!!
    //Essa ideia tras o ato de encapsular.
    
    
    /*siguinifica pegar ele captura uma informação
    ou seja captura a informação que a pessoa cadastro.
    Segue o modelo de GET a baixo.*/
    public int getIdProduto(){ 
    return idProduto;
    }
    /*significa modificar a informação colocada ou seja
    estou dizendo que o idproduto pode ser configurado por alguem.
    segue o SET a baixo.*/
    public void setIdProduto(int idProduto){
    this.idProduto = idProduto;
    }
    public String nomeProduto(){
    return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
    this.nomeProduto = nomeProduto;
    }
    public int getQuantidade(){
    return quantidade;
    }
    public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
    }
    public Double getPreco(){
    return preco;
    }
    public void setPreco(Double preco){
    this.preco = preco;
    }
    public String Validade(){
    return validade;
    }
   public void setValidade(String validade){
       this.validade = validade;
   }
}


