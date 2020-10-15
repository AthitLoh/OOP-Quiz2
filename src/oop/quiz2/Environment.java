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
public class Environment extends Faculty{
    
    public Environment(String name, int buildingNumber){
        super(name,0);
    }
    
    @Override
    public void printInfo () {

        System.out.println( "Go Green" + this.name);

    }
}
