package sortingOfComplexObject;

import java.util.Comparator;

public class HelpingSorting implements Comparator
{

	@Override
	public int compare(Object x, Object y) {
		
		if(((Student)(x)).age>((Student)(y)).age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
