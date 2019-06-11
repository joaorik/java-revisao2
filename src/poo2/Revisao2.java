/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author John Doe
 */
public class Revisao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlunoGraduacao aluno1 = new AlunoGraduacao("RH", "123456", "Joao", 0);
        
        AlunoPos aluno2 = new AlunoPos("MBA", "987645", "Maria", 0);
        
        Chamada lista1 = new Chamada("Bolinha", "11/06/2019");
        
        try {
            aluno1.calcularMedia(-1, -7.9);
            aluno2.calcularMedia(7.5, 6.5);
        } catch (NotaException ex) {
            System.out.println(ex);
        }
        
        lista1.gerarChamada(aluno1);
        lista1.gerarChamada(aluno2);
    }
    
}
