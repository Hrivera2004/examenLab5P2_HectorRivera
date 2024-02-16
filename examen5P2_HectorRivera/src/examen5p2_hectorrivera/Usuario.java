/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen5p2_hectorrivera;

import java.util.Date;

/**
 * @author hriverav
 */
public class Usuario {
    private String nombre, apellido, contraseña,sexo,departamento,numID;
    private Date FN;

    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, String contraseña, String sexo, String departamento, String numID, Date FN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numID = numID;
        this.FN = FN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public Date getFN() {
        return FN;
    }

    public void setFN(Date FN) {
        this.FN = FN;
    }

    @Override
    public String toString() {
        return numID;
    }
    
    
}
