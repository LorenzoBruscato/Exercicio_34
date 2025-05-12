package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public abstract class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String getNomeFormatado();

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return ("Nome: " + getNome() + "\n"
                + "Idade: " + getIdade());
    }
}
