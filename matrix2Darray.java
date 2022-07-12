package com.B20102130;

 public class matrix2Darray implements Matrix{

    private double [][]data ;

    int h;
    int w;




//using height width in array
    public matrix2Darray (int height,int width){
        this.h=height;
        this.w=width;
        data=new double[height][width];

    }


//null constructor
     public matrix2Darray() {

     }
      public String toString(double[][] data) {

         for (int i = 0; i < data.length; i++) {
             for (int j = 0; j < data[i].length; j++) {
                 System.out.print(data[i][j]+" ");
             }
             System.out.println();
         }
         return null;
    }


     @Override
    public double getelem(int i, int j) {
         return data[i][j];
    }


    @Override
    public double[][] setelem(int i, int j, double value) {
        data[i][j]=value;

        return data;
    }

     @Override
     public Matrix add(Matrix other) {
         matrix2Darray mat=new matrix2Darray(h, w);

         for (int i=0;i< data.length;i++){
             for (int j=0;j< data[i].length;j++){
                 mat.data[i][j]=this.data[i][j]+other.getelem(i,j);

             }
         }
         for (int i = 0; i < mat.data.length; i++) {
             for (int j = 0; j < mat.data[i].length; j++) {
                 System.out.print(mat.data[i][j]+" ");
             }
             System.out.println();
         }
         return mat;
     }



     @Override
     public Matrix multiply(Matrix other) {
        matrix2Darray mat1=new matrix2Darray(h,w);
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[i].length;j++){
                for (int k=0;k<data[j].length;k++){
                    mat1.data[i][j]+=this.data[i][k]* other.getelem(k,j);
                }
            }

        }
         for (int i = 0; i < mat1.data.length; i++) {
             for (int j = 0; j < mat1.data[i].length; j++) {
                 System.out.print(mat1.data[i][j]+" ");
             }
             System.out.println();
         }
         return mat1;
     }


 }