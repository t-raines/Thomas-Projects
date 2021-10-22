// demo6.java
//password abcd1234


import java.security.*;

import javax.crypto.*;

import javax.crypto.spec.*;

import java.io.*;

class demo6

{

public static void main(String args[])

{


String salt="saltings";

int n = 20; // iterations

byte[] a = salt.getBytes();

PBEParameterSpec paramspec=

new PBEParameterSpec (a,n);

try

{

Cipher cipher =

Cipher.getInstance("PBEWithMD5AndDES");

DataInputStream ins = new DataInputStream(System.in);

System.out.println ("enter the password");

String s1=ins.readLine();



System.out.println("enter the datastring");

String s2=ins.readLine();

byte[] array1 = s2.getBytes();

PBEKeySpec keyspec =

new PBEKeySpec(s1.toCharArray());

SecretKeyFactory factory=

SecretKeyFactory.getInstance

("PBEWithMD5AndDES");

SecretKey key = factory.generateSecret(keyspec);

cipher.init

(Cipher.ENCRYPT_MODE, key, paramspec);

byte[] array2 = cipher.doFinal(array1);

System.out.println("encryption over");

System.out.println("now decrypting");

System.out.println

("enter the password again!");

String s3=ins.readLine();

keyspec = new PBEKeySpec(s3.toCharArray());

factory= SecretKeyFactory.getInstance("PBEWithMD5AndDES");

key = factory.generateSecret(keyspec);

cipher.init

(Cipher.DECRYPT_MODE, key, paramspec);

byte[] array3 = cipher.doFinal(array2);

String s4=new String(array3);

System.out.println(s4);

}

catch(Exception e1)

{System.out.println(""+e1);}

}

}
