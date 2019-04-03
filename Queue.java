import java.io.*;
import java.util.*;

public class Queue{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int v=sc.nextInt();
            if(v==1)
            {
            q.add(sc.nextInt());
            }
            else if(v==2)
            {
int w=q.remove();
            }
            else
            {
                  System.out.println(q.peek());
            }
        } 
        
    }
}

