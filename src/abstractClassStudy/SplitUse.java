package abstractClassStudy;

public class SplitUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="[Loan amount]*100+[EMI]*100";
		String str1 = str.replaceAll("[\\[\\]\\*\\+]", " ");
		System.out.println(str1);
		
	}

}
