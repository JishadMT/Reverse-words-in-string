import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		reverseWords("The new string");
	}
	static void reverseWords(String inp){
		StringBuffer sb = new StringBuffer();
		int substrend=inp.length();
		int i=substrend-1;
		while(i>=0){
			if(i==0){
				sb.append(inp.substring(i,substrend));
				break;
			}
			if(inp.charAt(i)==' '){
				sb.append(inp.substring(i+1,substrend));
				sb.append(" ");
				substrend=i;
			}
			i--;
		}
		System.out.println(sb.toString());
	}
}
