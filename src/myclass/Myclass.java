/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author Dulmi
 */
public class Myclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n=1, i, j;
        for(i=0; i<10; i++)
        {
            for(j=0; j<10; j++)
            {
                System.out.print(n+ "  ");
                n++;
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
