//This program demonstrates circular linked list

class Cll {

  // Static inner class so that main can acess it
  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  // Declaring head and tail pointer as null
  Node head = null;
  Node tail = null;

  // This function will add the new node at the end of the list

  public void add(int data) {

    // Create new_node
    Node new_node = new Node(data);

    // check if the list is empty

    if (head == null) {
      // if the list is empty both the head and tail would point to the new_node)
      head = new_node;
      tail = new_node;
      new_node.next = head;
    } else {
      // tail will point to the new_node
      tail.next = new_node;
      // new_node becomes the tail of the list
      tail = new_node;
      // Since, it is a circular linked list the tail will point to the head
      tail.next = head;
    }
  }

  // This method display all the nodes of the list
  public void display() {
    Node current = head;
    // If the list is empty then,print the message the message that list is empty
    if (head == null)
      System.out.println("List is empty");
    else {
      System.out.println("Nodes of circular linked list are: ");
      do {
        System.out.print(" " + current.data);
        current = current.next;
      } while (current != head);
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Cll list = new Cll();
    list.add(12);
    list.add(15);
    list.add(16);
    list.add(17);
    list.display();
  }

}
