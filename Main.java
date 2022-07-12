package com.B20102130;



public class Main {

    public static void main(String[] args) {
        matrix2Darray firstMatrix = new matrix2Darray(3,3);
        matrix2Darray secondMatrix=new matrix2Darray(3,3);
        System.out.println("firstmatrice:");
        firstMatrix.setelem(2,2,1);
        firstMatrix.setelem(1,2,2);
        firstMatrix.setelem(0,0,1);
        firstMatrix.setelem(0,1,1);
        firstMatrix.toString(firstMatrix.setelem(0,2,1));

        System.out.println("secondmatrice:");
        secondMatrix.toString(secondMatrix.setelem(2,2,2));
        System.out.println(secondMatrix.getelem(2,2));

        Matrix mat = secondMatrix.add(firstMatrix);


        Matrix mat1= secondMatrix.multiply(firstMatrix);
   
    }
}
