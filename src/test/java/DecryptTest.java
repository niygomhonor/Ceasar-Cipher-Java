import caesar.CeasarCipher;
import org.junit.*;
import static org.junit.Assert.assertEquals;


public class DecryptTest{


    CeasarCipher decryptCipher=new CeasarCipher();
    @Test
    public void runCaesarCipher_Nothing_to_with_empty_string() {

        assertEquals("",decryptCipher.caesar.decryption("",3));
        // contents of test will eventually go here.
    }
    @Test
    public void shouldNotEncryptSymbols() {
        assertEquals("", decryptCipher.caesar.decryption("", 3));

        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, decryptCipher.caesar.decryption(symbols, 3));
    }

}