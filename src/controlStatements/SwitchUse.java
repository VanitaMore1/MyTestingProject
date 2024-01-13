package controlStatements;

public class SwitchUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender='F';
		switch (gender) {
		case 'F':System.out.println("female");
		break;
        
		case 'M':System.out.println("male");
		break;
		
		default:System.out.println("enter valid value");
			break;
		}
		
		
		
		
		int day=4;
		switch (day) {
		case 1:System.out.println("monday");
		break;

		case 2:System.out.println("tuesday");
		break;
		
		case 3:System.out.println("wensday");
		break;
		
		case 4:System.out.println("thursday");
		break;
		
		case 5 :System.out.println("friday");
		break;
		
		case 6:System.out.println("saturday");
		break;
		
		case 7:System.out.println("sunday");
		break;
		
		
		
		default:System.out.println("enter valid value");
			break;
		}
		
		
		
		String colour="green";
		switch (colour) {
		case "red": System.out.println("stop");
		break;

		case "green":System.out.println("go");
		break;
		
		case "yellow":System.out.println("wait");
		break;
			
		default:System.out.println("enter valid value");
			break;
		}
	}

}
