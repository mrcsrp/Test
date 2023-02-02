class English{
public static void main(String args[]){
	String string= “dummy text of the printing and typesetting industry.”;
	String word="",small="",large="";
	String[] words=new String[100];
	int length=0;
	
	string=stringh+"";
	
	for(inr i=0;i<string.length();i++){
		if(string.charAt(i)!='')
		word=word+string.ch(i);
		}
		else{
			words="";
		}
	}
small=large=word[0];
	for(int k=0;k<length;k++){
		if(small.length()>words[k].length())
	small=words[k];
		if(large.length()<word[k].length())
large=words[k];
	}
	System.out.println("Smallest word."+small);
	System.out.println("Largest word."+large);
}