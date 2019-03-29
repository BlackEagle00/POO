package mundo;

import java.util.ArrayList;

public class A {
	
	private ArrayList <B>mib;
	
	public A() {
		mib = new ArrayList <B>();
		
		for(int i = 0; i < 15; i++) {
			mib.add(new B(i));
		}
	}
	
	public int getVar(int index) {
		return mib.get(index).getVar();
	}
	
	public void setVar(int var, int index) {
		mib.get(index).setVar(var);
	}
	
}
