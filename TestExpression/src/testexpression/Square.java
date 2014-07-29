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
public class Square extends Expression {
    public Expression expression; 
    public Square( Expression expression ){
        this.expression=expression;
    }
    @Override
    public String toString(){
        String t="";
        t=t+"("+expression.toString()+")^2";
        return t;
    }
    @Override
    public int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }

}

