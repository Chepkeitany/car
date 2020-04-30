class Tires {
  
  private int noOfTires;
  
  public Tires() {
    noOfTires = 0;
  }
  
  public Tires(int nt) {
    noOfTires = nt;
  }
  
  public void tireDetails() {
    System.out.println("Number of tyres: " +  noOfTires);
  }
  
}