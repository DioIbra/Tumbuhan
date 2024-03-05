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
public class melati extends Tumbuhan implements dikotil{
 private int umur;

    public melati() {
        System.out.println("Ini class melati");
    }
    
    
    private void bernafas(){
        System.out.println("Melati ini sedang bernafas");
    }

    
    public void getbernafas() {
        bernafas();
    }


    @Override
    public void fotosintesis() {
        System.out.println("Tumbuhan ini lagi fotosintesis");
    }

    @Override
    public void tumbuh() {
        System.out.println("mawar ini sedang tumbuh");
    }
    
    @Override
    public void berkambium() {
        System.out.println("tumbuhan berkambium");
    }
}