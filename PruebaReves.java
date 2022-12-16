package ejemploclase;

public class PruebaReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "palabra magica";
		String reves= delreves(texto);
		System.out.println(reves);
		//String reves2=delreves2(texto);
		System.out.println(delreves(texto));
		

	}
	public static String delreves(String txt) {
		String res="";
		
		for (int pos=0;pos<txt.length();pos++)
		
		res= txt.charAt(pos)+res;
		return res;
	}
	
	public static String delreves2(String txt) {
		String res="";
		
		//for (int pos=txt.length()-1;pos--) {
			
		//}
		
		int pos = 0;
		res= res +txt.charAt(pos);
		return res;
	}

}


