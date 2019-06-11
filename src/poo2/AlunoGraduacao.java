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
public class AlunoGraduacao extends Aluno {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public AlunoGraduacao(String curso, String ra, String nome, double media) {
        super(ra, nome, media);
        setCurso(curso);
    }

    @Override
    public void calcularMedia(double n1, double n2) throws NotaException {
        if ((n1 < 0) || (n2 < 0)) {
            throw new NotaException();
        } else {
            setMedia((n1 + n2) / 2);
        }
    }

    @Override
    public String cadastro() {
        return getRa() + "\t" + getNome() + "\t" + getMedia();
    }
    
    
}
