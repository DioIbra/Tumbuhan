/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakhlukHidup;

/**
 *
 * @author LENOVO
 */
public abstract class Tumbuhan {

        public int bunga;
    public String jenis;
    
    public void disiram(){ 
        System.out.println("hewan ini sedang disiram");
    }
    
    public abstract void fotosintesis(); 
    public abstract void tumbuh(); 

}
