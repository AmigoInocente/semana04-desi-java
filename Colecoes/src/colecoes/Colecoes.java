package colecoes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alisson_formento
 */
public class Colecoes {// COLEÇÕES DE FERRAMENTAS PARA MANIPULARMOS DADOS NA PROGRAMAÇÃO, COMO O ArrayList

    public static void main(String[] args) {
        
       //List alunos2 = new ArrayList<>(); //CRIOU UMA LISTA
       ArrayList alunos = new ArrayList<>(); //CRIOU UMA LISTA
        
       alunos.add("Alisson"); //ELEMENTO 0
       alunos.add("Fernando"); //ELEMENTO 1
       alunos.add(100); //ELEMENTO 2
       alunos.add(true); //ELEMENTO 3

        alunos.remove("Fernando");
        alunos.remove(2);
        
        alunos.add(2.23);
        alunos.add(false);
        
        alunos.lastIndexOf("Alisson"); //SE HOUVER MAIS DE UM ELEMENTO IGUAL, ELE PEGARÁ O ÚLTIMO
        
        //System.out.println(alunos.isEmpty());
        
        //System.out.println(alunos.get(alunos.size() - 1));
                
        //System.out.println(alunos.contains("Alisson"));// BUSCA O ELEMENTO(STRING, NUMERO OU BOOLEANO) E RETORNA UM BOOLEANO(TRUE OU FALSE)
       
        //System.out.println(alunos.get(2)); //*LISTA*.get PUXA O ELEMENTO NA POSIÇÃO DO NUMERO
       
        //System.out.println(alunos);
        
        /*
        ArrayList<String> frutas = new ArrayList(); // GENETICS
        String fruta = JOptionPane.showInputDialog(null,"INFORME A FRUTA");
        frutas.add (fruta);
               fruta = JOptionPane.showInputDialog(null,"INFORME A FRUTA");
        frutas.add (fruta);
        
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }
        
        for(String fruit: frutas){
            System.out.println(fruit);
        }
        
        frutas.forEach((item) -> {
            System.out.println(item);
        });
        
        System.out.println(frutas);
        */
        
        
    ArrayList<Integer> PAR = new ArrayList<>(); //CRIOU UMA LISTA
    ArrayList<Integer> IMPAR = new ArrayList<>(); //CRIOU UMA LISTA
    ArrayList<Integer> INTEIROS = new ArrayList<>(); //CRIOU UMA LISTA
    
    for (int i = 0; i < 10; i++) {
           String numero = JOptionPane.showInputDialog(null,"INFORME QUAL NÚMERO DESEJA COLOCAR NA LISTA");
           int numeroInteiro = Integer.parseInt(numero);
        if(numeroInteiro % 2 == 1){
            IMPAR.add(numeroInteiro);
            INTEIROS.add(numeroInteiro);
            
        }else if(numeroInteiro % 2 == 0){
            PAR.add(numeroInteiro);
            INTEIROS.add(numeroInteiro);
        }
        
    }
        JOptionPane.showMessageDialog(null, PAR);
        JOptionPane.showMessageDialog(null, IMPAR);
        JOptionPane.showMessageDialog(null, INTEIROS);
}
    
    /*
    1) Faça um programa que leia 20 números inteiros e 
    armazene-os numa lista. armazene os números em 
    pares na lista PAR e os números IMPARES na lista impar.
    Imprima os três.
    
    2) Faça os programas que receba a temperatura média 
    de cada mês do ano e armazene-as em uma lista. 
    Após isto, calcule a média anual das temperaturas e 
    mostre todas as temperaturas acima da média anual. 
    e em que mês elas ocorreram (mostrar o mês por 
    extenso: 1 - Janeiro, 2- Fevereiro, ...).
    
    3) Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
    As perguntas são:
    
    "Telefonou para a vítima?" 
    "Devia para a vítima?" 
    "Esteve no local do crime?"
    "Mora perto da vítima?" 
    "Já trabalhou com a vítima?"
    
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
    entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele serpa classificado 
    como "Inocente".
    */
    
    
    
    
    
}
