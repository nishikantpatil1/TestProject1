import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIMENUMBER {
	public static void main(String args[]) throws IOException{
	BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Any Number");
	int n=Integer.parseInt(kbd.readLine());
	int c=0;
	System.out.println("Factors of "+n);
	for(int i=1;i<=n;i++){
	if(n%i==0){
	System.out.println(i);
	c++;
	}
	}
	if(c==2){

	System.out.println("It is a PrimeNumber");
	}
	else{
	System.out.println("It is Not a PrimeNumber");
	}
	}
	
	
	
	
	
	
	
	
}
