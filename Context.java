/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratgy;

/**
 *
 * @author hp
 */
public class Context {
    
    Operations operations;
    
    public Context(Operations operations){
        this.operations=operations;
    }
    
   public int makeoperation(int x,int y){
       System.out.println("Your Function is :");
      return operations.dooperations(x, y);
   }
    
    
    
    
}
