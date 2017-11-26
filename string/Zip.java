import java.util.*;

public class Zip{
	public static String zipString(String iniString){
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < iniString.length(); i++){
			char temp = iniString.charAt(i);
			int count = 1;
			while(i < iniString.length()-1 && iniString.charAt(i+1) == iniString.charAt(i)){
				count++;
				i++;
			}
			stringBuffer.append(temp).append(count);
		}
		System.out.println("iniString.length "+iniString.length()+" "+iniString);
		System.out.println("stringBuffer.length "+stringBuffer.length()+" "+stringBuffer.toString());
		return iniString.length() > stringBuffer.length()?stringBuffer.toString():iniString;
	}
	public static void main(String[] args){
		String str = "welcometonowcoderrrrr";
		System.out.println(zipString(str));
	}
}