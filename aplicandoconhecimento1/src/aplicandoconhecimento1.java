/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class aplicandoconhecimento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1,2);
        Ponto p2 = new Ponto(4,6);
        System.out.println("p1=>" + p1);
        System.out.println("p2 =>"+ p2);
        System.out.println("iguais=>" +p1.equals(p2));
        System.out.println("distancias=>"+p1.distancia(p2));
    }
    
}
