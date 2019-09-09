
import caesar.CeasarCipher;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CeasarCipherTest{


    CeasarCipher encryptCipher=new CeasarCipher();

//    @Test
//    public void runCeasarCipher_Nothing_to_do_empty_string() {
//
//        assertEquals("", decryptCipher.decryption("",3));
//        // contents of test will eventually go here.
//    }
    @Test
    public void runCeasarCipher_Nothing_to_with_empty_string() {

        assertEquals("", encryptCipher.caesar.encryption("",3));
        // contents of test will eventually go here.
    }
    @Test
    public void shouldNotCipherSymbols() {
        assertEquals("", encryptCipher.caesar.encryption("", 3));

        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, encryptCipher.caesar.encryption(symbols, 3));
    }

}
