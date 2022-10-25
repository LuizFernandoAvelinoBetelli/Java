package aulapolimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author f290ti
 */
public class Animal {
    
    //Atributos 
    private int tam;
    private String nome;
    
    //construtor da classe animal
    
    public Animal(int tam, String nome){
        this.tam= tam;
        this.nome= nome;
        
    }
    
    public void mover(){
        System.out.println("Movendo!!!!");
        
    }
    
    public int getTam(){
        return tam;
    }
    
   public String getN(){
       return nome;
   }
    
}
