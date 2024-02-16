/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen5p2_hectorrivera;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hriverav
 */
public class Civilies extends Usuario{
    ArrayList<tramite> Tramites = new ArrayList<>();

    public Civilies() {
    }

    public Civilies(String nombre, String apellido, String contraseña, String sexo, String departamento, String numID, Date FN) {
        super(nombre, apellido, contraseña, sexo, departamento, numID, FN);
    }

    public ArrayList<tramite> getTramites() {
        return Tramites;
    }

    public void setTramites(ArrayList<tramite> Tramites) {
        this.Tramites = Tramites;
    }
    
}
