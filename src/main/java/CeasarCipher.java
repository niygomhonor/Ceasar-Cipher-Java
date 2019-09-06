import  java.util.Scanner;
public class CeasarCipher {

    public  static String encryption( String plainText,int key){

        if (key>26){
           key=key%26;
        }else if (key<0){
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

public static void main(String[] args){
        System.out.println("Welcome to this App");
        System.out.println("Enter the message");
        Scanner cipher=new Scanner(System.in);
        String message="hi";
        String encryptedWord=encryption(message,3);
        System.out.println(encryptedWord);


    }


}
