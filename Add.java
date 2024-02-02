/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratgy;

/**
 *
 * @author hp
 */
public class Add  implements Operations{

    @Override
    public int dooperations(int x, int y) {
        System.out.println("in Add function ");
        return x+y;
    }
    
}
 class Sub  implements Operations{

    @Override
    public int dooperations(int x, int y) {
        System.out.println("in Sub function ");
        return Math.abs(x-y);
    }
    
}
 class MUilt  implements Operations{

    @Override
    public int dooperations(int x, int y) {
        System.out.println("in MUilt function ");
        return x*y;
    }
    
}



