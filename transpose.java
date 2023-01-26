
import java.util.*;

public class findx {


    public static void main(String args[])
    {
        Scanner mc=new Scanner(System.in);
        int n=mc.nextInt();
        int m=mc.nextInt();
        int ar[][]=new int[n][m];
        int tr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=mc.nextInt();
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
               tr[j][i]=ar[i][j];
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(tr[i][j]);
            }
            System.out.println();
        }



        

    
    

    }
        }
