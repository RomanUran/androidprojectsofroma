package com.company;

public class Main {
    public static void main(String[] args) {

        int i;
        double max = 0;
        double min = 10;
        double Array[] = new double[20];
        for (i = 1; i <= 10; i++) {
            Array[i] = 23 * Math.random();
            System.out.print(" " + Math.round(Array[i]));
                if(Array[i] > max){
                    max = Array[i];}
                    if(Array[i] < min)
        {
                        min = Array[i];}
        }
                double Array2[] = new double[20];
                int j;
                    for(i=1;i<=10;i++) {
                        for(j=1;j<=10;j++)
                                if(Array[i]>Array2[j])
                                  //  Array2[]
                    }
            System.out.println(" ");
            System.out.println("Максимальное число: " + Math.round(max));
            System.out.println("Минимальное число: "+ Math.round(min));
    }
}
