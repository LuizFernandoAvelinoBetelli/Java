package aulapolimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author f290ti
 */
public class Peixe extends Animal{
           
    public Peixe(int tam, String nome){
        //superclasse
        super(tam, nome);
    }
    
    @Override   
    public int getTam(){
        return super.getTam();
    }
    
    @Override
    public void mover(){
        
        System.out.println("tamanho: "+super.getTam());
        System.out.println(" Peixe Anda");
        
    }
    
}
