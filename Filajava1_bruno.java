/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava1_bruno;

/**
 *
 * @author bperotto
 */
public class Filajava1_bruno {

    public static void main(String[] args) {
        
        aluno A = new aluno(); //instanciando alunos na classe aluno
        aluno B = new aluno();
        aluno C = new aluno();
        aluno D = new aluno();
        aluno E = new aluno();
        aluno resp = new aluno();
        
        A.nome = "Bruno";
        A.curso = "TSI";
        A.idade = 20; 
        A.matricula = 1001;
        A.semestre = 2;
        
        B.nome = "Pedro";
        B.curso = "TSI";
        B.idade = 30;
        B.matricula = 1002;
        B.semestre = 1;
        
        C.nome = "Camila";
        C.curso = "TSI";
        C.idade = 21;
        C.matricula = 1000;
        C.semestre = 2;
        
        D.nome = "Diana";
        D.curso = "Alimentos";
        D.idade = 27;
        D.matricula = 999;
        D.semestre = 4;
        
        E.nome = "Paloma";
        E.curso = "Alimentos";
        E.idade = 24;
        E.matricula = 998;
        E.semestre = 4;
        
        fila fila = new fila(); //instancia a fila declarada na classe fila
        
        fila.insere(D); //insere aluno D
        fila.insere(E); //insere aluno E
        fila.insere(B); //insere aluno B
        
        if(fila.fila_vazia()){ //chama a checagem se a fila está vazia da classe fila
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();//chama a função de remoção da classe fila
            fila.imprimir(resp);
        }
        
        fila.insere(A); //insere aluno A
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();
            fila.imprimir(resp);
        }
        
        fila.insere(C); //insere aluno C
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();
            fila.imprimir(resp);
        }
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();
            fila.imprimir(resp);
        }
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();
            fila.imprimir(resp);
        }
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            resp = fila.remove();
            fila.imprimir(resp);
        }

        
    }
}
