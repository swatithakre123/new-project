import java.util.Scanner;
class _2DArray
{
      public static void main(String[] args) {
        
            int [][]a = new int[2][2];
            int [][]b = new int[2][2];

            Scanner sc = new Scanner(System.in);

            for(int i=0; i<a.length; i++)
            {
                 for(int j=0; j<a.length; j++)
                 {
                       a[i][j] = sc.nextInt();
                 }
            }

            for(int i=0; i<b.length; i++)
            {
                 for(int j=0; j<b.length; j++)
                 {
                       b[i][j] = sc.nextInt();
                     
                 }
            }

            System.out.println("Two Matrices are");


            for(int i=0; i<a.length; i++)
            {
                 for(int j=0; j<a.length; j++)
                 {
                     System.out.print(a[i][j]+" ");
                 }
                 System.out.println();
            }
          

            for(int i=0; i<b.length; i++)
            {
                 for(int j=0; j<b.length; j++)
                 {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();

            }
            
      }
}