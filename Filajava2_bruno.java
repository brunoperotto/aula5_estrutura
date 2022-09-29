/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava2_bruno;

/**
 *
 * @author bperotto
 */
public class Filajava2_bruno {

    public static void main(String[] args) {
        
        Fila F = new Fila();
        Aluno al_A = new Aluno();
        Aluno al_B = new Aluno();
        Professor prof_A = new Professor();
        Professor prof_B = new Professor();
        TecAdmin tec_A = new TecAdmin();
        TecAdmin tec_B = new TecAdmin();
        Terceirizado ter_A = new Terceirizado();
        Terceirizado ter_B = new Terceirizado();
        Object obj = new Object();
        
        al_A.nome = "Bruno";
        al_A.matricula = 001;
        al_A.curso = "TSI";
        
        al_B.nome = "Geremias";
        al_B.matricula = 002;
        al_B.curso = "Ciência da Computação";
        
        prof_A.nome = "Milena";
        prof_A.suap = 001;
        prof_A.area = "Computação";
        
        prof_B.nome = "Carlos";
        prof_B.suap = 002;
        prof_B.area = "Pedagogia";
        
        tec_A.nome = "Madalena";
        tec_A.setor = "Biblioteca";
        
        tec_B.nome = "Jose";
        tec_B.setor = "Reitoria";
        
        ter_A.nome = "Maria";
        ter_A.id = 001;
        
        ter_B.nome = "Pedro";
        ter_B.id = 002;
        
        Fila fila = new Fila();
        fila.insere(al_A);
        fila.insere(prof_A);
        fila.insere(tec_A);
        fila.insere(ter_A);
        fila.insere(al_B);
        fila.insere(prof_B);
        fila.insere(tec_B);
        fila.insere(ter_B);
        
        if(fila.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover.");
        }else{
            obj = F.remove();
        }
        
        fila.imprimeElemento();
    }
}
