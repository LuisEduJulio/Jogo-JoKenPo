package jokenpo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JokenPo {

    public static void main(String[] args) {
    //DECLARAÇÃO DA STRING.
    String CONT, name;
    //INICIA O JOGO.
    JOptionPane.showMessageDialog(null,"JOKEN PO");
    //RODANDO O JOGO.
    do{
    ////ESCOLHA SUA OPÇÃO.
    name = JOptionPane.showInputDialog("ESCOLHA: \nPAPEL\nTESOURA\nPEDRA");
    
    //lISTA DE OPÇÕES DA MÁQUINA.
    List lista = new ArrayList();
    lista.add("TESOURA");
    lista.add("PEDRA");
    lista.add("PAPEL");
    
    //MÁQUINA SORTEIA OPÇÃO.
    int i = 1 + (int)(Math.random() * lista.size());
    JOptionPane.showMessageDialog(null,lista.get(i-1));
    
    //COMPARAÇÃO ENTRE AS ESCOLHAS.
    if(lista.get(i-1).equals("PEDRA") && "PEDRA".equals(name)
            ||lista.get(i-1).equals("TESOURA") && "TESOURA".equals(name)
            ||lista.get(i-1).equals("PAPEL") && "PAPEL".equals(name)){
        JOptionPane.showMessageDialog(null,"EMAPATAMOS");
    }else if(lista.get(i-1).equals("PEDRA") && "TESOURA".equals(name)
            ||lista.get(i-1).equals("PAPEL") && "PEDRA".equals(name)
            ||lista.get(i-1).equals("TESOURA") && "PAPEL".equals(name)){
        JOptionPane.showMessageDialog(null,"EU GANHEI!");   
    }else if(lista.get(i-1).equals("TESOURA") && "PEDRA".equals(name)
            ||lista.get(i-1).equals("PAPEL") && "TESOURA".equals(name)
            ||lista.get(i-1).equals("PEDRA") && "PAPEL".equals(name)){
        JOptionPane.showMessageDialog(null,"VOCÊ GANHOU!");    
    }else{
        JOptionPane.showMessageDialog(null,"VOCÊ DIGITOU ERRADO!");
    }
    
    //OPÇÃO PARA ENCERRAR JOGO OU CONTINUAR.
    CONT = JOptionPane.showInputDialog("QUER JOGAR DE NOVO? [SIM OU NÂO]");
    //CONDIÇÃO QUE RETORNA O JOGO OU FINALIZA.    
    }while(CONT.equals("SIM"));
        if(CONT.equals("NÃO")){
                JOptionPane.showMessageDialog(null,"ENCERRANDO PROGRAMA...");
                //FUNÇÃO QUE FINALIZA PROGRAMA.
                System.exit(0);
        }
  }
    
}
