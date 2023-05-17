package hw44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testOrderNumber(){
        Order order = new Order();
        assertEquals(1, order.getNumber());
        order = new Order();
        assertEquals(2, order2.getNumber());
    }
}
