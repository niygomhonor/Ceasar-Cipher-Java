import caesar.CeasarCipher;
import org.junit.*;

public class CeasarCipherTest{


    CeasarCipher testCipher=new CeasarCipher();
    @Test
    public void runCeasarCipher_Nothing_to_with_empty_string() {

        assertEquals("", testCipher.encryption("",3));
        // contents of test will eventually go here.
    }
    @Test
    public void shouldNotCipherSymbols() {
        assertEquals("", testCipher.encryption("", 3));

        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, testCipher.encryption(symbols, 3));
    }

}
