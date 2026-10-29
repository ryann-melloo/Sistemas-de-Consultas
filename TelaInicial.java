
package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaInicial extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblBoasVindas;
    private JButton btnAgendar;

    public TelaInicial() {

        setTitle("Sistema da Clinica Medica");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        lblTitulo = new JLabel(
            "Sistema da Clinica Medica",
            SwingConstants.CENTER
        );

        lblTitulo.setFont(
            new Font("Arial", Font.BOLD, 22)
        );

        lblBoasVindas = new JLabel(
            "Bem-vindo! Agende sua consulta.",
            SwingConstants.CENTER
        );

        btnAgendar = new JButton("Agendar consulta");

        JPanel painelBotao = new JPanel(
            new FlowLayout(FlowLayout.CENTER)
        );

        painelBotao.add(btnAgendar);

        add(lblTitulo, BorderLayout.NORTH);
        add(lblBoasVindas, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);
    }

    public JButton getBtnAgendar() {
        return btnAgendar;
    }
}
