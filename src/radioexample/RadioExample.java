/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioexample;

/**
 *
 * @author kaj9
 */
public class RadioExample {
    String station;
    int volume;
    int bass;
    int treble;
    boolean power;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hello Keith!");// TODO code application logic here
        Radio boombox = new Radio("one",2,3,4,true);
    }
    
    public static void Rumpf()  {
        System.out.println("Steven");
    }
}
