
package banco;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<CajeroAutomatico> cajeros;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        cajeros = new ArrayList<>();
        clientes  = new ArrayList<>();
    }

    //GETTERS    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public ArrayList<CuentaBancaria> getBaseDatos() {
        ArrayList<CuentaBancaria> cuentasAcumulador = new ArrayList<>();
        for (Cliente cliente : clientes) {
            for (CuentaBancaria cuentaBancaria : cliente.getCuentasBancarias()) {
                cuentasAcumulador.add(cuentaBancaria);
            }
        }
        return cuentasAcumulador;
    }

    public ArrayList<CajeroAutomatico> getCajeros() {
        return cajeros;
    }
    //SETTERS


    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
 
    public void setCuentasClientes(ArrayList<CuentaBancaria> cuentasClienteParam) {
        for (int i=0; i<clientes.size(); i++) {
            for (CuentaBancaria cuentaBancaria : clientes.get(i).getCuentasBancarias()) {
                for (CuentaBancaria cuentaBancariaParam : cuentasClienteParam) {
                    if(cuentaBancaria.getNroCuenta().equalsIgnoreCase(cuentaBancariaParam.getNroCuenta())){
                        clientes.get(i).setCuentaBancaria(cuentaBancariaParam);
                    }
                }
            }
        }
    }

    public void setCajeros(ArrayList<CajeroAutomatico> cajeros) {
        this.cajeros = cajeros;
    }
    
    //METODOS DE LA CLASE
    public void mostrarBaseDatos() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            for (CuentaBancaria cuentaBancaria : cliente.getCuentasBancarias()) {
            System.out.println(cuentaBancaria);
            }
            System.out.println("\n");
        }
    }

    public void abrirCajeros(){
        for (CajeroAutomatico cajero : cajeros) {
          cajero.start(this);   
        }
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    
    public void agregarClientes(ArrayList<Cliente> clientes){
        for (Cliente cliente : clientes) {
            this.clientes.add(cliente);
        }
    }
    
    
    public void agregarCajero(CajeroAutomatico cajero) {
        this.cajeros.add(cajero);
    }
    
    public void agregarCajeros(ArrayList<CajeroAutomatico> cajeros) {
        for (CajeroAutomatico cajero : cajeros) {
            this.cajeros.add(cajero);
        }
    }
    
    
}
