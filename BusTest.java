import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest {

  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("Airport Link");
    person = new Person(); 
  }

  @Test
  public void hasLine() {
    assertEquals("Airport Link", bus.getLine());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canTakePassengers() {
    bus.board(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 80; i++) {
      bus.board(person);
    }
    assertEquals(true, bus.isBusFull()); 
  }

}