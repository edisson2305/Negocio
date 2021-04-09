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
    
    private String codArtista;
    private String tipoObra;
    private String cedulaFK;
    private Double precio;
    
    
    public Artista() {
    }

    public Artista(String codArtista) {
        this.codArtista = codArtista;
    }

    public Artista(String codArtista, String tipoObra, String cedulaFK, Double precio) {
        this.codArtista = codArtista;
        this.tipoObra = tipoObra;
        this.cedulaFK = cedulaFK;
        this.precio = precio;
    }

    public String getCodArtista() {
        return codArtista;
    }

    public void setCodArtista(String codArtista) {
        this.codArtista = codArtista;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getCedulaFK() {
        return cedulaFK;
    }

    public void setCedulaFK(String cedulaFK) {
        this.cedulaFK = cedulaFK;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
   

    
    
  
    

}
