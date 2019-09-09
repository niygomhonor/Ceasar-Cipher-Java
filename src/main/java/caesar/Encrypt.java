package caesar;
public class Encrypt {
    // Encryption method to encrypt the word oe sentence entered by user

    public static String encryption(String plainText, int key) {

        if (key>0){
            key=key%26;
        }
        else if (key<0){
            key=(key%26)+26;
        }
        String cipherText="";

        for (int i=0;i<plainText.toCharArray().length;i++){
            char alph=plainText.charAt(i);
            if (Character.isLetter(alph)){
                if (Character.isLowerCase(alph)){
                    char txt=(char)(alph+key);
                    if (txt>'z'){
                        cipherText=cipherText+(char)(alph-(26-key));
                    }else {
                        cipherText=cipherText+txt;
                    }
                }
                else if (Character.isUpperCase(alph)){
                    char txt=(char)(alph+key);
                    if (txt>'Z'){
                        cipherText=cipherText+(char)(alph-(26-key));
                    }else {
                        cipherText=cipherText+txt;
                    }
                }
            }
            else {
                cipherText=cipherText+alph;
            }
        }
        return cipherText;
    }
    public String decryption(String plainText, int key) {
        return plainText;
    }
}
