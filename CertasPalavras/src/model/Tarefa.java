
package model;

/**
 *Esta classe é uma abstração de como deve ser uma Tarefa
 * @author Roberto
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private int id;
    
   
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    
}
