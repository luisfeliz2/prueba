package ejemploclase;

public class DecimalAHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3542;
		int resto;
		String cifra="0123456789ABCDEF";
		
		
		while (num>0) {
			resto = num % 16;
			num= num / 16;
			System.out.print(cifra.charAt(resto));
		}

	}

}
