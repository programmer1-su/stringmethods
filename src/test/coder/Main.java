package test.coder;

public class Main {

	public static void main(String[] args) {
		String study = "Java言語基本を勉強しています。";
		String name = "マイク.ミラ";
		String name2 = "マリア.サントス";
		System.out.println(study.charAt(5));
		System.out.println(study.length());
		System.out.println(study.substring(7));
		System.out.println(study.substring(7,11));
		System.out.println(study.contains("て"));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
	}

}
