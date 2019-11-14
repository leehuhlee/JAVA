/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae1.xleeji00;

/**
 *
 * @author leehu
 */
public class TestFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2, n3;

        //Error 2: no argument specified.
        if (args.length == 0){
            System.out.println("no argument specified.");
            return;
        }
          
        //Error 3: incorrect number of arguments.
        if (args.length > 3 || args.length == 2){
            System.out.println("incorrect number of arguments.");
            return;
        }
        
        //Error 1: argument is not a number.
        for(int i=0; i<args.length; i++){
            for(int j=0; j<args[i].length(); j++){
                char c = args[i].charAt(j);
                if (c<48 || c>57){
                    System.out.println("argument is not a number.");
                    return;
                }
            }
        }
        
        //Example run 1
        if (args.length == 1){
            n1 = 0;
            n2 = 1;
            n3 = Integer.parseInt(args[0]); //String to Int 
        }
        
        //Example run 2
        else{
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            n3 = Integer.parseInt(args[2]);
            
            //Error : F1 >= F2
            if (n1 >= n2){
                System.out.println("Second number is not bigger than First number.");
                return;
            }
        }
        
        //Fibonacci Method Run
        TestFib Fibo = new TestFib();
        Fibo.fibo(n1, n2, n3);
    }
    
    /**
     *
     * @param fibo1 Starting number of fibonacci
     * @param fibo2 The number to sum first in fibonacci
     * @param n Counting number of fibonacci
     */
    public void fibo(int fibo1, int fibo2, int n){
        for (int i=0; i<n; i++){
                System.out.print(fibo1 + " ");
                int sum = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = sum;
            }
    }
}
