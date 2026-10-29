
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.TelaAgendamento;
import views.TelaInicial;

public class AgendamentoController {

    private TelaAgendamento tela;
    private TelaInicial telaInicial;

    public AgendamentoController(
        final TelaAgendamento tela,
        final TelaInicial telaInicial
    ) {

        this.tela = tela;
        this.telaInicial = telaInicial;

        this.tela.getBtnConfirmar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    confirmarAgendamento();
                }
            }
        );

        this.tela.getBtnLimpar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    limparCampos();
                }
            }
        );

        this.tela.getBtnVoltar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    TelaInicial novaTela = new TelaInicial();

                    new TelaInicialController(novaTela);

                    novaTela.setVisible(true);

                    tela.dispose();
                }
            }
        );
    }

    private void confirmarAgendamento() {

        String nome = tela.getTxtNome()
            .getText().trim();

        String especialidade =
            tela.getTxtEspecialidade()
            .getText().trim();

        if (nome.length() == 0 ||
            especialidade.length() == 0) {

            JOptionPane.showMessageDialog(
                tela,
                "Preencha todos os campos!",
                "Aviso",
                JOptionPane.WARNING_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                tela,
                "Agendamento confirmado!\n\n" +
                "Paciente: " + nome + "\n" +
                "Especialidade: " + especialidade,
                "Confirmacao",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private void limparCampos() {

        tela.getTxtNome().setText("");
        tela.getTxtEspecialidade().setText("");

        tela.getTxtNome().requestFocusInWindow();
    }
}
