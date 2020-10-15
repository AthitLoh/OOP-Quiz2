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
public class Q1Test {
    public static void main ( String [] args ) {

    Computing computing = new Computing (" PSUCoC ", 1) ;
    computing . admitStudents ( -10) ;
    computing . admitStudents (10) ;
    Environment te = new Environment (" PSUTE ", 6) ;
    te . printInfo () ;
    Hospitality fht = new Hospitality (" PSUFHT ", 5 , 100) ;
    fht . printInfo () ;

    }
}
