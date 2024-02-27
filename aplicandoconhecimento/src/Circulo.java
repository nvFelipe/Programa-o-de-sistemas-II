/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class Circulo extends FiguraGeometrica implements Calcula {
    private double raio;
    private Ponto centro;
    
    public Circulo(int x, int y, double raio, String cor){
        super(cor);
        this.centro = new Ponto(x,y);
        this.raio = raio;               
    }

    @Override
    public boolean compare(FiguraGeometrica o) {
        Circulo c = (Circulo) o;
        return c.centro==this.centro && c.raio == this.raio && getCor().equals(c.getCor());
    }

    @Override
    public double Area() {
        return Math.PI*(this.raio*this.raio);
    }

    @Override
    public double Perimetro() {
        return 2*Math.PI*this.raio;
    }
    
    public boolean interseccao (Circulo c){        
        return (this.centro.distancia(c.centro)) <= (this.raio + c.raio);
    }
    
}
