/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae2.xleeji00;

import java.util.Random;

/**
 * Set of Methods
 * int rows, cols : size of Matrix
 * int [][] m : 2D Matrix
 * values : each element of Matrix
 * 
 * @author leehu
 */
class Matrix {
    int rows, cols;
    int [][] m;
    int values;
    Random random = new Random();

    /**
     * constructor, Creates a matrix of size rows x cols and 
     * initializes all values with random numbers from 0 to 10
     * 
     * @param rows : Size of row
     * @param cols : Size of column
     * 
     */
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        m = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                values = random.nextInt(11);
                setValueAtIndex(i,j,values);
            }
        }
    }
    
    /**
     * Sets value at index (i,j) to value
     * 
     * @param i : index of row
     * @param j : index of column
     * @param value : random number to set element of index (i,j)
     */
    public void setValueAtIndex(int i, int j, int value){
        m[i][j]=value;
    }
    
    /**
     * returns value at index(i,j)
     * 
     * @param i : index of row
     * @param j : index of column
     * @return : element of index(i,j)
     */
    public int getValueAtIndex(int i, int j){
        return m[i][j];
    }
    
    /**
     * prints the values of the matrix
     * 
     */
    public void printMatrix(){
        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(getValueAtIndex(i,j) + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * creates and returns a new matrix.
     * The new matrix is filled with the values of addition of the matrix this
     * with matrix m
     * 
     * @param m : Original(Current) Matrix
     * @return : new Matrix which sum with m
     */
    public Matrix addMatrix(Matrix m){
        Matrix m2 = new Matrix(rows, cols);
        
        System.out.println("----- New Matrix -----");
        m2.printMatrix();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                m2.m[i][j] += m.m[i][j];
            }
        }
        
        return m2;
    }
    
    /**
     * multiplies each value of the matrix by constant k
     * 
     * @param k : constant to multiply
     */
    public void multiplyByConsant(int k){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                m[i][j] *= k;
            }
        }
    }
    
    /**
     * returns the average value of the matrix
     * 
     * @return : average of matrix
     */
    public double getAverageValue(){
        double avg = 0;
        double cnt = rows * cols;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                avg += m[i][j];
            }
        }
        
        avg /= cnt;
        
        return avg;
    }
    
    /**
     * returns true if the matrix is diagonally dominant,
     * otherwise returns false
     * 
     * @return : specificity the matrix is diagonally dominant
     */
    public boolean isDiagonallyDominant(){
        boolean flag = true;
        int sum=0;  
        
        if ( rows!=cols ) {
            flag = false;
            return flag;
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (i==j){
                    continue;
                }
                else{
                    sum += Math.abs(m[i][j]);
                }
            }
            if (Math.abs(m[i][i])<sum){
                flag = false;
                break;
            }
            else{
                sum = 0;
            }
        }
        
        return flag;
    }
}


/**
 * demonstrate functionally
 * 
 * @author leehu
 */
public class TestMatrix {
    /**
     * @param args the command line arguments
     * 
     * int n1 : size of row. If none, error
     * int n2 : size of column If none, error
     * int n3 : constant to multiply. If none, it is filled to 10
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2, n3;
        Random r = new Random();
        
        n1 = r.nextInt(10) + 1;
        n2 = r.nextInt(10) + 1;
        n3 = r.nextInt(10) + 1;
        
        Matrix M1 = new Matrix(n1, n2);
        Matrix M2,M3;
        
        System.out.println("----- Current Matrix -----");
        M1.printMatrix();
        
        M2 = M1.addMatrix(M1);
        System.out.println("----- Addition of Matrix -----");
        M2.printMatrix();
        
        M3=M1;
        System.out.println("----- Multiply of Matrix -----");
        M3.multiplyByConsant(n3);
        M3.printMatrix();
        
        System.out.println();
        System.out.println("Average of Matrix is " + M1.getAverageValue());
        System.out.println("Diagonally Dominant : " + M1.isDiagonallyDominant());
         
    }   
 }