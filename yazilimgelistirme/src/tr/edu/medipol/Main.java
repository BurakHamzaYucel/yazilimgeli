package tr.edu.medipol;

import org.apache.commons.lang3.StringUtils;



public class Main {

	public static void main(String[] args) {
		
		String hatalimetin = "M ed i p      o         l    ";
		System.out.println("Hatalı Metin: "+ hatalimetin);
			//Hatali metini düzelt
		String duzgunMetin = StringUtils.deleteWhitespace(hatalimetin);
		System.out.println("Düzgün Metin: "+ duzgunMetin);

	}

}
