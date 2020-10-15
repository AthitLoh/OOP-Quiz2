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
public class Computing extends Faculty{
    
    public Computing(String name, int buildingNumber){
        super(name,0);
    }
    
    @Override
    public void admitStudents (int numStudents) {
        
        if(numStudents < 0){
            System.out.println("ERROR: cannot admit a negative number of students.");
        }
        else{
            this.numStudents = this.numStudents + numStudents ;
            System.out.println(" Successfully admit "+ numStudents +"students ");
            printInfo () ;
        }

    }
}
