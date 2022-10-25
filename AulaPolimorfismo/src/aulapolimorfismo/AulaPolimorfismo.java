/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author f290ti
 */
public class AulaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal a;
        
        //Peixe
        a  = new Peixe(50, "Alberto");
        a.mover();
        
        //Sapo
        a = new Sapo(10, "Godo");
        a.mover();
        
        //Ave
        
        a = new Ave(100, "Sugar");
        a.mover();
        
        }
    
}
