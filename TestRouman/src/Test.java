
public class Test {

	public static void main(String[] args) {
		

	}


	public String getRomanNumber (Integer number) {
		
		String result = "";
	
		if(number.intValue() > 0 && number.intValue() <= 3000) {
			
			String unit = "I";
			String decimal = "X";
			String centimal = "C";
			String thousand = "M";
			
			String numb = String.valueOf(number.intValue());
			
			if(numb.length() > 3) {
				String first = numb.substring(0,1);
				
				
				result += thousand;
				
				
				
				
			}
			
			
		}
		
		return result;	
	
	}

}
