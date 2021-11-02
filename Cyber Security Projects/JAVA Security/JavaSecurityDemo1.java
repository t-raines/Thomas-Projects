// demo3.java

// creation of secret key

// encryption using secret key

// decryption using secret key


// adasd
import java.security.*;

import javax.crypto.*;

import javax.crypto.spec.*;

class demo3

{

public static void main(String args[])

{

try

{

KeyGenerator kg = KeyGenerator.getInstance("DES");

// DES= Data Encryption Standard

Key key = kg.generateKey();

Cipher ci = Cipher.getInstance("DES/CBC/PKCS5Padding");

ci.init(Cipher.ENCRYPT_MODE, key);

String s ="we are learning Java";

byte[] array1 = s.getBytes();

byte[] array2 = ci.doFinal(array1);

byte[] initvector = ci.getIV(); 

System.out.println

("string has been encrypted"); 

System.out.println

("we are now decrypting");

IvParameterSpec spec =

new IvParameterSpec(initvector);

ci.init

(Cipher.DECRYPT_MODE, key, spec);

byte[] array3 = ci.doFinal(array2);

String s2 = new String(array3);

System.out.println(s2);

}
catch(Exception e1)

{ System.out.println(""+e1);}

}

}