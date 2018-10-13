
package conector;

/**
 *Esta classe tem o objetivo de ligar as tarefas os atributos das tarefas com o banco, atrav�s de consultas sql, no banco mysql
 * @author Roberto
 */
import model.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ConectorDeTarefas {
    private Connection con;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList <Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
    
    public ConectorDeTarefas(){
        con = new ConnectionFactory().getConexao();
    }
    //M�todo para inserir os dados
    public void inserir(Tarefa tarefa){
        String sql = "INSERT INTO tarefas (titulo, descricao) Values(?,?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: "+erro);
        }
    }
    //M�todo para editar Dados, aqui da para mudar posi��o
    public void editar(Tarefa tarefa){
        String sql = "UPDATE tarefas SET titulo=?, descricao=? WHERE idTarefa=?";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setInt(3, tarefa.getID());
            stmt.execute();
            stmt.close();
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 3: "+erro);
        }
    }
    //M�todo para ecluir linha de uma referente a uma tarefa 
    public void excluir(int valor){
        String sql = "DELETE FROM tarefas WHERE idTarefa = "+valor;
        try{
            st = con.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 4: "+erro);
        }
    }
    //M�todo para listar todas as tarefas em uma tabela na gui
    public ArrayList<Tarefa> listarTarefas(){
        String sql = "SELECT * FROM tarefas";
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Tarefa tarefa = new Tarefa();
                tarefa.setID(rs.getInt("idTarefa"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
                listaDeTarefas.add(tarefa);
            }
        }catch(Exception erro){
            throw new RuntimeException("Erro 5: "+erro);
        }
        return this.listaDeTarefas;
    }
    //M�todo para listar todas as tarefas que se tenham o string na busca por descri��o
    public ArrayList<Tarefa> consultaDeTarefas(String valor){
        String sql = "SELECT * FROM tarefas where descricao LIKE '%"+valor+"%'";
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Tarefa tarefa = new Tarefa();
                tarefa.setID(rs.getInt("idTarefa"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
                listaDeTarefas.add(tarefa);
            }
        }catch(Exception erro){
            throw new RuntimeException("Erro 5: "+erro);
        }
        return this.listaDeTarefas;
    }
    
}
