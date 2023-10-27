package Practice;

interface xyz{
	
     void show();
			
}

/*
 * class abc implements xyz{
 * 
 * 
 * public void show() {
 * 
 * System.out.println("Hello Show"); }
 * 
 * }
 */


public class LambdaExp {

	public static void main(String[] args) {
		xyz y = //()->System.out.println("Hello Show");
				
				
				  new xyz() { public void show() {
				   System.out.println("Hello show"); 
				   }
				  
				  };
				 
		 
		 y.show();

	}

}
