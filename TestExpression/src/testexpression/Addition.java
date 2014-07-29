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
public class Addition extends BinaryExpression{
    Expression Left,Right;
    public Addition(Expression Left, Expression Right){
        this.Left=Left;
        this.Right=Right;
    }
    public Expression Left(){
        return Left;
    }
    public Expression Right(){
        return Right;
    }
    public String toString(){
        String t="";
        t=t+"("+Left.toString()+"+"+Right.toString()+")";
        return t;
    }
    public int evaluate(){
        return Left.evaluate()+Right.evaluate();
    }
}
