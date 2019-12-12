package thienle.ifactory;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDuLieuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat dcf=new DecimalFormat("#,###");

		DecimalFormatSymbols dfs=

		new DecimalFormatSymbols(Locale.getDefault());

		dfs.setGroupingSeparator('.');

		int x=124350;

		dcf.setDecimalFormatSymbols(dfs);

		System.out.println(dcf.format(x));
		
		
		
		
			
	}

}
