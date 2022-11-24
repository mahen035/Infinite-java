package org.example;

class Calculation1
{
    int getSum(int x,int y)
    {
        int z=x+y;
        return z;
    }
}
 public class Calculation {
    public static void main(String args[]) {
        Calculation1 c = new Calculation1();
        int x = 10;
        int y = 30;
        System.out.println(c.getSum(x, y));
    }
}