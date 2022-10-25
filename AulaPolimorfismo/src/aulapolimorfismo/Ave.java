package aulapolimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author f290ti
 */
public class Ave extends Animal {
    
    public Ave(int tam, String nome){
        //superclasse
        
        super(tam, nome);
        
    }
    
    @Override
    public void mover(){
        System.out.println("Ave pula");
    }
    
}
