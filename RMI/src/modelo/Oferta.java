/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase que representa las ofertas de trabajo
 * @author sistemas
 */
public class Oferta {
    
    private String cargo;
    private int experiencia;
    private double salarioOfrecido;
    private String sectorEmpresa;
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalarioOfrecido() {
        return salarioOfrecido;
    }

    public void setSalarioOfrecido(double salarioOfrecido) {
        this.salarioOfrecido = salarioOfrecido;
    }

    public String getSectorEmpresa() {
        return sectorEmpresa;
    }

    public void setSectorEmpresa(String sectorEmpresa) {
        this.sectorEmpresa = sectorEmpresa;
    }
    
}
