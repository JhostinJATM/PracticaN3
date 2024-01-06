package controller;

import controller.Ventas.DataAccessObject;
import controller.TDA.Listas.Execptions.VacioExpection;
import controller.TDA.Listas.LinkedList;
import controller.util.Utilidades;
import java.lang.reflect.Field;
import model.Vendedor;
import model.Venta;

public class VendedorControlador extends DataAccessObject<Vendedor> {

    private LinkedList<Vendedor> vendedores = new LinkedList<>();
    private Vendedor vendedor;

    public VendedorControlador() {
        super(Vendedor.class);
    }

    public LinkedList<Vendedor> getVendedores() {
        if (vendedores.isEmpty()) {
            vendedores = this.listAll();
        }
        return vendedores;
    }

    public void setMarcas(LinkedList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Vendedor getVendedor() {

        if (vendedor == null) {
            vendedor = new Vendedor();
        }
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Boolean save() {

        this.vendedor.setId(generarId());
        return this.save(vendedor);
    }

    
    public LinkedList<Vendedor> ordenar(Integer type) throws VacioExpection {

        getVendedores();
        Integer n = vendedores.getSize();
        Vendedor[] m = vendedores.toArray();
        //Double Integer
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            Vendedor t = m[i];
            for (int j = i + 1; j < n; j++) {
                //condicion por objetos
                Vendedor mj = m[j];
                if (type == 0) {
                    if (mj.getNombre().compareTo(t.getNombre()) < 0) {
                        t = mj;
                        k = j;
                    }
                } else {
                    if (mj.getNombre().compareTo(t.getNombre()) > 0) {
                        t = mj;
                        k = j;
                    }
                }
            }
            m[k] = m[i];
            m[i] = t;
        }
        vendedores = vendedores.toList(m);
        return vendedores;
    }

    
    public LinkedList<Vendedor> ordenar(Integer type, String field, LinkedList<Vendedor> lista) throws VacioExpection, Exception {
 
        getVendedores();
        Integer n = lista.getSize();
        Vendedor[] m = lista.toArray();
        Field faux = Utilidades.getField(Venta.class, field);
        if (faux != null) {
        
            for (int i = 0; i < n - 1; i++) {
                int k = i;
                Vendedor t = m[i];
                for (int j = i + 1; j < n; j++) {
                    //condicion por objetos
                    Vendedor mj = m[j];
                    if (mj.comparar(t, field, type)) {
                        t = mj;
                        k = j;
                    }
                }
                m[k] = m[i];
                m[i] = t;
            }
            lista = lista.toList(m);
        }else{
            throw new Exception("No existe ese criterio de busqueda");
        }
        return lista;
    }

    public LinkedList<Vendedor> buscar(LinkedList<Vendedor> lista, String text) throws Exception{
        
        LinkedList<Vendedor> lo = this.ordenar(0, "nombre", lista); //ver video de youtbe 
        Vendedor[] m = lo.toArray();
        LinkedList<Vendedor> result = new LinkedList<>();
        for (int i = 0; i < lo.getSize(); i++) {
            if(m[i].getNombre().toLowerCase().startsWith(text.toLowerCase())){
                result.add(m[i]);
            }
        }
        return result;
    }
    
    public static void main(String[] args) throws VacioExpection {
//        VendedorControlador mc = new VendedorControlador();
//        try {
//            System.out.println(mc.buscar(mc.listAll(), "Adelaide").print()); 
//            
//        } catch (Exception ex) {
//            java.util.logging.Logger.getLogger(AutoControlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }
}
