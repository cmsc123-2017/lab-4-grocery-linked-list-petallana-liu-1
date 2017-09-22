class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  public boolean add(GroceryItem item) {
    return false;
  }
  
  public boolean remove(String name) {
    return false;
  }
  
  public boolean markAsBought(String name) {
    return false;
  }
  
  public void display() {
    
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