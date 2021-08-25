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
            adicionaNovaTarefa(listaTarefas);
            criarMenu();
            break;

          case "2":
            listarTarefas();
            criarMenu();
            break;

          case "3":
            System.out.println("Caju");
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
    private void adicionaNovaTarefa(ListaTarefas lista){


      System.out.println("|------------------- Nova Tarefa -------------------|");
      System.out.println("Preencha a descrição da tarefas: ");
      String descricaoTarefa = scanner.nextLine();

      Tarefa tarefa = new Tarefa(lista.getProximoId(),descricaoTarefa, false);
      lista.addTarefa(tarefa);
    }



    private void listarTarefas(){
      System.out.println("|------------------- Tarefas Cadastradas -------------------|");
      System.out.println("|   Tarefa realizada   |   Descrição   |");
      ArrayList<Tarefa> tarefasTemporaria = new ArrayList<Tarefa>();
      tarefasTemporaria = listaTarefas.getList();
      for (Tarefa tarefa : tarefasTemporaria) {
        System.out.println("        ☐         " + tarefa.getDescricao());
      }

    }
}
