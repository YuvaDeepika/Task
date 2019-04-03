
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d)
        { 
               data = d; 
               next = null;
         }
    }
public class FindMiddle
{
    Node head;  
     public void addToTheLast(Node node) {
  if (head == null) {
   head = node;
  } else {
   Node temp = head;
   while (temp.next != null)
    temp = temp.next;
   temp.next = node;
  }
 }
	  
    
    public static void main(String args[])
    {
       
         
       
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			FindMiddle llist = new FindMiddle();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
          
        GFG gfgobj = new GFG(); 
		
		System.out.println(gfgobj.getMiddle(llist.head));
		
			t--;
		}
	}
}



class GFG
{
    
    int getMiddle(Node head)
   {
       int length=0;
       int number=0;
       int mid=0;
       Node temp=null;
         for(temp=head;temp!=null;temp=temp.next)
         {
             length++;
         }
         if(length%2!=0)
         {
          mid=(1+length)/2;
         }
         else
         {
             mid=Math.round((1+length)/2)+1;
             
         }
         int i=0;
         for(Node temp1=head;temp1!=null||i<length;temp1=temp1.next)
         {
             if(i==mid-1)
             {
                 number=temp1.data;
                 break;
             }
             i++;
         }
         return number;
       
   }
}

