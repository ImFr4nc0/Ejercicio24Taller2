/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double a,b,c;
       Scanner ent=new Scanner(System.in);
       System.out.print("ingresa a:");
        a=ent.nextDouble();
        System.out.print("ingresa b:");
        b=ent.nextDouble();
        System.out.print("ingresa c:");
        c=ent.nextDouble();
        if(a>b && a>b){
            System.out.println("La de mayor peso es la a");
        }
        else if(b>c){
            System.out.println("La de mayor peso es la b");
        }
        else{
            System.out.println("La de mayor peso es la c");
        }
    }
}
