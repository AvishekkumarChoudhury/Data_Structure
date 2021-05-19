import java.util.*;

//Java program to implement a singly linked list
class LinkedList {

 Node head; // head of the list

 // It is a static inner class so main() can acess it
 static class Node {

  int data;
  Node next;

  Node(int data) // constructor
  {
   this.data = data;
   next = null;
  }
 }

 // method to insert elements in the List
 public static LinkedList insert(LinkedList list, int data) {

  // create a new node with the given data
  Node new_node = new Node(data);
  new_node.next = null;
  // if the linked list is empty, then
  // then make the new node as head
  if (list.head == null)
   list.head = new_node;

  // else traverse the list till the extends
  // and insert the node at the last
  else {
   Node last = list.head;
   while (last.next != null) {
    last = last.next;
   }
   // Insert the new node at the last
   last.next = new_node;
  }
  return list;
 }

 // Method to print the elements of linked list
 public static void printList(LinkedList list) {
  Node currNode = list.head;
  System.out.println("The linked list elements are: ");

  // Traverse through the linked list
  while (currNode != null) {
   // Print data at the current node
   System.out.print(currNode.data + " ");
   // Go to the next node
   currNode = currNode.next;
  }
 }

}

 // ******Deletion By key

 public static LinkedList deleteByKey(LinkedList list, int key) {
  // Store head Node in the currNode
  Node currNode = list.head, prev = null;
  // Case 1:IF the key to be deleted is in the head node
  if (currNode != null && currNode.data == key) {
   list.head = currNode.next;// changed node

   // Display the message
   System.out.println(key + "found and deleted: ");

   // Return the updated List
   return list;

  }

  // Case 2:If the key to be deleted is somewhere in the middle
  // Search the key to be deleted
  // keep track of the previous node
  // as it is needed to change currNode.next
  while (currNode != null && currNode.data != key) {
   prev = currNode;
   currNode = currNode.next;
  }
  // iF the key was present,it should be at the currNode
  // Therefore the currnode should not be null
  if (currNode != null) {
   // since the key is at the currNode
   // unlink currnode from the linked list
   prev.next = currNode.next;
   System.out.println(key + "found and deleted");
  }
  // Case 3: If the key is not present in the list
  // currNode should be null
  if (currNode == null) {

   // Display the message key not found

   System.out.println(key + " not found");

  }
  return list;
 }

 public static LinkedList deleteByKey(LinkedList list, int key) {
  // Store head Node in the currNode
  Node currNode = list.head, prev = null;
  // Case 1:IF the key to be deleted is in the head node
  if (currNode != null && currNode.data == key) {
   list.head = currNode.next;// changed node

   // Display the message
   System.out.println(key + "found and deleted: ");

   // Return the updated List
   return list;

  }

  // Case 2:If the key to be deleted is somewhere in the middle
  // Search the key to be deleted
  // keep track of the previous node
  // as it is needed to change currNode.next
  while (currNode != null && currNode.data != key) {
   prev = currNode;
   currNode = currNode.next;
  }
  // iF the key was present,it should be at the currNode
  // Therefore the currnode should not be null
  if (currNode != null) {
   // since the key is at the currNode
   // unlink currnode from the linked list
   prev.next = currNode.next;
   System.out.println(key + "found and deleted");
  }
  // Case 3: If the key is not present in the list
  // currNode should be null
  if (currNode == null) {

   // Display the message key not found

   System.out.println(key + " not found");

  }
  return list;

  //Method to delete node in a doubly linked list

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  LinkedList list = new LinkedList();

  System.out.println("Enter the 1st element to be inserted:");
  int a = in.nextInt();
  System.out.println("Enter the 2nd element to be inserted:");
  int b = in.nextInt();
  System.out.println("Enter the element to be inserted:");
  int c = in.nextInt();
  System.out.println("Enter the element to be inserted:");
  int d = in.nextInt();
  System.out.println("Enter the element to be inserted:");
  int e = in.nextInt();
  // insert the element in the list
  list = insert(list, a);
  list = insert(list, b);
  list = insert(list, c);
  list = insert(list, d);
  list = insert(list, e);

  // print the list
  printList(list);

  System.out.println("\nWould you like to delete any key that you inserted ?");
  int key = in.nextInt();
  deleteByKey(list, key);

 }

}
