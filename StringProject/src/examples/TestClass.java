package examples;

final class TestClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student st = new Student();
		System.out.println(st);
		System.out.println((Student)st.clone());
	}

}
