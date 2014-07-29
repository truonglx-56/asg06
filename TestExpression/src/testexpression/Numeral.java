/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testexpression;

/**
 *
 * @author TruongLX
 */
public class Numeral extends Expression{
    private 
            int value;
    
    public Numeral(){
        value=0;
    }
    public   Numeral(int n){
        value =n;
    }
    public String toString(){
        String t="";
        t=value+t;
        return t;
    }
    }
