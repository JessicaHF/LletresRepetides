package People;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;
public class LletresFase3 {

	public static void main(String[] args) {
	       
		
			HashMap<Character,Integer> lletres = new HashMap<>();
		
			String nombre= "FelipeFroil7anDetodoslosSantos" ;

				 
			for (int i = 0; i< nombre.length();i++) {
				if(lletres.containsKey(nombre.charAt(i))) {
					lletres.put(nombre.charAt(i), (int)lletres.get (nombre.charAt(i)) + 1);
				}else {
					lletres.put(nombre.charAt(i), 1);
				}
			}
						
			Set<HashMap.Entry<Character,Integer>> freq = lletres.entrySet();
			Iterator<HashMap.Entry<Character, Integer>> it = freq.iterator();
			
			
			while(it.hasNext()) {
				Map.Entry<Character, Integer> item = it.next();
				System.out.println(item.getKey() + ": " + item.getValue());
			}
				
	}
	
}	
	
	
	
				

			/*for (Entry<java.lang.String, Integer> entry : name.entrySet()) {*/
			    
				/*int count = Collections.frequency((Collection<?>) name, "s");/*
				
				/*System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());*/
				/*System.out.println(count);*/
	/*
			    Integer i = wordCounts.get(n);
			    if(i == null) wordCounts.put(n, 1);
			    else wordCounts.put(n, i + 1);
			}
				}
			}		
			*/
			/*
		    for(Name student : Name)
		    {
		        nameMap.put(student.getId(), student.getName());

		    }

			*/
	           