// Import Random Class
import java.util.Random;
public class Parser {

	/*
		Method that determines if a string is well-formatted with regards
		to its parentheses.
	*/
	public boolean check(String value) {
		// Create new stack
		Stack stack = new Stack();

		for (int i = 0; i < value.length(); i++) {
			// Grab char at index value.
			char c = value.charAt(i);
			// Convert char to string value.
			String s = String.valueOf(c);

			/*
				If the current character is a starting bracket,
				push it onto stack.
			*/
			if (s.equals("(")) {
				stack.push(s);
			
			/*
				Else, if the stack isn't empty, and the current character is
				a closing bracket and the character at the top of the stack
				is a open bracket then pop it off the stack.
			*/
			} else if (!stack.isEmpty() && s.equals(")") && stack.peek().equals("(")) {
				stack.pop();
			} else {
				return false;
			}	
		}

		// If the stack is empty, parentheses are balanced.
		if (stack.isEmpty()) {
				return true;
			} else {
				return false;
			}
	}

	/*
		Method that generates a random string made up of random parentheses.
	*/
	public String getString() {
		// Create string of characters to build from.
		String characters = "()";
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		// Create Random object.
		Random random = new Random();
		// Create random length of string (0-10).
		int length = random.nextInt(10);

		for (int i = 0; i < length; i++) {
			// Get random index of string of characters.
			int index = random.nextInt(characters.length());
			// Get char from index.
			char randomChar = characters.charAt(index);
			// Append random char to string.
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		return randomString;
	}
}