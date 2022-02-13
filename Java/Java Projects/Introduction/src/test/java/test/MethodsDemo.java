package test;

public class MethodsDemo {
	public static void main(String[] args) {
		MethodsDemo methodsdemo = new MethodsDemo();
		String name = methodsdemo.getData();
		System.out.println(name);
		MethodsDemo2 methodsdemo2 = new MethodsDemo2();
		String name1 = methodsdemo2.getUserData();
		System.out.println(name1);
		String name3 = getData2();
		System.out.println(name3);

	}
	
	public String getData() {
		System.out.println("hello world");
		return "Naren Bagavathy";
	}
	
	public static String getData2() {
		System.out.println("Galaxy");
		return "Generation";
	}

}
