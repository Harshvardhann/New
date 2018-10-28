import java.util.Scanner;
public class numbers
{
public static void main(String s)
{
int word=1;
for (int i=0;i<=s.length();++i)
{ 
if (s.charAT(i)==' ')
word++;
}
System.out.pritnln("number of words"+word);
}
}