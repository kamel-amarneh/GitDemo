
public class PS2 extends PS3{

	int a;
	int t;
	String name;

	public PS2(int a, int t, String name, int r, int j) {
		super(r,j);
		this.a=a;
		this.t=t;
		this.name=name;
	}

	public int increment() {
		a += 1;
		return a;
	}
	
	public int decrement() {
		t -= 1;
		return t;
	}
	
	public String myname() {
		return "Hey "+name;
	}
}
