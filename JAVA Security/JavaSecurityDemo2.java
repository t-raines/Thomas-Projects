// demo4.java

import java.security.*;

import java.util.*;

class demo4

{

public static void main(String args[])

{

try

{

Provider[] array =

Security.getProviders();

int n = array.length;

for(int j=0; j<n; j++)

{

System.out.println(array[j]);

for(Enumeration e=array[j].keys();

e.hasMoreElements();)

{

System.out.println("\t"+e.nextElement());

}

}

} catch(Exception e1) {System.out.println(""+e1);}

}

}