package accessTest;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Test {

	public static void main(String[] args) {
		String result="";
		String modifiedExpression="";
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("JavaScript");
		try {
			if(modifiedExpression.contains("then")||modifiedExpression.contains("else")) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
