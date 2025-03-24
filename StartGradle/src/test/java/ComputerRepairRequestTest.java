import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void textExample(){
        ComputerRepairRequest request = new ComputerRepairRequest(1, "John"
                , "Str. Mihai Viteazu, nr. 1"
                , "0740123456", "Lenovo"
                , "2021-03-01"
                , "The computer doesn't start");

        assertEquals(1, request.getID());
        assertEquals("John", request.getOwnerName());
        assertEquals("Str. Mihai Viteazu, nr. 1", request.getOwnerAddress());
        assertEquals("0740123456", request.getPhoneNumber());
        assertEquals("Lenovo", request.getModel());
        assertEquals("2021-03-01", request.getDate());
        assertEquals("The computer doesn't start", request.getProblemDescription());
    }

    @Test
    @DisplayName("Second Test")
    public void testExample2(){
        ComputerRepairRequest request = new ComputerRepairRequest();

        request.setID(2);

        assertEquals(2, request.getID());
        assertEquals("", request.getOwnerName());
        assertEquals("", request.getOwnerAddress());
    }
}
