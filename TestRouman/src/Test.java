
public class Test {

	public static void main(String[] args) {
		
		System.out.println(getRomanNumber(1599));

	}

	//number = 2021
	public static String getRomanNumber (Integer number) {
		
		String result = "";
	
		if(number.intValue() > 0 && number.intValue() <= 3000) {
			
			String unit = "I";
			String five = "V";
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
					result += getRomanDigit(centimal,fiveHundred, thousand, digit);	
				} else if (i == 3 && chars.length == 3) { 
					digit = Integer.parseInt(numb.substring(0,1));
					result = getRomanDigit(centimal,fiveHundred, thousand, digit);	
				}
				
				if(i == 2 && chars.length > 2) { 
					digit = Integer.parseInt(numb.substring(2,3));
					result += getRomanDigit(decimal,fifty, centimal, digit);	
				} else if (i == 2 && chars.length == 2) { 
					digit = Integer.parseInt(numb.substring(0,1));
					result = getRomanDigit(decimal,fifty, centimal, digit);	
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
	
	public static String getRomanDigit(String begin, String middle, String end, Integer digit) {
		String result = "";
		
		if(digit.intValue() > 0 && digit.intValue() < 4)
			result += repeatChars(begin, digit);
		else if(digit.intValue() == 4)
			result += repeatChars(begin, 1) + middle;
		else if(digit.intValue() == 5)
			result += middle;
		else if(digit.intValue() > 5 && digit.intValue() < 9)
			result += middle + repeatChars(begin, digit - 5);
		else if(digit.intValue() == 9)
			result += begin + end;
		
		return result;
	}
	
}
