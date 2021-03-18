package Exercise8;

import java.util.ArrayList;
import java.util.Iterator;

import Exercise7.calculate;

public class list {
	
	public list(){
		calculate x1 = new calculate(45);
		calculate x2 = new calculate(60);
		calculate x3 = new calculate(90);

		ArrayList<calculate> weightlist = new ArrayList<calculate>();

		weightlist.add(x1);
		weightlist.add(x2);
		weightlist.add(x3);

		Iterator<calculate> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().totalweight();
		}
	}
}