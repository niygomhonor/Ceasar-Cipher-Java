package caesar;

public class Decrypt {
    // Decryption method to decrypt the encrypted word or sentence entered by user.

    public  static String decryption( String plainText, int key){

        String cipherText="";
        //
        for (int i=0;i<plainText.toCharArray().length;i++){
            char alph=plainText.charAt(i);
            if (Character.isLetter(alph)){
                if (Character.isLowerCase(alph)){
                    char txt=(char)(alph-key);
                    if (txt<'a'){
                        cipherText=cipherText+(char)(alph+(26-key));
                    }else {
                        cipherText=cipherText+txt;
                    }
                }
                else if (Character.isUpperCase(alph)){
                    char txt=(char)(alph-key);
                    if (txt<'A'){
                        cipherText=cipherText+(char)(alph+(26-key));
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
}
