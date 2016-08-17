import java.io.*;
import java.util.*;
class panagram
{
public static void main(String args[])
{
int i=0;
Scanner sc=new Scanner(System.in);
String abc=sc.nextLine();
int len1=abc.length();
if(abc.length()<0)
{
System.out.println("NOT PANAGRAM");
}
char[] b=abc.toCharArray();
Set<Character> ab=new HashSet<Character>();
while(i<len1)
{
ab.add(b[i]);
i++;
}
if(ab.size()==26)
System.out.println("PANAGRAM");
else
System.out.println("NOT A PANAGRAM");
}
}