import model.Task;
import persistence.TaskRepository;
import controller.TaskController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskRepository repo = new TaskRepository();
        TaskController controller = new TaskController(repo);

        int opcao;

        do {
            System.out.println("\n==== MENU DE TAREFAS ====");
            System.out.println("1 - Criar nova tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar tarefa como feita");
            System.out.println("4 - Mostrar resumo (pendentes/concluidas)");
            System.out.println("5 - Apagar tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            while (!sc.hasNextInt()) {
                System.out.print("Digite um numero válido: ");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Titulo da tarefa: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descricao da tarefa: ");
                    String descricao = sc.nextLine();

                    Task nova = controller.createTask(titulo, descricao);
                    System.out.println(" Tarefa criada com sucesso: " + nova);
                    break;

                case 2:
                    System.out.println("\n Lista de tarefas:");
                    for (Task t : controller.listTasks()) {
                        System.out.println(t);
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa para marcar como feita: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um numero valido: ");
                        sc.next();
                    }
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (controller.markTaskDone(id)) {
                        System.out.println(" Tarefa marcada como concluida!");
                    } else {
                        System.out.println("️ Tarefa nao encontrada.");
                    }
                    break;

                case 4:
                    int total = 0;
                    int done = 0;
                    for (Task t : controller.listTasks()) {
                        total++;
                        if (t.isDone()) done++;
                    }
                    System.out.println(String.format(" %d total | %d concluidas | %d pendentes", total, done, total - done));
                    break;

                case 5:
                    System.out.print("Digite o ID da tarefa que deseja apagar: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um numero valido: ");
                        sc.next();
                    }
                    int idDel = sc.nextInt();
                    sc.nextLine();

                    if (controller.deleteTask(idDel)) {
                        System.out.println("️  Tarefa apagada com sucesso!");
                    } else {
                        System.out.println("️ Tarefa nao encontrada.");
                    }
                    break;

                case 0:
                    System.out.println(" Encerrando o programa...");
                    break;

                default:
                    System.out.println(" Opcao invalida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
