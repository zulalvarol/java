
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sayi = "100";
		System.out.println(Integer.valueOf(sayi) + 150);
		
		try {
			String yeni = "a100";
			System.out.println(Integer.valueOf(yeni));
		}
		catch(Exception dfddsf) {
			System.out.println("d�zg�n d�n��t�r");
		}
		finally {
			System.out.println("finally");
		}
	}

}
