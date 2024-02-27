/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public abstract class FiguraGeometrica {
    private String cor;
    public FiguraGeometrica(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor ; 
    }
    public abstract boolean compare(FiguraGeometrica outra);
    public abstract double Area();
    public abstract double Perimetro();    
}
