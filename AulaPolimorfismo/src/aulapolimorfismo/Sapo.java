package aulapolimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author f290ti
 */
public class Sapo extends Animal{
    public Sapo(int tam, String nome){
        
        //superclasse
        
        super(tam, nome);
    }
    
    public String getNome(){      
      return super.getN();
    }
    
    @Override
    public void mover(){
        System.out.println("Nome: "+super.getN());
        System.out.println("Sapo vooa");
    }
    
}
