/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class Ponto {
    private int x, y;
    public Ponto (int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Ponto {"+"x="+x+", y="+ y +'}';
    }
    @Override
    public boolean equals (Object o){
        Ponto p =(Ponto)o; //pesquisar sobre coerção ou casting
        return this.x == p.x && this.y == p.y;
    }
    public double distancia(Ponto p){
        double c1 = this.x - p.x;
        double c2 = this.y - p.y;
        return Math.sqrt(c1*c1+c2*c2);
    }
    
}
