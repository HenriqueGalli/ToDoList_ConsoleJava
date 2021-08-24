import java.util.ArrayList;

public class ListaTarefas {

    private static final ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ArrayList<Tarefa> getList(){
        return tarefas;
    }

    public int getListSize(){
        return tarefas.size();
    }

    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void excludeTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }
}
