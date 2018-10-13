
package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Tarefa;

/**
 *Esta classe deve formar a tabela na gui 
 * @author Roberto
 */
public class TabelaDeTarefas extends AbstractTableModel{
    public static final int COL_ID_TAREFA = 0;
    public static final int COL_TITULO_TAREFA = 1;
    public static final int COL_DESCRICAO_TAREFA = 2;
    public ArrayList<Tarefa> lista;
    
    public TabelaDeTarefas(ArrayList<Tarefa> lista){
        this.lista = new ArrayList<Tarefa>(lista);
    }
    //Este método deve retornar o tamanho da lista, para a quantidade de linhas que a tabela deve ter
    @Override
    public int getRowCount() {
        return this.lista.size();
    }
    //Este método deve retornar a quantidade de colunas
    @Override
    public int getColumnCount() {
        return 3;
    }
    //Este método forma as celulas da tabela
    @Override
    public Object getValueAt(int linhas, int colunas) {
       Tarefa tarefa = lista.get(linhas);
       if(colunas == COL_ID_TAREFA){
           return tarefa.getID();
       }
       if(colunas == COL_TITULO_TAREFA){
           return tarefa.getTitulo();
       }
       if(colunas == COL_DESCRICAO_TAREFA){
           return tarefa.getDescricao();
       }
       return "";
    }
    //Este método forma os nomes de cada coluna da tabela
    @Override
    public String getColumnName(int colunas) {
       if(colunas == COL_ID_TAREFA){
           return "Posição da Tarefa";
       }
       if(colunas == COL_TITULO_TAREFA){
           return "Titulo da Tarefa";
       }
       if(colunas == COL_DESCRICAO_TAREFA){
           return "Descrição da Tarefa";
       }
       return "";
    }
}
