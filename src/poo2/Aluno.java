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
public abstract class Aluno extends NotaException implements TemplateAluno {

    private String ra;
    private String nome;
    private double media;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno(String ra, String nome, double media) {
        setRa(ra);
        setNome(nome);
        setMedia(media);
    }

    @Override
    public abstract void calcularMedia(double n1, double n2) throws NotaException;

    @Override
    public abstract String cadastro();
    
}
