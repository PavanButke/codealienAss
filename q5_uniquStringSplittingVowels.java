// Q.5 WAP to return a list of all unique words in the given string “Java is great. Javascript is
// awesome”. Sort that list on the basis of number of vowels in it, decreasing order.


import java.util.*;
import java.lang.*;
import java.io.*;

class sortingUniqueString{

static class pair
{
	int first;
	String second;
	
	pair(int first,String second)
	{
		this.first = first;
		this.second = second;
	}
}


static boolean isVowel(char ch)
{
	ch = Character.toUpperCase(ch);
	return (ch == 'A' || ch == 'E' ||
			ch == 'I' || ch == 'O' ||
			ch == 'U');
}


static int countVowels(String str)
{
	int count = 0;
	for(int i = 0; i < str.length(); i++)
		if (isVowel(str.charAt(i)))
			++count;		
	return count;
}


static void sortArr(String arr[], int n)
{
	
	
	ArrayList<pair> vp = new ArrayList<>();

	
	for(int i = 0; i < n; i++)
	{
		vp.add(new pair(countVowels(arr[i]),
									arr[i]));
	}


	Collections.sort(vp, (a, b) -> a.first - b.first);
	

	for(int i = 0; i < vp.size(); i++)
		System.out.print(vp.get(i).second + " ");
}


public static void main(String[] args)
{
	String arr[] = { "Java " ,"is",  "great.", "Javascript", "is", "awesome." };
	int n = arr.length;
	
	  String str = "\n Java is great. Javascript is awesome.\n";
    String words[]=str.split(" ");
                
    int count=0;
    for(int i=0;i<words.length;i++)
    {  if(words[i].equals("") || words[i].equals(" "))
          {                      
            continue; 
          }
       else {                  
              for(int j=i+1;j<words.length;j++)
              {
                if(words[i].equals(words[j]))
                 { 
                   count=1;
                   words[j]=" ";
                   break;
                 }
              }
              if(count==0)
              {
               System.out.print(words[i]+" ");
              }
              count=0;     
            }
    }
   
	
	sortArr(arr, n);
}
}


