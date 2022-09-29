/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava1_bruno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bperotto
 * Classe para montar a estrutura da fila
 */
public class fila {
    List <aluno> alunos = new ArrayList<>();
    
    //PROCEDIMENTOS
    
    void insere(aluno A){
        this.alunos.add(A);
        }
    
    void libera_fila(){ //Limpar os elementos dentro da fila
        this.alunos.clear();
    }
    
    void imprimir(aluno a){
        System.out.println("-----------------------------");
        System.out.println("O nome do aluno é: "+a.nome);
        System.out.println("O curso do aluno é: "+a.curso);
        System.out.println("A idade do aluno é: "+a.idade);
        System.out.println("A matrícula do aluno é: "+a.matricula);
        System.out.println("O semestre do aluno é:"+a.semestre);
    }
    
    //FUNÇÕES
    
    aluno remove(){
        return(this.alunos.remove(0)); //remove o primeiro índice da fila
    }
    
    boolean fila_vazia(){
        return(this.alunos.isEmpty()); //verificar se a fila está vazia
    }
    
}
