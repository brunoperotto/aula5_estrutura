/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava2_bruno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Fila {
    List <Object> obj = new ArrayList<>();
    
    //Procedimentos
    void insere(Object A){
        this.obj.add(A);
    }
    
    void imprimeElemento(Object obj){
        if(obj instanceof Aluno){
            System.out.println("Nome do Aluno é: "+((Aluno) obj).nome);
            System.out.println("Matrícula do Aluno é: "+((Aluno) obj).matricula);
        }else{
            if(obj instanceof Professor){
                System.out.println("Nome do Professor é: "+((Professor) obj).nome);
                System.out.println("O Suap é: "+((Professor) obj).suap);
                System.out.println("Trabalha na àrea: "+((Professor) obj).nome);
            }else{
                if(obj instanceof TecAdmin){
                    System.out.println("Nome do Técnico Administrativo é: "+((TecAdmin) obj).nome);
                    System.out.println("Setor é: "+((TecAdmin) obj).setor);
                }else{
                    if(obj instanceof Terceirizado){
                        System.out.println("Nome do Terceirizado: "+((Terceirizado) obj).nome);
                        System.out.println("ID é: "+((Terceirizado) obj).id);
                    }
                }
            }
        }
    
    //Funções
    Object remove(){
        return (this.obj.remove(0));
    }
    boolean fila_vazia(){
        return (this.obj.isEmpty());
    }
    
    
}
