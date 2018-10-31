public class ArrayListString {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("yusuf");
		string.add("farhan");
		string.add("masdar");
		
    System.out.println(string.toString());
		System.out.println("index of anugrah : "+string.indexOf("anugrah"));
		
    string.remove(1);
		System.out.println(string.toString());
		System.out.println("SIZE : "+string.size());	
	}
}
