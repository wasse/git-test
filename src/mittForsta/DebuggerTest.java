package mittForsta;

public class DebuggerTest {

	public static void main(String[] args) {
		//Det här programmet skapar en loop som räknar upp talet 7
		
		int j = 7;
		for (int i = 0; i < 6; i++) {
			j = i + j;
		}
		System.out.println(j);
	}

}
