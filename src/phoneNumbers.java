public class phoneNumbers{   

   

    public static void main (String args[]){   

       

        new phoneNumbers ();   

    } 

   

    public phoneNumbers (){   

     
             //0123456789abcd
String BCSS = "(604) 713-8180";   

System.out.println (BCSS.substring (0, 14));           



   	System.out.println(BCSS.substring(1,4));

        //(b) 6   
	System.out.println(BCSS.charAt(1));

        //(c) 713   
	System.out.println(BCSS.substring(6,9));

        //(d) 4   
	System.out.println(BCSS.charAt(3));

        //(e) 8180   
	System.out.println(BCSS.substring(10,14));

        //(f) 7   
	System.out.println(BCSS.charAt(6));

	//mark
	             //0123456789abcd
		     //(604) 713-8180
        //(g) 716-8180 
             //0123456789abcd
//	BCSS = "(604) 713-8180";   

	  
	System.out.println();
	System.out.print(BCSS.substring(6,8));
	System.out.print(BCSS.charAt(1));
	System.out.print(BCSS.substring(9,14));

        //(h) 6047138180   
	System.out.println();
	System.out.print(BCSS.substring(1,4));
	System.out.print(BCSS.substring(6,9));
	System.out.print(BCSS.substring(10,14));

        //(i) 604 713 8180   
	System.out.println();
	
	System.out.print(BCSS.substring(1,4)+" ");
	System.out.print(BCSS.substring(6,9)+" ");
	System.out.print(BCSS.substring(10,14));
        //(j) 604-713-8180 
	System.out.println();    

	System.out.print(BCSS.substring(1,4));
	System.out.print(BCSS.charAt(9));
	System.out.print(BCSS.substring(6,9));
	System.out.print(BCSS.charAt(9));
	System.out.print(BCSS.substring(10,14));	
        //(k) 0818 317 406   
	System.out.println();
		     //0123456789abcd
		     //(604) 713-8180


	for(int i = 13; i>=0; i--){
		if(i == 4 || i ==0)
			System.out.print("");
		else if(i == 9)
			System.out.print(" ");
		else
			System.out.print(BCSS.charAt(i));
	}
	System.out.println();	
    }   

}   
