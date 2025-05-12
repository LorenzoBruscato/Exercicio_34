package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Aluno extends Pessoa {
    
    String curso;
    public static final String OPCAO = "Sistema de Informação";
    
    public Aluno() {
    }
    
    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }
    
    public String getCurso() {
        return OPCAO;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void leitura() {
        super.leitura();
        setCurso(JOptionPane.showInputDialog("Curso:"));
    }
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }
    
    @Override
    public String paraString() {
        return super.paraString() + "\nCurso: " + getCurso();
    }
    
    @Override
    public String getNomeFormatado() {
        return getNome().toUpperCase();
    }
}
