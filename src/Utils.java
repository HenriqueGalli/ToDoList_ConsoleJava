import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerAdd = new Scanner(System.in);
    Scanner scannerPriorizar = new Scanner(System.in);
    Scanner scannerMenu = new Scanner(System.in);
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

        String opcao = scannerMenu.nextLine();

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
            editarTarefas();
            criarMenu();
            break;

          case "5":
          priorizarTarefa();
          criarMenu();
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
        descricaoTarefa = scannerAdd.nextLine();
        if(!descricaoTarefa.equals("0")){
          Tarefa tarefa = new Tarefa(descricaoTarefa, false);
          //listaTarefas.getProximoId()
          listaTarefas.addTarefa(tarefa);
        }
      }while(!descricaoTarefa.equals("0"));
    }

    private void listarTarefas(){
      System.out.println("|------------------- Tarefas Cadastradas -------------------|");

      int cont = 1;
      if(listaTarefas.getList().size()>0){
        System.out.println("| Num Tarefa - Descrição - Concluída                        |");
        for (Tarefa tarefa : listaTarefas.getList()) {
          System.out.println("  " + cont +" - "+ tarefa.getDescricao() + (tarefa.getTarefaConcluida() ? "  ✓  " : "  ☐  "));
          cont++;
        }
      }
      else{
        System.out.println("Não existe nenhuma tarefa cadastrada na lista!");
      }
    }


    private void editarTarefas(){
      System.out.println("|--------------------- Editar Tarefas ----------------------|");
      System.out.println("Selecione uma tarefa cadastrada para editar: ");
      listarTarefas();
      int numeroTarefa = scanner.nextInt();
      System.out.println("Digite a nova descrição:");
      String novaDescricao = scanner.nextLine();
      listaTarefas.getList().get(numeroTarefa - 1).setDescricao(novaDescricao);;


    private void excluirTarefa(){
      
      System.out.println("|------------------- Selecione uma tarefa cadastrada para excluir -------------------|");
    
      if(listaTarefas.getList().size()>0){
        listarTarefas();
        System.out.println("Qual o número da tarefa a ser excluida? ");
        int posTarefa = scanner.nextInt();
        listaTarefas.excludeTarefa(listaTarefas.getList().get(posTarefa -1 ));
        listarTarefas();
      }
      else{
        System.out.println("Não existe nenhuma tarefa cadastrada na lista!");
      }   
    }

    private void priorizarTarefa(){
      if(listaTarefas.getList().size()>0){
        System.out.println("Selecione uma tarefa para levar ao topo da lista:");
        listarTarefas();
        int posTarefa = scannerPriorizar.nextInt();
        listaTarefas.priorizarTarefa(listaTarefas.getList().get(posTarefa-1));
        listarTarefas();
      }else{
        System.out.println("Não existe nenhuma tarefa cadastrada na lista!");
      }

    }
}
