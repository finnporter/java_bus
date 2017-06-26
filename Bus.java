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

    for (Person passenger : passengers) {
      if (passenger != null) {
        numberOfPassengers++;
      }
    }

    return numberOfPassengers;
  }
}