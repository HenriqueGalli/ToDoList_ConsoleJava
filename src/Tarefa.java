
public class Tarefa{
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao,boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public int getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public boolean getTarefaConcluida(){
        return concluida;
    }
    public void setTarefaConcluida(boolean concluida){
        this.concluida = concluida;
    }
}