import java.util.*;
public  class Linkedlist{
   public static class Node{
    //structure of the node
    int data;
    Node next;
    Node(int data){
        //assigning the values using default constructor
        this.data=data;
        this.next=null;
    }
   }

   //head to store the address of first node
   public static Node head;
   //insert at first
public static void addfirst(int data){
    //create new node
    Node newnode=new Node(data);
    //store the first node address
    newnode.next=head;
    //move head to newnode
    head=newnode;

}
//add last of the linked list
public static void addlast(int data){
    //create new node
    Node newnode=new Node(data);
    //check whether the head node is null if it is null assign newnode
    if(head==null){
        head=newnode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
}

public static void printll(){
    //assign head to temp for traversal
    Node temp=head;
    //traverse
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    if(temp==null)System.out.print("null");
}

public static void countnodes(){
    //assign head to temp variable
    Node temp=head;
    //initialize count with zero
    int count=0;
    //traverse through linked list
    while(temp!=null){
    //increment count and temp
        count++;
        temp=temp.next;
    }
    System.out.print(count);
}
// insert at any position 
 public static void insertAny(int pos,int data){
    //new node creation
    Node newnode=new Node(data);
    //assign head to temp
     Node temp=head;
    //intialize countwith 0
    int count=0;
    while(temp!=null){
        count++;
        if(count==pos-1){
            Node extra =temp.next;
            temp.next=newnode;
            newnode.next=extra;
            return;    
        }
        temp=temp.next;

    }
 }
 public static void removefirst(){
    //move current head position to next node
    head=head.next;
 }
 public static void removelast(){
    Node temp=head;
    if(head==null)System.out.println("list is empty");
     while(temp.next.next!=null){
        temp=temp.next;
     }
    temp.next=null;

 }
 public static void removeAtPos(int pos){
    Node temp=head;
    int count=0;
    while(temp!=null){
        count++;
        if(count==pos-1){
            temp.next=temp.next.next;
            return;
        }
        temp=temp.next;
    }
 }
 public static Boolean fetch(int key){
    Node temp=head;
    while(temp!=null){
        if(temp.data==key)return true;
        temp=temp.next;
    }
    return false;
 }
 //delete the middle element you dont know size of the list
 //similar to two pointer approach
 public static void deleteMiddleElement(){
    //assign head to fast and slow pointers
    Node slow=head;
    Node fast=head.next;
    //codition
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    //assign node to slow pointer
    slow.next=slow.next.next;
 }
 //detecting and breaking the loop in the list
 public static void detectAndDeleteLoop(){
    // take tow pointers fast and slow
    Node slow=head;
    Node fast=head.next;
    /*here we get exception if there is no loop to handle that  we use the condition fast.next!=null*/
    while(fast.next!=null&&fast!=slow){
        slow=slow.next;
        fast=fast.next.next;
    }
    /*assign fast.next or slow.next to null*/
    if(fast==slow)fast.next=null;
 }
 public static void selectionSort(){
    
    Node fixed=head;
    while(fixed!=null){
        Node temp=fixed.next;
    while(temp!=null){
        if(temp.data<fixed.data){
            int var=temp.data;
            temp.data=fixed.data;
            fixed.data=var;
        }
        temp=temp.next;    
        }
        fixed=fixed.next;        
    }
    }
    // public  static Node removeDuplicates(Node head){
    //     ArrayList<Integer> arr=new ArrayList<>();
    //     Node temp=head;
    //     while(temp!=null){
    //         if(!arr.contains(temp.data))
    //         arr.add(temp.data);
    //         else
    //         temp=temp.next;
    //     }
    //     temp=head;
    //     for(int i=0;i<arr.size();i++){
    //         System.out.println(arr.get(i));
    //         temp.data=arr.get(i);
           
    //         if(i==arr.size()-1){
    //             temp.next=null;
    //         }
    //         temp=temp.next;
    //     }
    //     return head;
        
    // }time complexity of this is code is O(n^2)
 
    public  static void removeDuplicates(Node head){
        if(head==null)return;
        HashSet<Integer> arr=new HashSet<>();
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(!arr.contains(temp.data)){
            arr.add(temp.data);
            prev=temp;
        }
            else{
            prev.next=temp.next;
            }
        temp=temp.next;
        }
        
    }
public static Node rightrotate(int k){
    if(head==null)return head;
    Node temp=head;
    int count=1;
    while(temp.next!=null){count++;temp=temp.next;}
     k=k%count;
     if(k==0)return head;
    temp.next=head;
    temp=temp.next;
    Node prev=null;
    for(int i=0;i<k;i++){
        prev=temp;
        temp=temp.next;
    }
    prev.next=null;
    head=temp;
    return head;
}

public static Node rotateLeft(Node head,int k){
    if(head==null)return head;
    Node temp=head;
    int count=1;
    while(temp.next!=null){count++;temp=temp.next;}
    k=k%count;
    if(k==0)return head;
    temp.next=head;
    temp=temp.next;
    Node prev=null;
    for(int i=0;i<count-k;i++){
        prev=temp;
        temp=temp.next;
    }
    prev.next=null;
    head=temp;
    return head;
    
}
public static Node oddEvensegrigation(){
    if (head == null) {
        return head;
    }
    Node odd=new Node(-1);
    Node even=new Node(-1);
    Node oddhead=odd;
    Node evenhead=even;
    Node temp=head;
    int index=0;
    while(temp!=null){
        if(index%2==0){
            even.next=temp;
            even=even.next;
            
        }
        else{
            odd.next=temp;
            odd=odd.next;
            

        }
        index++;
        temp=temp.next;
    }
    odd.next=null;
    even.next=oddhead.next;
    return evenhead.next;
    
}
public static Node zeroOneTwo(){
    Node temp=head;
    Node zero=new Node(-1);
    Node one=new Node(-1);
    Node two=new Node(-1);
    Node zerohead=zero;Node onehead=one;Node twohead=two;
    while(temp!=null){
        if(temp.data==0){
            zero.next=temp;
            zero=zero.next;
        }
        else if(temp.data==1){
            one.next=temp;
            one=one.next;
        }
        else{
            two.next=temp;
            two=two.next;
        }
        temp=temp.next;
    }
    
    two.next=null;
    if(onehead.next==null) zero.next=twohead.next;
    
    else {zero.next=onehead.next;
    one.next=twohead.next;}
    return zerohead.next;
}

public static void middleElement(){//tortoiseHare method
    Node fast=head.next;
    Node slow=head;
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println(slow.data);
                  
}
// public static Node reverseLinkedlist(Node head){
//     if(head==null|| head.next==null)return head;
//     Node next=null;
//     Node prev=null;
//     Node cur=head;
//     while(cur!=null){
//         next=cur.next;
//         cur.next=prev;
//         prev=cur;
//         cur=next;   
//     }

    
//     return prev;
// }
public static Node reverseLinkedlist(Node head){
    if(head==null ||head.next==null)return head;
    Node temp=head.next;
    Node prev=null;
    Node cur=head;
    while(temp!=null){
        cur.next=prev;
        prev=cur;
        cur=temp;
        temp=temp.next;
    }
    cur.next=prev;
    
    return cur;
}


public static void main(String args[]){

head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
head.next.next.next.next=new Node(5);
head.next.next.next.next.next=new Node(6);
//  addfirst(1);
//  addlast(7);
//  countnodes();
//  insertAny(5, 100);
//  removefirst();
//  removelast();
//  removeAtPos(3);
//  System.out.print(fetch(6));
//  deleteMiddleElement();
//  detectAndDeleteLoop();
//selectionSort();
//removeDuplicates(head);
//head=rightrotate(1);
//head=rotateLeft(head,5);
//head=oddEvensegrigation();
//head=zeroOneTwo();
//middleElement();
head=reverseLinkedlist(head);
printll();

}

}