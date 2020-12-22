package banco;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String DNI;
    private String direccion;
    private String mail;
    private String telefono;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    public Cliente(String nombre, String DNI, String telefono){
        this(nombre, DNI, telefono, "","");
        this.cuentasBancarias = new ArrayList<>();
    }
    
    public Cliente(String nombre, String DNI, String direccion, String mail, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.mail = mail;
        this.telefono = telefono;
        this.cuentasBancarias = new ArrayList<>();
    }

    //GETTERS
    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return this.cuentasBancarias;
    }

    //SETTERS
    public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentaBancarias) {
        this.cuentasBancarias = cuentaBancarias;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancariaParam) {
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if(cuentaBancaria.getNroCuenta().equalsIgnoreCase(cuentaBancariaParam.getNroCuenta()));
            cuentaBancaria = cuentaBancariaParam;
        }
    }
    
    //METODOS DE LA CLASE
    public void agregarCuentaBancaria(CuentaBancaria cuenta){
        this.cuentasBancarias.add(cuenta);
    }

    public void agregarCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias){
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            this.cuentasBancarias.add(cuentaBancaria);
        }
    }

    @Override
    public String toString() {
        return "---------------------------\n"+
                "---------------------------\n"
                + "Cliente * " + nombre + " *"+
                "\nDNI: " + DNI + 
                "\nDireccion: " + direccion + 
                "\nMail: " + mail + 
                "\nTel.: " + telefono + '\n';
    }
 
    
    
    
}
