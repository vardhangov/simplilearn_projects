package singleandmulti;

import java.util.Scanner;

public class SingleArray
{
    public static void main(String args[])
    {
        int a[]=new int[10], i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 10 numbers");
        for(i=0; i<10; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("List of even numbers");
        for(i=0; i<10; i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
