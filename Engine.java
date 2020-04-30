class Engine {
  
  private int capacity;
  
  public Engine(){
    capacity = 0;
  }
  
  public Engine(int cap) {
    capacity = cap;
  }
  
  public void engineDetails() {
    System.out.println("Engine details: " + capacity + "cc");
  }
  
}