
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
			
			if(numb.length() > 3) {
				String first = numb.substring(0,1);
				
				//2
				for (int i = 0; i < Integer.parseInt(first); i++) {
					result += thousand;
				}
				
				String second = numb.substring(1,2);
				
				
			
				
				
				

				
				
				
				
				
				
			}
			
			
		}
		
		return result;	
	
	}
	
}
