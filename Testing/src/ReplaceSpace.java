
public class ReplaceSpace {

	public static void main(String[] args) {
		String str = "I am Vinay Chhodavadiya";
		System.out.println(str.hashCode());
        str = str.replaceAll("\\s", "%20");
        System.out.println(str.hashCode());
        System.out.println(str);
	}

}
