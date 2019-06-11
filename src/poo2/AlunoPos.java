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
public class AlunoPos extends Aluno {
    
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public AlunoPos(String especialidade, String ra, String nome, double media) {
        super(ra, nome, media);
        setEspecialidade(especialidade);
    }

    @Override
    public void calcularMedia(double n1, double n2) throws NotaException {
        if ((n1 < 0) || (n2 < 0)) {
            throw new NotaException();
        } else {
            setMedia((n1 * 3 + n2 * 4) / 7);
        }
    }

    @Override
    public String cadastro() {
        return getRa() + "\t" + getNome() + "\t" + getMedia();
    }
    
    
}
