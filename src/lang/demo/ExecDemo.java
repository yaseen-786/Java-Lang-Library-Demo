package lang.demo;

public class ExecDemo {
	public static void main(String args[]) {
		 Runtime r = Runtime.getRuntime();
		 System.out.println(r.getClass());
		 Process p = null;
		 try {
		 p = r.exec("calc");
		 p = r.exec("notepad");
		 } catch (Exception e) {
		 System.out.println("Error executing notepad.");
		 }
		 }
}
