/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unittest;
import  java.util.*;
/**
 *
 * @author deepakniranjan
 */
public class pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5,i,j,k=0,s=1;
       
        for(i=1;i<n;i++)
        {
            for(j=1;j<5;j++)
            {
                if((i==1)||(i==4)||(j==1)||(j==4))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                
                
             }
            System.out.println();
            }
        for( i = 1; i <=5; ++i,k=0) {
            for(j = 1; j <= 5 - i; ++j) {
                System.out.print("  ");
            }

            for(k=0;k != 2 * i - 1;k++) {
                System.out.print("* ");
                
            }

            System.out.println();
        }
        
        }
        
        
    }
    

