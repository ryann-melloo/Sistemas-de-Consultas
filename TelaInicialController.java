
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.TelaInicial;
import views.TelaAgendamento;

public class TelaInicialController {

    private TelaInicial tela;

    public TelaInicialController(final TelaInicial tela) {

        this.tela = tela;

        this.tela.getBtnAgendar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    TelaAgendamento telaAgendamento =
                        new TelaAgendamento();

                    new AgendamentoController(
                        telaAgendamento, tela
                    );

                    telaAgendamento.setVisible(true);

                    tela.dispose();
                }
            }
        );
    }
}
