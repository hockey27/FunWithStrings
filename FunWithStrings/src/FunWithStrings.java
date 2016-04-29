
import java.util.Scanner;

public class FunWithStrings
{
	private static Scanner userInput = new Scanner(System.in);
	private static String sentence;
	
	public static void main(String[] args)
	{
		askForName();
		getSentence();
		stripSpaces();
		analyzeSentence();
		printMullen();

	}
	
	public static void analyzeSentence()
	{
		System.out.println("The number of characters is " + sentence.length());
		int space=0;
		int vowel = 0;
		int consonant = 0;
		for(int i = 0; i < sentence.length(); i++)
		{
			switch (sentence.substring(i, i + 1).toLowerCase())	
						{
							case "a":
							case "e":
							case "i":
							case "o":
							case "u":
									{
										vowel++;
										break;
									}
							case "b":
							case "c":
							case "d":
							case "f":
							case "g":
							case "h":
							case "j":
							case "k":
							case "l":
							case "m":
							case "n":
							case "p":
							case "q":
							case "r":
							case "s":
							case "t":
							case "v":
							case "w":
							case "x":
							case "y":
							case "z":
									{
										consonant++;
										break;
									}
						}
			
			}
			
		
		System.out.println("The number of vowels is " + vowel);
		System.out.println("The number of consonants is " + consonant);
	    System.out.println("The number of letters is " +(vowel+consonant));
	}
	
	public static void askForName()
	{
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello " + name);
	}
	
	public static void getSentence()
	{
		System.out.println("Please enter a sentence of at least five words and no punctuation. ");
		sentence = userInput.nextLine();
	}
	
	public static void stripSpaces()
	{
		int space=0;
		String newStr = "";
		for(int i = 0; i < sentence.length(); i++)
		{
			if(!sentence.substring(i, i + 1).equals(" "))
			{
				newStr += sentence.substring(i, i + 1);
			}
			
			if(sentence.substring(i).equals(" "))
				{
					space++;
				}
		}
		sentence = newStr;
	}
	
	public static void printMullen()
	{
		for (int i=0;i<length;i++)
			{
				
			}
	}
	
}