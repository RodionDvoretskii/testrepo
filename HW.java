import java.util.Arrays;
public class HW {
	public static void main(String[] args) {
		String s = "Rodion";
		System.out.println(Arrays.toString(s.split("")));
		System.out.println(2.0 - 1.1);
		Integer x = 123;
		Integer y = 123;
		System.out.println(x==y);

		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		System.out.println("a + b = " + a + " + " + b + " = " + a + b);
	}
}