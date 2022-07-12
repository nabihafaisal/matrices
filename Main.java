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
        //System.out.println(secondMatrix.getelem(2,2));

        //Matrix mat = secondMatrix.add(firstMatrix);


        //Matrix mat1= secondMatrix.multiply(firstMatrix);
      /*  MatrixColWise M=new MatrixColWise(3,4);
        M.toString(M.setelem(1,1,2));
*/
        //matrix2Darray b=(M.delinearize());
        //M.toString(M.setelem(1,3,2));


      /*  MatrixColWise n=new MatrixColWise(4,4);
        M.toString(n.setelem(0,0,3));
        System.out.println(M.getelem(0,0));
        Matrix mat=n.add(M);
        Matrix mat1=n.multiply(M);

*/
        /*MatrixRowWise N=new MatrixRowWise(4,4);
        N.toString(N.setelem(0,0,2));
*/      //  MatrixRowWise o=new MatrixRowWise(4,4);

        //N.toString(o.setelem(0,0,5));
        //Matrix mat=N.add(o);
        //Matrix mat1=N.multiply(o);*/


    }
}