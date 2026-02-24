public class J_smith{ 

 

public static void main (String args[]){ 


new J_smith(); 
//JohnJacob firstSon = new JohnJacob();
} 


//constructor that gets called when the JohnJacob object created 

public J_smith(){ 





	String jj = "John Jacob Jingleheimer Schmidt"; 

	System.out.println(jj.toUpperCase());//1. print all capitals 

	System.out.println(jj.toLowerCase());//2. print all lowercase 

	System.out.println(jj.replace('a','@'));


	System.out.println(jj.replace('i','^'));//5. replace i with ^ 


	System.out.println(jj.replace('o','+'));//6. replace o with + 

	
	System.out.println(jj.replace('u','&'));//7. replace u with & 


	System.out.println(jj.charAt(1));//8. print out the 2nd character 

	System.out.println(jj.charAt(2));//9. print out the 3rd character 

	System.out.println(jj.charAt(7));//10. print out the 8th character 

	System.out.println(jj.charAt(jj.length()-1));//11. print out the last character 

	System.out.println(jj.charAt((jj.length())-2));//12. print out the 2nd last character 

	System.out.println(jj.charAt((jj.length()/2)));//13. print out the middle character 

	System.out.println(jj.length());//14. print out the length 

	System.out.println((float)((float)jj.length()/2));//15. print out the length/2 

	System.out.println((int)jj.charAt(4));//16. print out the ASCII value of the 5th character 

	System.out.println((int)jj.charAt(10));//17. print out the ASCII value of the 11th character 

	System.out.println((int)jj.charAt(14));//18. print out the ASCII value of the 15th character 

	} 

} 
