package stringStudy;

public class Test {

	public static void main(String[] args) {
		

		String s="pune city";
		int sLength=s.length();
		System.out.println(sLength);
		
		String upperCase=s.toUpperCase();
		System.out.println(upperCase);
		
		
		String lowerCase=upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String s1="Velocity";
		String s2="Velocity";
		String s3="velocity";
		String s4=new String("Velocity");
		String s5=new String("Velocity");
		String s6=new String("velocity");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s4));//true
		System.out.println(s2.equals(s3)); //false
		System.out.println(s2.equalsIgnoreCase(s3)); //true
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s4); //false
		System.out.println(s4==s5);//false
		
		String y="INDIA";
		boolean result=y.contains("i");
		System.out.println(result);
		
		String a1="vanita";
		String a2="";
		String a3=" ";
		System.out.println(a1.isEmpty());
		System.out.println(a2.isEmpty());
		System.out.println(a3.isEmpty());
		
		System.out.println(a1.isBlank());
		System.out.println(a2.isBlank());
		System.out.println(a3.isBlank());
		
		System.out.println(y.isEmpty());//returns true if and only if length is zero
		
		String b1="Velocity";
		String b2="Pune";
		//System.out.println(b1.charAt(-4));
		
		String c="Velocity";
		System.out.println(c.endsWith("gfhf"));
		System.out.println(c.startsWith("Vel"));
		
		String t="my name is Vanita";
		System.out.println(t.substring(2, 6));
		
		String e1="software";
		String e2="testing";
		System.out.println(e1.concat(e2));
		
		String e3="mumbai";
		System.out.println(e3.indexOf('m'));
		System.out.println(e3.indexOf('a'));
		System.out.println(e3.lastIndexOf('m'));
		
		String f="hi";
		String f2=f.replace("hi", "bye");
		System.out.println(f2);
		
		String f3="india is my country";
		System.out.println(f3.replaceAll(" ", "_"));
		
		//split method
		String temp="velocity software testing batch";
		String a[]=temp.split(" ");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
