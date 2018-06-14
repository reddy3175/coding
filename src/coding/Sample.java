package coding;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
		
	
	HashMap hm=new HashMap();
	hm.put("sana", 101);
	
	hm.put("Value", 104);
	System.out.println(hm);
	
	Set s=hm.keySet();
	System.out.println(s);
	
	Collection C=hm.values();
	System.out.println(C);
	
	Set s1=hm.entrySet();
	System.out.println(s1);
	
	Iterator itr=s1.iterator();
	while(itr.hasNext()) {
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"...."+m1.getValue());
		
		if(m1.getKey().equals("value")) {
			m1.setValue(110);
		}
	}
}
}
