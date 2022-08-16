package selfProject;

public class stringMethodSelf {

	public static void main(String[] args) {
		// String methods
		
		// Escape sequence: 
		
		//String number = "\"123\"";  // \"  \"    put the value in qutation marks 
		//System.out.println(number);
		// United States is a "Super Power".
		
		//String name = "United Stats is a \"Super Power\"";
		//System.out.println(name);
		
		//System.out.println("My name is");
		//System.out.println("Ahmad");
		//System.out.println("My name is \nAhmad"); // \n    makes a newline and the 
		// string should be inside qutaion mark " "
		
		
		//  String methods
		// length()  = tells us the number of character in string .
		 
		//String number = "United States";
		//number.length(); // shows the number of characters in a string;
		//System.out.println(number.length());
		
		//String name = "Asia countries";
		//System.out.println(name.length());
		
		
		// Concat () method = connect method
		
		//String firstName = "Lisa";
		//String lastName = "Morgan";
		//String fullName = firstName +" "+ lastName; // another way to join characters
		//String fullName = firstName.concat(lastName); // it is used to join characters
		//System.out.println(fullName);
		
		
		//ValueOf() method
		//String number = "123";
		//int i = Integer.valueOf(number);
		//System.out.println(i+4);
		
		
		//toLowerCase and toUpperCase method;
		
		//String name = "lisa";
		//System.out.println(name.toUpperCase());
		
		//String upper = "MIKE";
		//System.out.println(upper.toLowerCase());
		
//		String number ="5";
//		int result = Integer.valueOf("5");
//		System.out.println(result+5);
		
		
		
		
		//charAt method        //= it returns string to character.
//		String name = "Mike";     //= index count starts from 0 , M=0,i=1,k=2 and e=3.
//		char firstCharacter = name.charAt(1); 
//		System.out.println(firstCharacter);
		
//		String name = "United States";
//		char firstCharacter = name.charAt(5);
//		int index = name.indexOf("d");
//		System.out.println(index);
		
		
		//Substring() method = when we want to access part of string
		
		//String fullName = "JOhn Doe";
		//String firstName = fullName.substring(0,4); // 0 is J and 4 is after n
		//System.out.println(firstName);
		 
		//ex:
		//String symbol = "<<>>";
		//String name = "Mike";
		
		//String first = symbol.substring(0,2);
		//System.out.println(first);
		//String second = symbol.substring(2);
		//System.out.println(second);
		//String result = first+name+second;
		//String result = first.concat(second);
		//System.out.println(result);
		
		//String name = "United States";
		//System.out.println(name.substring(0,12));
		 
		
		// repeat method
		// String greeting = "Hi";
		//System.out.println(greeting+greeting+greeting+greeting+greeting);
		//System.out.println(greeting.repeat(5)); // our eclipse is version 8 which is not 
		// supporting repeat.
		
		//contain method = returns false or true regarding the string( boolean ).
		//String name ="United States Of America";
		//System.out.println(name.contains("States"));
		//System.out.println(name.contains("stat"));
		 
		
		//exercises;
		//giving a string name, e.g."Bob", print a greeting of the form "Hello Bob!"
//		String name = "Bob";
//		String greeting = "Hello"+" "+name+ "!";
//		System.out.println(greeting);

		// Given two strings , a and b, print the result of putting together in 
		// order abba, e.g. HiByByHi
		//String a = "Hi";
		//String b = "Bye";
		//String result = a+b+b+a;
		//System.out.println(result);
		
		
		// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
		//In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
		//Given tag and word strings, create the HTML string with tags around the word,
		//e.g. "<i>Yay</i>".
		
		//("i", "Yay") → "<i>Yay</i>"            <vaiableName>name</variableName>
		//("i", "Hello") → "<i>Hello</i>"
		//("cite", "Yay") → "<cite>Yay</cite>"
		
//		String tag = "i";
//		String content ="Yay";
//		String result = "<"+tag+">"+content+"</"+tag+">";
//		System.out.println(result);
		
		
//		String first = "i";
//		String greeting ="Hello";
//		String result = "<"+first+">"+greeting+"</"+first+">";
//		System.out.println(result);
		
		
		//Given an "out" string length 4, such as "<<>>", and a word,
		//return a new string where the word is in the middle of the out string,
		//e.g. "<<word>>". Note: use str.substring(i, j) to extract the String
		//starting at index i and going up to but not including index j.

				//("<<>>", "Yay") → "<<Yay>>"
				//("<<>>", "WooHoo") → "<<WooHoo>>"
				//("[[]]", "word") → "[[word]]"
//		
//		String first = "<<>>";
//		String word = "Yay";
//		String firstHalf= first.substring(0,2);
//		String secondHalf= first.substring(2);
//		String result = firstHalf+word+secondHalf;
//		System.out.println(result);
//		
		
//		String first = "[[]]";
//		String word = "Hi";
//		
//		String sub1 = first.substring(0,2);
//		String sub2 = first.substring(2);
//		String result = sub1+word+sub2;
//		System.out.println(result);
		
				
//		String name = "lisa";
//		String namethree = (name.repeat(3)); // repeat is not supported in this version
//		System.out.println(namethree);
		
//		Given a string, return a new string made of 3 copies of the last 2 
//		chars of the original string. The string length will be at least 2.
//
//				("Hello") → "lololo"
//				("ab") → "ababab"
//				"Hi") → "HiHiHi"
		
		
//		String greeting = "Hi";
//		System.out.println(greeting.repeat(3));
		
		
//		String greeting = "Hello";
//		String lastTwo = greeting.substring(greeting.length()-2);
//		//String lastTwo = greeting.substring(3);
//		System.out.println(lastTwo.repeat(3));
		
//		Given a string of even length, return the first half. 
		//So the string "WooHoo" yields "Woo".
//
//				("WooHoo") → "Woo"
//				("HelloThere") → "Hello"
//				("abcdef") → "abc"
//		
//		String word = "WooHoo";
//		int middleIndex = word.length()/2;
//		String firstHalf= word.substring(0,middleIndex);
//		System.out.println(firstHalf);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
   
   
   
   
   
   
   
   
	}

}
