public class Bus {

  private String line;
  private Person[] passengers;

  public Bus(String line) {
    this.line = line;
    this.passengers = new Person[80];
  }

  public String getLine() {
    return this.line;
  }

  public int passengerCount() {
    int numberOfPassengers = 0;

    for (Person passenger : this.passengers) {
      if (passenger != null) {
        numberOfPassengers++;
      }
    }

    return numberOfPassengers;
  }

  public void board(Person passenger) {
    if (isBusFull()) return;

    int index = passengerCount();
    this.passengers[index] = passenger; 
  }

public boolean isBusFull() {
  return passengerCount() == this.passengers.length;
}
}