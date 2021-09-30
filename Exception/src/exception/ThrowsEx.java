package exception;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("");
	}

}
