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
public class Radio {
    private String station;
    private final int volume;
    private final int bass;
    private final int treble;
    private final boolean power;
    private String display;
    
    public Radio(String station, int volume, int bass, int treble, boolean power){
        this.station = station;
        this.volume = volume;
        this.bass = bass;
        this.treble = treble;
        this.power = power;
    }
    
    public int getTreble(){
        return treble;
    }
    public int getBass(){
        return bass;
    }
    public boolean getPower(){
        return power;
    }
    public String getStation(){
        return station;
    }
    public int getVolume(){
        return volume;
    }
    
    public void ChangeStation(String stationName){
        station = stationName;
    }
    
    public void ChangeStation(int freq){
        station = Character.toString((char)freq);
    }
    
    public String Display(){
        String display1;
        String track = this.getSation();
        String title = null;
        
        display1 = track + title;
    return display1;
    }

    private String getSation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
