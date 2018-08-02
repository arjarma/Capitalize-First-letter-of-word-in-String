

import java.io.*;
import static java.lang.System.out;

class Capitalize
{
	
	static public String Capital(String s)
	{

String cap[]=s.split(" ");
//char k='\u0000';
char k='\t';
String value="";
int n=(int)k;
out.println("value of k"+n);
for(int i=0;i<cap.length;i++)
{
if(cap[i].charAt(0)>=97 || cap[i].charAt(0)<=122)
{
	char c=(char)(cap[i].charAt(0)-32);	
	
	char ch[]=cap[i].toCharArray();
	ch[0]=c;
	cap[i]=new String(ch);
value+=cap[i]+'\u0009';
	//System.out.print(new String(ch))	;
	//for(int j=0;j<cap.length;j++){cap[i].charAt(0)=c;	}
	}
else
{
	out.println("first letter is capital");
}
}
out.println("capitalized value is ");
//for(String str:cap)
//{
	//out.print(str+"\t");
//}

return value;
//return cap;
}
	
public static void main(String arg[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
out.println("Eneter the string for Capitalization");

String s=br.readLine();

out.print("In Main");
String val=Capital(s).toString();
out.print(val);
}
}