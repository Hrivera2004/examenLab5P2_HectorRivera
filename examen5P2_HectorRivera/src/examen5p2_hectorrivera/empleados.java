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
public class empleados extends Usuario{
    private String carrera,puesto;
    private int añosT;//años trabajando

    public empleados() {
    }

    public empleados(String carrera, String puesto, int añosT, String nombre, String apellido, String contraseña, String sexo, String departamento, String numID, Date FN) {
        super(nombre, apellido, contraseña, sexo, departamento, numID, FN);
        this.carrera = carrera;
        this.puesto = puesto;
        this.añosT = añosT;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAñosT() {
        return añosT;
    }

    public void setAñosT(int añosT) {
        this.añosT = añosT;
    }
    
}
