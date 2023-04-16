
package com.mycompany.cap4_ejer23_ig;


public class Operaciones {
    float x;
    Operaciones(){
    }
    public float setFormula_cuadratica1(float a,float b, float c){
        x = (float) ((-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a));
        return x;
    }
    public float setFormula_cuadratica2(float a,float b, float c){
        x = (float) ((-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a));
        return x;
    }
}
