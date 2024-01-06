package view.listas.util;

import controller.TDA.Listas.Execptions.VacioExpection;
import controller.VendedorControlador;
import javax.swing.JComboBox;
import model.Vendedor;

public class Util_VistaLinked2 {

    public static void cargarVendedor(JComboBox cbxAuto) throws VacioExpection {
        VendedorControlador mc = new VendedorControlador();

        cbxAuto.removeAllItems();
        try {
            for (int i = 0; i < mc.getVendedores().getSize(); i++) {
                cbxAuto.addItem(mc.getVendedores().get(i));
            }
        } catch (VacioExpection e) {
            e.printStackTrace();
        }

    }

    public static Vendedor getComboVendedor(JComboBox cbx) {
        return (Vendedor) cbx.getSelectedItem();
    }

}
