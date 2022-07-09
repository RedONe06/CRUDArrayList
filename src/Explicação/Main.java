package Explicação;

import java.util.ArrayList;

/**
 * @author s.lucas
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        
        if(list.isEmpty()){
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia");
        }
        System.out.println("Na lista tem: " + list.size());
        
        //métodos para inserção
        list.add("Feijão preto");
        list.add("Arroz integral");
        
        //métodos para mostrar o elemento;
        System.out.println("Item da lista: " + list.get(0));
        System.out.println("Item da lista: " + list.get(1));
        
        //método para verificar quantidade
        System.out.println("Na lista tem: " + list.size() + " item");
        
        //método para verificar se o array está vazio ou cheio
        if(list.isEmpty()){
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia");
        }
        
        //método para modificar o elemento da lista
        list.set(0, "Feijão Branco");
        System.out.println("Item da lista: " + list.get(0));
        System.out.println("Item da lista: " + list.get(1));
        
        //método para remover o item da lista
        list.remove(0);
        
        //método para limpar a lista
        list.clear();
        
        //método para verificar se o array está vazio ou cheio
        if(list.isEmpty()){
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia");
        }
    }
}
