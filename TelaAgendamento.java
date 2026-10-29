
package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAgendamento extends JFrame {

    private JTextField txtNome;
    private JTextField txtEspecialidade;

    private JButton btnConfirmar;
    private JButton btnLimpar;
    private JButton btnVoltar;

    public TelaAgendamento() {

        setTitle("Agendamento de Consulta");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel lblTitulo = new JLabel(
            "Agendamento de Consulta",
            JLabel.CENTER
        );

        lblTitulo.setFont(
            new Font("Arial", Font.BOLD, 20)
        );

        JPanel painelCampos = new JPanel(
            new GridLayout(2, 2, 10, 10)
        );

        painelCampos.add(
            new JLabel("Nome do paciente:")
        );

        txtNome = new JTextField();
        painelCampos.add(txtNome);

        painelCampos.add(
            new JLabel("Especialidade medica:")
        );

        txtEspecialidade = new JTextField();
        painelCampos.add(txtEspecialidade);

        btnConfirmar = new JButton(
            "Confirmar agendamento"
        );

        btnLimpar = new JButton("Limpar");
        btnVoltar = new JButton("Voltar");

        JPanel painelBotoes = new JPanel(
            new FlowLayout()
        );

        painelBotoes.add(btnConfirmar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnVoltar);

        add(lblTitulo, BorderLayout.NORTH);
        add(painelCampos, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtEspecialidade() {
        return txtEspecialidade;
    }

    public JButton getBtnConfirmar() {
        return btnConfirmar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }
}
