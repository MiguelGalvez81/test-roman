
public class Test {

	public static void main(String[] args) {
		
		System.out.println(getRomanNumber(1999));

	}

	//number = 2021
	public static String getRomanNumber (Integer number) {
		
		String result = "";
	
		if(number.intValue() > 0 && number.intValue() <= 3000) {
			
			String unit = "I";
			String decimal = "X";
			String fifty = "L";
			String centimal = "C";
			String fiveHundred = "D";
			String thousand = "M";
			
			
			String numb = String.valueOf(number.intValue());
			
			char [] chars = numb.toCharArray();
			
			for (int i = chars.length; i > 0; i--) {
				
				Integer digit = 0;
				if(i > 3) 
					result += repeatChars(thousand, Integer.parseInt(numb.substring(0,1)));
				
				if(i == 3 && chars.length > 3) { 
					digit = Integer.parseInt(numb.substring(1,2));
					
					if(digit.intValue() > 0 && digit.intValue() < 4)
						result += repeatChars(decimal, digit);
					else if(digit.intValue() == 4)
						result += repeatChars(centimal, 1);
					else if(digit.intValue() == 5)
						result += fiveHundred;
					else if(digit.intValue() > 5 && digit.intValue() < 9)
						result += fiveHundred + repeatChars(centimal, digit - 5);
					else if(digit.intValue() == 9)
						result += centimal + thousand;
						
				} else if (i == 3 && chars.length == 3) { 
					digit = Integer.parseInt(numb.substring(0,1));
					result = repeatChars(thousand, digit);
				}
			}
			
			
			
			
					
		}
		
		return result;	
	
	}
	
	public static String repeatChars(String character, Integer times) {
		String result = "";
		
		for (int i = 0; i < times; i++) {
			result += character;
		}
		return result;
	}
	
}
