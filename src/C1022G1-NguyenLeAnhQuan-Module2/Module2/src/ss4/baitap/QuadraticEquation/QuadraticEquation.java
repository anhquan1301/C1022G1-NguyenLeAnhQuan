package ss4.baitap.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDelta() {
        return getB()*getB() - 4* getA()*getC();
    }
    public double getRoot1(){
        return (-getB() + Math.sqrt(getDelta()))/2*getA();
    }
    public double getRoot2(){
        return (-getB() - Math.sqrt(getDelta()))/2*getA();
    }

}




