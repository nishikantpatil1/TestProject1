
public class Spacecount {
	
	

 int i, c=0, res;

public int spacecount(String s )
{
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            c++;
        }
        return c;
    }
public static void main (String args[])
    {
        Spacecount res=new Spacecount();
       int ss =res.spacecount("i am new ");
       int yu=res.spacecount("f f f f f d f d d d d d");
       int yu2=res.spacecount("ff fff df dd d d d");
       

        //string is always passed in double quotes
        
        System.out.println("The number of white spaces  in the String are : "+ss);
        
        System.out.println("The number of white spaces  in the String are : "+yu2);

        System.out.println("The number of white spaces  in the String are : "+yu);

    }
}