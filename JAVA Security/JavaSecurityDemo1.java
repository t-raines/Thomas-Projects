// demo2.java

// getting a string and digest from file

// creating a hash and verifying the digest





import java.io.*;

import java.security.*;

class demo2

{
public static void main(String args[])
{
try
{
FileInputStream fis = new FileInputStream("demo1test");

ObjectInputStream ois = new ObjectInputStream(fis);

Object ob1 = ois.readObject();

String s1 = (String) ob1;

System.out.println(s1);

Object ob2 = ois.readObject();

byte[] array1= (byte[]) ob2;

MessageDigest md = MessageDigest.getInstance("SHA");

md.update(s1.getBytes());

if(MessageDigest.isEqual(md.digest(), array1))

{ System.out.println("valid"); }

else

{ System.out.println("corrupted");

}

} catch(Exception e1)

{ System.out.println(""+e1);}

}

}
