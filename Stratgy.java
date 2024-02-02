/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stratgy;

/**
 *
 * @author hp
 */
public class Stratgy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Operations operations =new Sub();
        
        Context context=new Context(operations);
        System.out.println(context.makeoperation(10, 20));
        
        
        
    }
    
}
