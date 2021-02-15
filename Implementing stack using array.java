//Krenare Syla
//COMP 2313
//Homework 2
//Implementing stack using array

// This program enables the user to insert 6 values(which can be adjusted in line 68) in a memory. The user will be able to see the entered values and delete them according to the principle of stack, starting from the very last one inserted. There is going to be a feature where it shows the peek(the one in the top, without deleting) element. It also warns the user when the stack is full and there is no place to push(insert) elemnets. If no elements were pushed,and if there is the request of two of them to be popped, the program will let the user know that the stack is empty and there is no value to be deleted. 

public class Main 
{
//variables: size, array, top
int size;
int array[];
int top;
// we create Main constructor to 
public Main(int size) {

this.size= size;

this.array = new int[size];
this.top = -1;
}
//Method isFull() will be used to check if the stack is full or there is still place to add push(insert elements)
public boolean isFull() 
{
return (size-1 == top);
}
//Method isEmpty() will be used to check if the stack is empty. If it is empty it wil alert that there is no element to be deleted
public boolean isEmpty()
{
return (top == -1);
}
//peek() method wil be used to return the top element in the stack, without deleting it
public int peek()
{
return array[top];
}
public void push(int num)
{
if(!isFull()){

array[++top] = num;
  
   System.out.println("Element Inserted "+num);
}
else
{
 System.out.println("Sorry! Here you inserted a number. Unfortunately, there is no place to insert numbers in memory");
}
}
// pop() method to delete elemets
public int pop()
{
if(!isEmpty()){
int val = array[top];
top--;
     
 System.out.println("Element Deleted " + val);
     
 return val;
}
else
{
 System.out.println("Memory is already empty, there is no element available to be deleted.");
  return -1;
}
}
public static void main(String[] args)

{
  // we limited the stack size to 6 for the sake of assignments' simplicity. If we try to enter more than 6 elemts, it won't let. 
Main stack = new Main(6);
/*Inserting elements*/

stack.push(9);
stack.push(16);
stack.push(5);
stack.push(0);
stack.push(25);
stack.push(17);
stack.push(8);
stack.push(100);

/* Removing elements*/
stack.pop();
stack.pop();
stack.pop();
stack.pop();

System.out.println("So far, you deleted some elemets. Currently the peek element is " +stack.peek());
}}















