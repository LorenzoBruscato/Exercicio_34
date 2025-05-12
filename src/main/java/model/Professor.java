package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Professor extends Pessoa {

    String titulo;
    Double salario;
    public static final String OPCAO = "Doutor";

    public Professor() {
    }

    public Professor(String titulo, Double salario, String nome, int idade) {
        super(nome, idade);
        this.titulo = titulo;
        this.salario = salario;
    }

    public String getTitulo() {
        return OPCAO;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void leitura() {
        super.leitura();
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return super.paraString()
                + "\nSalário: " + getSalario()
                + "\nTítulo: " + getTitulo();
    }

    @Override
    public String getNomeFormatado() {
        return getTitulo() + " " + getNome();
    }
}
