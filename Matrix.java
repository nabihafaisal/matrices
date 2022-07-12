package com.B20102130;
interface Matrix{

     double getelem(int i , int j);
     double [][]setelem(int i, int j, double value);

     Matrix add(Matrix other);
     Matrix multiply(Matrix other);


}
