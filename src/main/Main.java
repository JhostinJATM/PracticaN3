/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.AutoControlador;
import controller.VendedorControlador;
import model.Auto;
import model.Vendedor;

/**
 *
 * @author Jhostin
 */
public class Main {

    public static void main(String[] args) {

//        AutoControlador autoController = new AutoControlador();
//        Auto auto1 = new Auto(autoController.generarId(), "Rouge", 25000.0, "Toyota", "2022");
//        autoController.setAuto(auto1);
//        autoController.save();
//
//        AutoControlador autoController1 = new AutoControlador();
//        Auto auto2 = new Auto(autoController1.generarId(), "Bleu", 22000.0, "Nissan", "2023");
//        autoController1.setAuto(auto2);
//        autoController1.save();
//
//        AutoControlador autoController2 = new AutoControlador();
//        Auto auto3 = new Auto(autoController2.generarId(), "Gris", 28000.0, "Hyundai", "2021");
//        autoController2.setAuto(auto3);
//        autoController2.save();
//
//        AutoControlador autoController3 = new AutoControlador();
//        Auto auto4 = new Auto(autoController3.generarId(), "Noir", 35000.0, "Peugeot", "2022");
//        autoController3.setAuto(auto4);
//        autoController3.save();
//
//        AutoControlador autoController4 = new AutoControlador();
//        Auto auto5 = new Auto(autoController4.generarId(), "Blanc", 20000.0, "Audi", "2023");
//        autoController4.setAuto(auto5);
//        autoController4.save();
//
//        AutoControlador autoController5 = new AutoControlador();
//        Auto auto6 = new Auto(autoController5.generarId(), "Vert", 30000.0, "Citroën", "2024");
//        autoController5.setAuto(auto6);
//        autoController5.save();
//
//        AutoControlador autoController6 = new AutoControlador();
//        Auto auto7 = new Auto(autoController6.generarId(), "Jaune", 27000.0, "Ford", "2023");
//        autoController6.setAuto(auto7);
//        autoController6.save();
//
//        AutoControlador autoController7 = new AutoControlador();
//        Auto auto8 = new Auto(autoController7.generarId(), "Rose", 32000.0, "Renault", "2022");
//        autoController7.setAuto(auto8);
//        autoController7.save();
//
//        AutoControlador autoController8 = new AutoControlador();
//        Auto auto9 = new Auto(autoController8.generarId(), "Noir", 40000.0, "Volkswagen", "2024");
//        autoController8.setAuto(auto9);
//        autoController8.save();
//
//        AutoControlador autoController9 = new AutoControlador();
//        Auto auto10 = new Auto(autoController9.generarId(), "Blanc", 18000.0, "Honda", "2023");
//        autoController9.setAuto(auto10);
//        autoController9.save();
//
//        VendedorControlador vendedorController = new VendedorControlador();
//        Vendedor vendedori1 = vendedorController.getVendedor();
//        vendedori1.setId(vendedorController.generarId());
//        vendedori1.setNombre("Antoine");
//        vendedori1.setApellido("Beaumont");
//        vendedori1.setCorreoElectronico("antoine@gmail.com");
//        vendedori1.setDireccion("Rue A");
//        vendedori1.setRuc("123456789");
//        vendedori1.setNumeroTelefonico("123-456-7890");
//        vendedorController.setVendedor(vendedori1);
//        vendedorController.save();
//
//        VendedorControlador vendedorController1 = new VendedorControlador();
//        Vendedor vendedori2 = vendedorController1.getVendedor();
//        vendedori2.setId(vendedorController1.generarId());
//        vendedori2.setNombre("Lucien");
//        vendedori2.setApellido("Moreau");
//        vendedori2.setCorreoElectronico("lucien@gmail.com");
//        vendedori2.setDireccion("Rue B");
//        vendedori2.setRuc("987654321");
//        vendedori2.setNumeroTelefonico("987-654-3210");
//        vendedorController1.setVendedor(vendedori2);
//        vendedorController1.save();
//
//        VendedorControlador vendedorController2 = new VendedorControlador();
//        Vendedor vendedori3 = vendedorController2.getVendedor();
//        vendedori3.setId(vendedorController2.generarId());
//        vendedori3.setNombre("Camille");
//        vendedori3.setApellido("Leclerc");
//        vendedori3.setCorreoElectronico("camille@gmail.com");
//        vendedori3.setDireccion("Rue C");
//        vendedori3.setRuc("456789123");
//        vendedori3.setNumeroTelefonico("456-789-1230");
//        vendedorController2.setVendedor(vendedori3);
//        vendedorController2.save();
//
//        VendedorControlador vendedorController3 = new VendedorControlador();
//        Vendedor vendedori4 = vendedorController3.getVendedor();
//        vendedori4.setId(vendedorController3.generarId());
//        vendedori4.setNombre("Pierre");
//        vendedori4.setApellido("Dubois");
//        vendedori4.setCorreoElectronico("pierre@gmail.com");
//        vendedori4.setDireccion("Rue D");
//        vendedori4.setRuc("789123456");
//        vendedori4.setNumeroTelefonico("789-123-4560");
//        vendedorController3.setVendedor(vendedori4);
//        vendedorController3.save();
//
//        VendedorControlador vendedorController4 = new VendedorControlador();
//        Vendedor vendedori5 = vendedorController4.getVendedor();
//        vendedori5.setId(vendedorController4.generarId());
//        vendedori5.setNombre("Gabrielle");
//        vendedori5.setApellido("Durand");
//        vendedori5.setCorreoElectronico("gabrielle@gmail.com");
//        vendedori5.setDireccion("Rue E");
//        vendedori5.setRuc("321654987");
//        vendedori5.setNumeroTelefonico("321-654-9870");
//        vendedorController4.setVendedor(vendedori5);
//        vendedorController4.save();
//
//        VendedorControlador vendedorController5 = new VendedorControlador();
//        Vendedor vendedori6 = vendedorController5.getVendedor();
//        vendedori6.setId(vendedorController5.generarId());
//        vendedori6.setNombre("Isabelle");
//        vendedori6.setApellido("Rousseau");
//        vendedori6.setCorreoElectronico("isabelle@gmail.com");
//        vendedori6.setDireccion("Rue F");
//        vendedori6.setRuc("654789321");
//        vendedori6.setNumeroTelefonico("654-789-3210");
//        vendedorController5.setVendedor(vendedori6);
//        vendedorController5.save();
//
//        VendedorControlador vendedorController6 = new VendedorControlador();
//        Vendedor vendedori7 = vendedorController6.getVendedor();
//        vendedori7.setId(vendedorController6.generarId());
//        vendedori7.setNombre("Sylvie");
//        vendedori7.setApellido("Lefevre");
//        vendedori7.setCorreoElectronico("sylvie@gmail.com");
//        vendedori7.setDireccion("Rue G");
//        vendedori7.setRuc("987321654");
//        vendedori7.setNumeroTelefonico("987-321-6540");
//        vendedorController6.setVendedor(vendedori7);
//        vendedorController6.save();
//
//        VendedorControlador vendedorController7 = new VendedorControlador();
//        Vendedor vendedori8 = vendedorController7.getVendedor();
//        vendedori8.setId(vendedorController7.generarId());
//        vendedori8.setNombre("Francis");
//        vendedori8.setApellido("Leroux");
//        vendedori8.setCorreoElectronico("francis@gmail.com");
//        vendedori8.setDireccion("Rue H");
//        vendedori8.setRuc("456987321");
//        vendedori8.setNumeroTelefonico("456-987-3210");
//        vendedorController7.setVendedor(vendedori8);
//        vendedorController7.save();
//
//        VendedorControlador vendedorController8 = new VendedorControlador();
//        Vendedor vendedori9 = vendedorController8.getVendedor();
//        vendedori9.setId(vendedorController8.generarId());
//        vendedori9.setNombre("Luleth");
//        vendedori9.setApellido("Roussel");
//        vendedori9.setCorreoElectronico("luleth@gmail.com");
//        vendedori9.setDireccion("Rue I");
//        vendedori9.setRuc("789654321");
//        vendedori9.setNumeroTelefonico("789-654-3210");
//        vendedorController8.setVendedor(vendedori9);
//        vendedorController8.save();
//
//        VendedorControlador vendedorController9 = new VendedorControlador();
//        Vendedor vendedori10 = vendedorController9.getVendedor();
//        vendedori10.setId(vendedorController9.generarId());
//        vendedori10.setNombre("Jacques");
//        vendedori10.setApellido("Fournier");
//        vendedori10.setCorreoElectronico("jacques@gmail.com");
//        vendedori10.setDireccion("Rue J");
//        vendedori10.setRuc("321789654");
//        vendedori10.setNumeroTelefonico("321-789-6540");
//        vendedorController9.setVendedor(vendedori10);
//        vendedorController9.save();

    }
}
