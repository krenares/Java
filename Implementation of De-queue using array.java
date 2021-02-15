//Krenare Syla
//COMP 2313 Data Structures
// Homework 2
//Implementation of De-queue using array 


//This program enables the user to insert 6 values(which can be adjusted in line 118) in a memory. The user will be able to see the entered values and delete them according to the principle of double ended queue, from the rear or the fron.  It also warns the user when the stack is full and there is no place to push(insert) elemnets. If no elements were inserted,and if there is the request for instance of two of them to be popped, the program will let the user know that the stack is empty and there is no value to be deleted. 

class Main 
{ 
static final int Max = 50; int  array[];  int  front; int  rear;  int  size; 
  // we have to create the constructor in order to initiallize variables    
  
public Main(int size) 
{ 
  array = new int[Max]; 

front = -1; rear = 0; this.size = size; 
} 
   //we use method isFull() to check if the deque is Full and if there is enough space to push new elements. 
   
boolean isFull() 
{ 
return ((front == 0 && rear == size-1)|| front == rear+1); 
} 
   
    // Method isEmpty() checks if the deque is Empty. If it is empty and user wants to delete any element from memory. it warns that the Deque is already empty.  
boolean isEmpty () 
{ return (front == -1);  } 
   
  // Inserting elements at the front of deque 
void insertfront(int key) 
{ 
// again, the method below, it checks if the deque is full  
if (isFull())  { 
System.out.println("Sorry! Here you inserted a number. Unfortunately, there is no place to insert numbers in memory");  
return; } 
if (front == -1)  { 
  front = 0; 
  rear = 0; 
} 
// condition when front is at first position of deque 
else if (front == 0) 
front = size - 1 ; 
else
 //it lowers numerically the front end by '1' 
front = front-1; 
// in the code line below, we are able to  insert current element into Deque 
array[front] = key ; 
} 
void insertrear(int key) 
{ 
if (isFull()) 
  { 
  System.out.println("Sorry! Here you inserted a number. Unfortunately, there is no place to insert numbers in memory "); 
return; 
} 
if (front == -1) { 
front = 0; 
rear = 0; 
} 
else if (rear == size-1) //// rear is at last position of //queue 
rear = 0; 
 else rear = rear+1; 
array[rear] = key ; 
} 
// in the code line below we are able to delete element at front end of Deque 
void deletefront() 
{ 
// the method below checks whether Deque is empty or not 
if (isEmpty()) { 
System.out.println("Sorry! Your request cannot be processed. Memory is already empty\n"); 
return ; 
} 
if (front == rear) 
{ front = -1; 
rear = -1; } 
else
if (front == size -1) 
front = 0; 
else front = front+1;} 
// method below deleted elements at rear end of Deque 
void deleterear() { 
if (isEmpty())  { 
System.out.println("Sorry! Your request cannot be processed. Memory is already empty\n"); 
return ; 
} 
if (front == rear) { 
front = -1; rear = -1; } 
else if (rear == 0) 
rear = size-1; 
else
rear = rear-1;} 
// The method below returns front element of Dequer
int getFront() 
{ 
if (isEmpty()) 
{ 
System.out.println("Sorry! Your request cannot be processed. Memory is already empty\n"); 
return -1 ; 
} 
return array[front]; 
} 
// function below returns rear element of Deque 
int getRear() 
{
if(isEmpty() || rear < 0) 
{ 
System.out.println("Sorry! Your request cannot be processed. Memory is already empty\n"); 
return -1 ; 
} 
return array[rear]; 
} 
/* **************************************** */ 
//Testing the code
public static void main(String[] args) 
{ 
Main dq = new Main(6); 
         dq.insertrear(6); 

System.out.println("You added 6"); 
dq.insertrear(6); 
System.out.println("You added 3"); 
dq.insertrear(3); 
System.out.println("You added 9"); 
dq.insertrear(9); 
System.out.println("The very last element you added is "+ dq.getRear()); 
dq.deleterear(); 
System.out.println("After deleting the last element added, new last element becomes "+dq.getRear()); 
System.out.println("We are processing your request to add elements at the front"); 
dq.insertfront(15); 
System.out.println("The element added at the front is "+dq.getFront()); 
dq.deletefront(); 
System.out.println("After deleting the element at the front, new front element becomes " +  dq.getFront()); 
} 
} 
