package LletresRepetides;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LletresFase2 {

	public static void main (String[]args) {
		List<String> vowels = Arrays.asList("a","e", "i", "o", "u");
		List<String> numbers = Arrays.asList("0","1", "2", "3", "4", "5", "6", "7", "8", "9");        
			
		              	
            ArrayList<String> nombre = new ArrayList<>();
                nombre.add("j");
                nombre.add("e");
                nombre.add("s");
                nombre.add("s");
                nombre.add("i");
                nombre.add("8");
                nombre.add("a");    
	    
                for(int i=0; i < nombre.size(); i++){
                		
                 	String recoger = nombre.get(i);

                 	if(vowels.contains(recoger)) {
                			System.out.println(" hay una vocal por aquí " + nombre.get(i));
          
                 	  			}else if(numbers.contains(recoger)) {
                            		System.out.println("No hi ha números als noms. " + nombre.get(i)); 
                   
                 	  			}else if (!vowels.contains(recoger)){
                            		System.out.println(" es una consonante " + nombre.get(i));
                             			                      			
                 	  			}
                }
           }   
}  
                	    
	   // for (int i = 0; i < nombre.size(); i++) {	
	    
	    		
	    	// }
	    //	Object ;
		//	if(nombre.charAt()==vowels.charAt(j))
			
          //     		System.out.println("VOCAL");
				
				
				
	        //		}else {
	        	//		System.out.println("CONSONANT");	
	        		//}
						// System.out.println("Els noms de persones no contenen números.");
					
//DO : ARRAYLIST
//*-RECORRER EL ARRAY LIST
//	   SI ENCUENTRA VOCALES IMPRIMIR "VOCAL"
//        SI NO 
//	         IMPRIMIR "CONSONANTE"
//		  SI No
// 			IMPRIMIR " NO HAY NUMEROS"
	 
