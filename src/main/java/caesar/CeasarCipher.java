package caesar;



import  java.util.Scanner;
//import static caesar.Encrypt.encryption;
//import static caesar.Decrypt.decryption;
public class CeasarCipher {

public static void main(String[] args){
        System.out.println("Welcome to this App");
        System.out.println("Enter the message");
        Scanner cipher=new Scanner(System.in);
        String message=cipher.nextLine();
        System.out.println("Enter a key");
        int key=cipher.nextInt();
        String encryptedWord= Encrypt.encryption(message,key);
        String decryptedWord= Decrypt.decryption(encryptedWord,key);
        System.out.println(encryptedWord);
        System.out.println(decryptedWord);
    }
}
