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

    public void priorizarTarefa(Tarefa tarefa){
        int posAnterior = tarefas.indexOf(tarefa);
        tarefas.remove(posAnterior);
        tarefas.add(0, tarefa);
    }

/*     public int getProximoId(){
        int ultimoId = 0;
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getId() > ultimoId)
                ultimoId = tarefa.getId();
        }
        return ultimoId+1;
    } */
}
