public class HollePrinter{
	public static void main(String arg[]){
		String a="Hello World";
		
		System.out.println(a);
		a=a.replace("o","e");
		a=a.replaceFirst("e", "o");
		System.out.println("after switching e and o");
		System.out.println(a);

}
}