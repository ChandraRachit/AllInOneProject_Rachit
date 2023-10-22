package collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String arg[]) {
		Vector<String> v=new Vector<String>();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("e");
		Iterator it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
