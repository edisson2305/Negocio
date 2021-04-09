/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Steve
 */
public class Cliente {
    
    private String codCliente;
    private String historial;
    private String cedulaFK;

    public Cliente() {
    }

    public Cliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    
    public Cliente(String codCliente, String historial, String cedulaFK) {
        this.codCliente = codCliente;
        this.historial = historial;
        this.cedulaFK = cedulaFK;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getCedulaFK() {
        return cedulaFK;
    }

    public void setCedulaFK(String cedulaFK) {
        this.cedulaFK = cedulaFK;
    }
    
    
    
}
