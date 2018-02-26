import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//getting the input
		String input = sc.next();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		//this block will extract all the digits in the input string
		Pattern numberPattern = Pattern.compile("\\d+");
		Matcher numberMatcher = numberPattern.matcher(input);
		while(numberMatcher.find())
		{
		    number.add(Integer.parseInt(numberMatcher.group()));
		}
        int index = 0;
		
		//this block will extract all the characters in the  input string
		Pattern characterPattern = Pattern.compile("[A-Za-z]");
		Matcher characterMatcher = characterPattern.matcher(input);
		while(characterMatcher.find())
		{
		    for(int i=0;i<number.get(index);i++)
		    {
		    System.out.print(characterMatcher.group());
		    }
		    index++;
		}
	}
}
