/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.quiz2;

/**
 *
 * @author coc
 */
enum PSUCampus {
    PHUKET,SONGKLA, PATTANI, TRANG, SURAT;
}
public class PSUFaculty extends Faculty{
    
    private PSUCampus campus;
    
    public PSUFaculty( String name , int buildingNumber , PSUCampus campus ) {

        super(name,0);
        this.campus = campus ;

    }
    
    @Override
    public void printInfo () {
        
        if(this.campus == PSUCampus.SONGKLA){
            System.out.println( "Main Campus: " + this.name);
        }
        else{
            System.out.println( "Non-Main Campus: " + this.name);
        }

    }
    
    public boolean nameContainsPSU(){
        String str = this.name;
        if(str.endsWith("PSU")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String convertSongklaToPhuket(){
        String str = this.name;
        if(str.endsWith("Songkla")){
            return this.name + str.endsWith("Phuket");
        }
        else{
            return this.name = this.name;
        }
    }
}
