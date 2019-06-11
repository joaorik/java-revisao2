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
public class Chamada {
    
    private String professor;
    private String dia;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Chamada(String professor, String dia) {
        setProfessor(professor);
        setDia(dia);
    }
    
    void gerarChamada(Aluno aluno) {
        System.out.println(aluno.cadastro());
    }
    
}
