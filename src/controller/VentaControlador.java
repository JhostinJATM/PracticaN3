package controller;

import controller.Ventas.DataAccessObject;
import controller.TDA.Listas.Execptions.VacioExpection;
import controller.TDA.Listas.LinkedList;
import controller.util.Utilidades;
import java.lang.reflect.Field;
import java.util.Arrays;
import model.Venta;

public class VentaControlador extends DataAccessObject<Venta> {

    private Venta venta = new Venta();
    private LinkedList<Venta> lista = new LinkedList<>();
    private Integer index = -1;

    public VentaControlador() {
        super(Venta.class);
    }

    public Venta getVenta() {
        if (venta == null) {
            venta = new Venta();
        }
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Boolean saved() {
        return save(venta);
    }

    public String generatedCode() {
        StringBuilder code = new StringBuilder();
        Integer length = listAll().getSize() + 1;
        Integer pos = Integer.toString(length).length();
        for (int i = 0; i < (10 - pos); i++) {
            code.append("0");
        }
        code.append(length.toString());
        return code.toString();
    }

    public LinkedList<Venta> getLista() {
        if (lista.isEmpty()) {
            lista = listAll();
        }
        return lista;

    }

    public Boolean update1(Integer i) {
        return update(venta, i);
    }

    public void setLista(LinkedList<Venta> lista) {
        this.lista = lista;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public LinkedList<Venta> ordenar(Integer type, String field, LinkedList<Venta> lista) throws VacioExpection, Exception {

        getVenta();
        Integer n = lista.getSize();
        Venta[] m = lista.toArray();
        Field faux = Utilidades.getField(Venta.class, field);
        if (faux != null) {
            for (int i = 0; i < n - 1; i++) {
                int k = i;
                Venta t = m[i];
                for (int j = i + 1; j < n; j++) {
                    Venta mj = m[j];
                    if (mj.comparar(t, field, type)) {
                        t = mj;
                        k = j;
                    }
                }
                m[k] = m[i];
                m[i] = t;
            }
            lista = lista.toList(m);
        } else {
            throw new Exception("No existe ese criterio de busqueda");
        }
        return lista;
    }

    public LinkedList<Venta> quickSort(Integer ascdec, String field, LinkedList<Venta> lista) throws VacioExpection, Exception {
        getVenta();
        Venta[] m = lista.toArray();
        quickSort(m, 0, m.length - 1, field, ascdec);
        return lista.toList(m);
    }

    private void quickSort(Venta[] arr, int low, int high, String field, Integer ascdec) throws Exception {
        if (low < high) {
            int pi = partition(arr, low, high, field, ascdec);

            quickSort(arr, low, pi - 1, field, ascdec);
            quickSort(arr, pi + 1, high, field, ascdec);
        }
    }

    private int partition(Venta[] arr, int low, int high, String field, Integer ascdec) throws Exception {
        Venta pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].comparar(pivot, field, ascdec)) {
                i++;

                Venta temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Venta temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public LinkedList<Venta> mergeSort(Integer ascdec, String field, LinkedList<Venta> lista) throws VacioExpection, Exception {
        getVenta();
        Venta[] m = lista.toArray();
        mergeSort(m, field, ascdec);
        return lista.toList(m);
    }

    private void mergeSort(Venta[] arr, String field, Integer ascdec) throws Exception {
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;

            Venta[] left = Arrays.copyOfRange(arr, 0, mid);
            Venta[] right = Arrays.copyOfRange(arr, mid, n);

            mergeSort(left, field, ascdec);
            mergeSort(right, field, ascdec);

            merge(arr, left, right, field, ascdec);
        }
    }

    private void merge(Venta[] arr, Venta[] left, Venta[] right, String field, Integer ascdec) throws Exception {
        int n1 = left.length;
        int n2 = right.length;

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (left[i].comparar(right[j], field, ascdec)) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public LinkedList<Venta> buscar(LinkedList<Venta> lista, String text) throws Exception {

        LinkedList<Venta> lo = this.ordenar(0, "nombre", lista);
        Venta[] m = lo.toArray();
        LinkedList<Venta> result = new LinkedList<>();
        for (int i = 0; i < lo.getSize(); i++) {
            result.add(m[i]);
        }
        return result;
    }

    public LinkedList<Venta> buscarPrecioMenores(LinkedList<Venta> lista, String text, Double precio) throws Exception {

        LinkedList<Venta> lo = this.ordenar(0, text, lista); 
        Venta[] m = lo.toArray();
        LinkedList<Venta> result = new LinkedList<>();
        for (int i = 0; i < lo.getSize(); i++) {
            System.out.println(m[i].getPrecio() + " < " + precio.doubleValue());
            if (m[i].getPrecio().doubleValue() < precio.doubleValue() + 1) {
                result.add(m[i]);
            }
        }
        return result;
    }

    public LinkedList<Venta> getVentas() {
        if (lista.isEmpty()) {
            lista = listAll();
        }
        return lista;
    }

}
