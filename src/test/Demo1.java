package test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Test;


@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1 {

	@Test
	public void test(){
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object object = (Object) en.nextElement();
			System.out.println(object);
		}
		
	}
	
	
}
