package view.listas.util;

import controller.AutoControlador;
import controller.TDA.Listas.Execptions.VacioExpection;
import javax.swing.JComboBox;
import model.Auto;

public class Util_VistaLinked {

    public static void cargaAuto(JComboBox cbxAuto) throws VacioExpection {
        AutoControlador mc = new AutoControlador();

        cbxAuto.removeAllItems();
        try {
            for (int i = 0; i < mc.getAutos().getSize(); i++) {
                cbxAuto.addItem(mc.getAutos().get(i));
            }
        } catch (VacioExpection e) {
            e.printStackTrace();
        }

    }

    public static Auto getComboAuto(JComboBox cbx) {
        return (Auto) cbx.getSelectedItem();
    }

}
