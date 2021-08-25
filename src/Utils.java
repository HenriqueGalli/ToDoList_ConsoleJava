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


      System.out.println("|------------------- Nova Tarefa -------------------|");
      System.out.println("Preencha a descrição da tarefas: ");
      String descricaoTarefa = scanner.nextLine();
      Tarefa tarefa = new Tarefa(listaTarefas.getProximoId(),descricaoTarefa, false);
      listaTarefas.addTarefa(tarefa);
    }

    private void listarTarefas(){
      System.out.println("|------------------- Tarefas Cadastradas -------------------|");
      System.out.println("|   Tarefa realizada   |      Descrição          |");

      ArrayList<Tarefa> tarefasTemporaria = new ArrayList<Tarefa>();
      tarefasTemporaria = listaTarefas.getList();

      for (Tarefa tarefa : tarefasTemporaria) {
        System.out.println(tarefa.getTarefaConcluida() ? "            ☐         " :
                          "        ✓         "+
                           tarefa.getDescricao());
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
