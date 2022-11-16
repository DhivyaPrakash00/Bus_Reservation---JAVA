package BusResv;

public class Bus{
  private int busNo; 
  private int capacity;
  private boolean ac;

  Bus(int bno, int cap, Boolean ac_N){
    busNo = bno;
    capacity = cap;
    ac = ac_N;
  }

  public int getBusNo(){
    return busNo;
  }

  public int getCapacity() { //accessor 
      return capacity;
  }

  public void setCapacity(int cap){  //mutator
    capacity = cap;
  }

  public boolean getAc(){
    return ac;
  }

  public void setAc(Boolean val){
    ac = val;
  }

  public void displayBusInfo(){
    System.out.println("BusNumber: "+busNo+"\nAc: "+ac+"\nCapacity: "+capacity) ;
  }

}