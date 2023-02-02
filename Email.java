import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email{
	public static void main(String args[]){
	String regex="^(.+)@(.+)$";
	Scanner sc=new Scanner(System.in);
	String email=sc.nextLine();
	Pattern pattern=Pattern.compile(regex);
Matcher matcher=pattern.matcher(email);
if(matcher.matches()){
	System.out.println("Valid email id");
}
else{
	System.out.println("Invalid email id");
}
	}
	
}