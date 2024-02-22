
package sobrescrita;

import java.util.Scanner;

public class Testes {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("digite A ou B para instanciar um objeto das classes:");
        String opcao = ler.nextLine();
        A objA;
        if (opcao.equals("A"))
            objA = new A();
        else
            objA = new B();
        
        System.out.println("saida:"+objA.calcula());
    }
    
}

 
