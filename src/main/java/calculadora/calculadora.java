package calculadora;

import calculadora.NewInterface;

public class calculadora implements NewInterface {

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the aa
     */
    public static int getAa() {
        return aa;
    }

    /**
     * @param aAa the aa to set
     */
    public static void setAa(int aAa) {
        aa = aAa;
    }
    private int n1;
    private int num2;
    public calculadora(int a, int b){
        n1=a;
        num2=b;
    }
 
    @Override
    public int suma(){
        int result=getN1()+getNum2()+getAa();
        return result;
    }
    private static int aa = 2;
   
    @Override
    public int resta(){
        int result=getN1()-getNum2()+getAa();
        return result;
    }
    public int multiplicar(){
        int result=getN1()*getNum2()+getAa();
        return result;
    }
    public int divide(){
        int result=getN1()/getNum2();
        return result;
    }

 }
