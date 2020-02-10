package pack1;

public class GlobalAndLocalVariable {

	int a;
	void fun() {
		int b;
		//System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		GlobalAndLocalVariable t1 = new GlobalAndLocalVariable();
		System.out.println(t1.a);
		t1.fun();
	}

}
