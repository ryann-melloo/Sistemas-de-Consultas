
package main;

import javax.swing.SwingUtilities;
import views.TelaInicial;
import controllers.TelaInicialController;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                TelaInicial tela = new TelaInicial();

                new TelaInicialController(tela);

                tela.setVisible(true);
            }
        });
    }
}
