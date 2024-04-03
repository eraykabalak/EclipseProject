 package deneme1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Kisi newkis1 = new Kisi("eray");
		Kisi newkis2 = new Kisi("ayşe");
		
		
		ArrayList <Kisi> arrraylist = new ArrayList<>();
		arrraylist.add(newkis1);
		arrraylist.add(newkis2);
	

		for(Kisi a : arrraylist)
		{
			System.out.println(a);
		}

	}

}
