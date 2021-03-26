/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Steve
 */
public class Artista {

    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechanacimiento;
    private int edad;
    private String telefono;
    private String tipoArte;
    private String sexo;
    private Image foto;
    
    
    public Artista() {
    }
    
    public Artista(String cedula, String nombres, String apellidos, Date fechanacimiento, int edad, String telefono, String tipoArte, String sexo, Image foto) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.tipoArte = tipoArte;
        this.sexo = sexo;
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoArte() {
        return tipoArte;
    }

    public void setTipoArte(String tipoArte) {
        this.tipoArte = tipoArte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    
    
    

}
