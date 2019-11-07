/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase que representa al candidato que busca una oferta de empleo 
 * @author sistemas
 */

public class Candidato {
    
    private String nombre;
    private String documento;
    private double aspiracionSalarial;
    private Estudio nivelEstudio;
    private Experiencia historial; 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getAspiracionSalarial() {
        return aspiracionSalarial;
    }

    public void setAspiracionSalarial(double aspiracionSalarial) {
        this.aspiracionSalarial = aspiracionSalarial;
    }

    public Estudio getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(Estudio nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    
    public Experiencia getHistorial() {
        return historial;
    }

    public void setHistorial(Experiencia historial) {
        this.historial = historial;
    }
    
}
