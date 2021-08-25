import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    private static ListaTarefas listaTarefas = new ListaTarefas();
    
    public void criarMenu(){
        System.out.println("|------------------- Menu de Ferramentas -------------------|");
        System.out.println("|                  1 - Adicionar Tarefas                    |");
        System.out.println("|                  2 - Listar todas as Tarefas              |");
        System.out.println("|                  3 - Excluir Tarefa                       |");
        System.out.println("|                  4 - Editar Tarefa                        |");
        System.out.println("|                  5 - Priorizar Tarefa                     |");
        System.out.println("|                  6 - Sair                                 |");
        System.out.println("|-----------------------------------------------------------|");

        String opcao = scanner.nextLine();

        switch (opcao) {
          case "1":   
            adicionaNovaTarefa();
            criarMenu();
            break;

          case "2":
            listarTarefas();
            criarMenu();
            break;

          case "3":
            excluirTarefa();
            criarMenu();
            break;

          case "4":
            System.out.println("Damasco");
            break;

          case "5":
            System.out.println("Damasco");
            break;

          case "6":
            System.exit(0);
            break;
            
          default:
            System.out.println("Opção inválida\nSelecione novamente");
            criarMenu();
        
        }
    }
    private void adicionaNovaTarefa(){

      System.out.println("|----------------------- Nova Tarefa -----------------------|");
      System.out.println("Preencha a descrição das tarefas, digite enter para\nadicionar uma nova tarefa e 0 para sair!");
      String descricaoTarefa;
      do{
        descricaoTarefa = scanner.nextLine();
        if(!descricaoTarefa.equals("0")){
          Tarefa tarefa = new Tarefa(listaTarefas.getProximoId(),descricaoTarefa, false);
          listaTarefas.addTarefa(tarefa);
        }
      }while(!descricaoTarefa.equals("0"));
    }

    private void listarTarefas(){
      System.out.println("|------------------- Tarefas Cadastradas -------------------|");
      System.out.println("| Num Tarefa - Descrição - Concluída                        |");
      ArrayList<Tarefa> tarefasTemporaria = new ArrayList<Tarefa>();
      int cont = 1;
      tarefasTemporaria = listaTarefas.getList();

      for (Tarefa tarefa : tarefasTemporaria) {
        System.out.println("  " + cont +" - "+ tarefa.getDescricao() + (tarefa.getTarefaConcluida() ? "  ✓  " : "  ☐  "));
        cont++;
      }
    }

    private void excluirTarefa(){
      System.out.println("|------------------- Selecione uma tarefa cadastrada para excluir -------------------|");
      listarTarefas();
      System.out.println("|------------------- Qual o número da tarefa a ser excluida?  -------------------|");
      int posTarefa = scanner.nextInt();

      listaTarefas.excludeTarefa(listaTarefas.getList().get(posTarefa+1));
    }
}
