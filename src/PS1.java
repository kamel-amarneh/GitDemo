import org.testng.annotations.Test;

public class PS1 {

	@Test
	public void testRun() {

		int a = 3;
		int t = 7;
		int j = 5;
		int r = 6;
		String name = "kamel amarneh";
		PS2 ps2 = new PS2(a, t, name, r, j);

		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.myname());
		System.out.println(ps2.multiplyTow());
		System.out.println(ps2.multiplyThree());
	}

}
