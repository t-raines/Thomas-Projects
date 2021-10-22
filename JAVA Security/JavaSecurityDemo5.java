// demo5.java

// creation of public & private keys

// signing the data by private key

// verifying the data by public key

import java.security.*;

import javax.crypto.*;

class demo5

{

public static void main(String args[])

{

try

{

SecureRandom sr = new SecureRandom();

byte[] pr =new byte[100];

sr.nextBytes(pr);

KeyPairGenerator kpg =

KeyPairGenerator.getInstance("DSA");

kpg.initialize(512,sr);

KeyPair kp = kpg.genKeyPair();

PublicKey pubkey = kp.getPublic();

PrivateKey prikey = kp.getPrivate();

System.out.println

("public & private keys ready!");

Signature sig =

Signature.getInstance("SHA1withDSA"); 

sig.initSign(prikey);

String s1 = "we are learning Java";

byte[] array1= s1.getBytes();

sig.update(array1);

byte[] array2 = sig.sign(); 

System.out.println

("the data signed by private key");

System.out.println

("now verifying with public key");

sig.initVerify(pubkey);

sig.update(array1);

boolean ok = sig.verify(array2);

if(ok==true)

{ System.out.println("authentic..ok"); }

else

{ System.out.println("not authentic"); }

}

catch(Exception e1)

{ System.out.println(""+e1);}

}

}