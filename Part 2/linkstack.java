/*PROGRAM 29
 Write a program to implement stack using linklist.
 */
class linkstack
{
Node top;
int number;
public linkstack()
{top=null;
number=0;}

public boolean isEmpty()
{return top==null;}

public int size()
{return number;}

public void push(int obj)
{top=new Node(obj,top);
number++;}

public int pop()
{if(isEmpty())
return(0);
Node tmp=top;
top=tmp.getlink();
return tmp.getdata();
}
}