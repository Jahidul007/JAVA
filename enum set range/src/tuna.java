/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jahidul Islam
 */
public enum tuna {
    jahid ("nice","22"),
    Mihira("Ctia","10"),
    Julia("big","12"),
    nicole("italian","13"),
    candy("Different","14"),
    erin("iwish","16");
    private final String desc;
    private final String year;
    
    tuna(String description,String birthday){
        desc=description;
        year=birthday;
    }
    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
    
}