import java.util.Scanner;
public class PascalsTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a=0,b=0,c=0,d,e=0,f=0,g=0,N=sc.nextInt();
        int []A=new int[100];
        int []B=new int[100];
        c=N*2/2;
        A[0]=1;
        A[1]=1;
        for(a=1;a<=N;a++)
        {
            d=0,f=0;
            for(b=1;b<=N*2-1;b++)
            {
                if(b<c)//2
                    System.out.print(" ");
                else if(b<((N*2)/2)+a)
                {
                    if(f==5)
                    {
                        System.out.print(" ");
                        f=0;
                    }
                    else
                    {
                        if(b==c||b==(N*2/2)+a-1)
                        {
                            System.out.print("1");
                            if(a>2)
                            g=A[d]+A[d+1];
                            if(b==c)
                                A[d]=1;
                            else
                                A[d+1]=1;
                        }
                        else
                        {
                            System.out.print(g);
                            d++;
                            e=g;
                            g=A[d]+A[d+1];
                            A[d]=e;
                        }
                        f=5;
                    }
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            c--;
        }
    }
}
