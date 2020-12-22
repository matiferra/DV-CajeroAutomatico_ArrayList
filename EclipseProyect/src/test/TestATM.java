package test;

import banco.*;
import java.util.ArrayList;

public class TestATM {

    public static void main(String[] args) {

        //CREAR CLIENTE
        Cliente c1 = new Cliente("Ferrario Matias", "34122541", "011-15242424");
        Cliente c2 = new Cliente("Roberto Rossa", "36545777", "011-15966581");
        Cliente c3 = new Cliente("Carlos F. Vazquez", "32487154", "011-15558249");
        
        c1.agregarCuentaBancaria(new CajaAhorros("51651", "1351351354", 66666, 70000.0));
        c2.agregarCuentaBancaria(new CuentaCorriente(10000, "165165884664", "541125469", 12345, 200500.25));
        c3.agregarCuentaBancaria(new CajaAhorros("51235", "165165884664", 99999, 54500.25));
        c3.agregarCuentaBancaria(new CuentaCorriente(5000, "91985544125", "955547213", 55555, 450000.25));

        //CREAR ARRAY DINAMICO CLIENTES
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        //CREAR CAJERO
        // HARDWARE
        Teclado teclado = new Teclado(6952235, "Toshiba", "2020");
        Buzon buzon = new Buzon(1531231, "BTV", "2020");
        Impresora impresora = new Impresora(9654223, "HP", "2020");
        Pantalla pantalla = new Pantalla(1657562, "LG", "2020");
        //INSTANCIAR OBJETO
        CajeroAutomatico ATM1 = new CajeroAutomatico(teclado, buzon, impresora, pantalla);
        
        // HARDWAREA
        teclado = new Teclado(5452125, "Genius", "2020");
        buzon = new Buzon(6631841, "JOMA", "2020");
        impresora = new Impresora(1254963, "EPSON", "2020");
        pantalla = new Pantalla(5657122, "Panasonic", "2020");
        //INSTANCIAR OBJETO
        CajeroAutomatico ATM2 = new CajeroAutomatico(teclado, buzon, impresora, pantalla);
        
        // HARDWARE
        teclado = new Teclado(934722, "Genius", "2020");
        buzon = new Buzon(2195832, "Arfe", "2020");
        impresora = new Impresora(5446942, "CONNON", "2020");
        pantalla = new Pantalla(7782119, "Samsung", "2020");
        //INSTANCIAR OBJETO
        CajeroAutomatico ATM3 = new CajeroAutomatico(teclado, buzon, impresora, pantalla);
        
        //CREAR ARRAY DINAMICO CAJEROS
        ArrayList<CajeroAutomatico> cajeros = new ArrayList<>();
        cajeros.add(ATM1);
        cajeros.add(ATM2);
        cajeros.add(ATM3);
        
        //CREAR BANCO
        Banco banco = new Banco("Galicia");
        banco.agregarClientes(clientes);
        banco.agregarCajeros(cajeros);
        
        //banco.mostrarBaseDatos();
        banco.abrirCajeros();

        

    }

}
