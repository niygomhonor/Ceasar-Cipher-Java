
import caesar.CeasarCipher;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class EncryptTest{


    CeasarCipher encryptCipher=new CeasarCipher();
    @Test
    public void runCeasarCipher_Nothing_to_with_empty_string() {

        assertEquals("", encryptCipher.caesar.encryption("",3));
        // contents of test will eventually go here.
    }
    @Test
    public void shouldNotEncryptSymbols() {
        assertEquals("", encryptCipher.caesar.encryption("", 3));

        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, encryptCipher.caesar.encryption(symbols, 3));
    }

}