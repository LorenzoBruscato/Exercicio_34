package principal;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        aluno.leitura();
        aluno.imprimir();
        JOptionPane.showMessageDialog(null, "Nome formatado do Aluno: " + aluno.getNomeFormatado());

        professor.leitura();
        professor.imprimir();
        JOptionPane.showMessageDialog(null, "Nome formatado do Professor: " + professor.getNomeFormatado());
    }
}
