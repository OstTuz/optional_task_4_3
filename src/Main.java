import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final int SIZE;
        final int M;
        System.out.print("Input SIZE of array: ");
        SIZE = scanner.nextInt();
        System.out.print("Input parametr M (interval from -M to M): ");
        M = scanner.nextInt();


        int [][] a = new int[SIZE][SIZE];   //creating an array of elements
        int []result = new int[SIZE];       //creating array of results

        for (int i = 0; i < SIZE; i++)      //initialisation of array
        {
            for (int j = 0; j < SIZE; j++)
            {
                a[i][j] = (int)(Math.random()*(2*M)-M+1);
            }
        }

        for (int i = 0; i < SIZE; i++)      //output array
        {
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < SIZE; i++)      //calculation
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (a[i][j] > 0)
                {
                    for (int k = j+1; k < SIZE; k++)
                    {
                        if (a[i][k] > 0)
                        {
                            break;
                        }else {
                            result[i] += a[i][k];
                        }
                    }
                    break;
                }
            }
        }


        System.out.println("======================");

        for (int i = 0; i < SIZE; i++)      //output result
        {
            System.out.print(result[i]+" ");
        }


    }
}
