import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    
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
            System.out.println("Abacate");
            break;

          case "2":
            System.out.println("Buriti");
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
}
