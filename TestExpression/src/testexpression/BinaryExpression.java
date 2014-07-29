/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testexpression;

/**
 *
 * @author TruongLX
 */ abstract class BinaryExpression extends Expression{
    public Expression Left(){}
    public Expression Right(){}
    public String toString(){}
    public int valuate(){return 0;
}
}
