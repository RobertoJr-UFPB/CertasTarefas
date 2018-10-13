
package conector;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *Esta classe tem o objetivo de linkar o projeto com o banco mysql
 * Nome do Banco: certastarefas
 * Tabela: tarefas
 * PK: idTarefa
 * Coluna1: titulo
 * Coluna2: descricao
 * @author Roberto
 */

public class ConnectionFactory {
    //Método para criar conexão
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/certastarefas","root","");
        }catch(Exception erro){
            throw new RuntimeException("Erro 1: "+ erro);
        }
    }
}
