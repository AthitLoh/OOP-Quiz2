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
public class Q2Test {
    public static void main ( String [] args ) {

    PSUFaculty psu = new PSUFaculty (" Faculty at Songkla ,Prince of Songkla University ", 20 ,PSUCampus.SONGKLA) ;
    System.out.println ( psu.nameContainsPSU () ) ;
    String output = psu.convertSongklaToPhuket () ;
    System.out.println ( output ) ;
    psu.printInfo () ;
    psu = new PSUFaculty (" Phuket Campus , PSU", 5 ,
    PSUCampus.PHUKET ) ;
    System.out.println( psu.nameContainsPSU () ) ;
    output = psu.convertSongklaToPhuket () ;
    System.out.println ( output ) ;
    psu.printInfo () ;

    }
}
