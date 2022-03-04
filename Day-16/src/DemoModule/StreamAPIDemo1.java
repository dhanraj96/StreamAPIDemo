package DemoModule;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		Iterator<Integer> iValues = values.iterator();
		   while(iValues.hasNext())
		    {
			
				System.out.println(iValues.next());
			}
			

	}

}
