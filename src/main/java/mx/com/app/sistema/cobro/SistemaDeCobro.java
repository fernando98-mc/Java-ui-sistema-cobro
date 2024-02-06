/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mx.com.app.sistema.cobro;

import mx.com.app.sistema.cobro.ui.PanelMain;
import mx.com.app.sistema.cobro.ui.PanelPrincipal;

/**
 *
 * @author Userr
 */
public class SistemaDeCobro {

    public static void main(String[] args) {
        PanelMain panelMain = new PanelMain();
        panelMain.setVisible(true);
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                //panelMain.jlbPorcentaje.setVisible(true);
                panelMain.jlbPorcentaje.setText(Integer.toString(i) + "%");
                panelMain.pgbBarra.setValue(i);

                if (i == 100) {
                    panelMain.setVisible(false);
                    panelPrincipal.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
