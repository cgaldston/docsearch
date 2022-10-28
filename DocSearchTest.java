import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testHandleURL() throws IOException {
        try {
            Handler h = new Handler("technical");
            URI testURL = new URI("http://localhost/increment");

            assertEquals(h.handleRequest(testURL), "Don't know how to handle that path!");

        }    catch (URISyntaxException e) {
        e.printStackTrace();
    }
    }

}
