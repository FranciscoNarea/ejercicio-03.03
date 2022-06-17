/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Estudiante {
    private String nombre;
    private String carrera;
    private String correo; 
    private int codigo;
    private int ciclo;
    private int anionacimiento; 

    public Estudiante(String nombre, String carrera, String correo,int codigo, 
            int ciclo, int anionacimiento) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
        this.ciclo = ciclo;
        this.codigo = codigo;
        this.anionacimiento = anionacimiento;
    }
    
    public int ObtenerEdad(){
        Date dt= new Date();
        int edad=dt.getYear()-this.anionacimiento;
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    //Relacionar el estudiante con la calificacion
    public int getCodigo(int codigo) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnionacimiento() {
        return anionacimiento;
    }

    public void setAnionacimiento(int anionacimiento) {
        this.anionacimiento = anionacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", correo=" + correo + ", ciclo=" + ciclo + ", anionacimiento=" + anionacimiento + '}';
    }
    
    
    
}
