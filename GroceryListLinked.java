class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  public boolean add(GroceryItem item) {
 
    GroceryNode newNode = new GroceryNode(item, head);
    head = newNode;
    this.size++;
   
    return true;
  }
  
  public boolean remove(String name) {
    GroceryItem item = new GroceryItem(name, 0);
    GroceryNode current = head; //store head
    GroceryNode before = null;
    boolean wasDeleted = false;
 
    if (current != null && current.data == item){ //if head contains name to be deleted
      head = current.next; //change head
    }
   
    while (current != null && current.data != item){ //look for match
        before = current;
        current = current.next;
       
        this.size--;
    }
   
    if (current == null) { //if not present wasDeleted is now false
      wasDeleted = false;   
    } else {
      wasDeleted = true; //if present was Deleted is now true
    }
   
    before.next = current.next; //unlink node from list
    return wasDeleted;  //return was Deleted
  }
  
  public boolean markAsBought(String name) {
    GroceryNode current = head;
    GroceryNode before = current;
    
    if (current.data == new GroceryItem(name, 0)) {
      current = current.next.next;
      return true;
    }
    return false;
  }
  
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println();
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}
