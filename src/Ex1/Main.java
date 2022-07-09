package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author s.lucas
 */
public class Main {

    public static ArrayList list = new ArrayList();
    public static Scanner input = new Scanner(System.in);

    public static int op = 1, i, rep, index;
    public static boolean repeat = true;
    public static String item = "";

    public static void listing() {
        if (list.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (i = 0; i < list.size(); i++) {
                System.out.println("Item [" + i + "]: " + list.get(i));
            }
            System.out.println("A lista possui: " + list.size() + " item(ns)");
        }
    }

    public static void repeatCondition() {
        System.out.println("Repetir a ação? (1) Sim (2) Não ");
        rep = input.nextInt();
        if (rep == 2) {
            repeat = false;
        }
    }

    public static void remove(int index) {
        if (index < list.size() && index > -1) {
            list.remove(index);
        } else {
            System.out.println("Index não existente.");
        }
    }

    public static void add(String value) {
        list.add(value);
        System.out.println("Item salvo.");
    }

    public static void main(String[] args) {

        while (op != 0) {
            System.out.println(" == Lista de compras == ");
            System.out.println("1 -  Adicionar na lista");
            System.out.println("2 -  Listar compras");
            System.out.println("3 -  Remover item");
            System.out.println("4 -  Modificar item compras");
            System.out.println("5 -  Apagar item por conteúdo");
            System.out.println("Digite sua opção:");
            op = input.nextInt();

            switch (op) {
                case 1: //inserir itens
                    do {
                        input.nextLine();
                        System.out.println("Insira um item: ");
                        add(input.nextLine());
                        listing();
                        repeatCondition();
                    } while (repeat);
                    break;
                case 2: //imprimir lista
                    listing();
                    break;
                case 3: // retirar itens
                    do {
                        System.out.println("Informe o índice do item que deseja remover: ");
                        remove(input.nextInt());
                        repeatCondition();
                    } while (repeat);
                    break;
                case 4:
                    do {
                        System.out.println("Informe o índice do item que deseja modificar: ");
                        index = input.nextInt();
                        System.out.println("Informe o item: ");
                        list.set(index, input.next());
                        repeatCondition();
                    } while (repeat);
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia, sem itens para remover");
                    } else {
                        if (list.isEmpty()) {
                            System.out.println("Não existe mais itens para excluir");
                        } else {
                            input.nextLine();
                            System.out.println("Informe o item que deseja excluir: ");
                            item = input.nextLine();
                            for (i = 0; i < list.size(); i++) {
                                if (list.get(i).equals(item)) {
                                    list.remove(i);
                                    System.out.println("Removido com sucesso.");
                                } else {
                                    System.out.println("Conteúdo não encontrado");
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Tchau");
            }
        }
    }
}
