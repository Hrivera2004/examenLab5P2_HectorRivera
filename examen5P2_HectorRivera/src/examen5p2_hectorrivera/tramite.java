/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen5p2_hectorrivera;

import java.util.Date;

/**
 *
 * @author hriverav
 */
public class tramite {
    private String nombre, ID_usada;
    private Date FechaEnviada;

    public tramite() {
    }

    public tramite(String nombre, String ID_usada, Date FechaEnviada) {
        this.nombre = nombre;
        this.ID_usada = ID_usada;
        this.FechaEnviada = FechaEnviada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID_usada() {
        return ID_usada;
    }

    public void setID_usada(String ID_usada) {
        this.ID_usada = ID_usada;
    }

    public Date getFechaEnviada() {
        return FechaEnviada;
    }

    public void setFechaEnviada(Date FechaEnviada) {
        this.FechaEnviada = FechaEnviada;
    }
    
}
