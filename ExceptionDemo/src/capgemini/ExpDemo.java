package capgemini;

public class ExpDemo {

	public static void main(String[] args) {

			int res=0;
				
				System.out.println("Open File");
				System.out.println("Write Data");
				//int res = ExpDemo.div(9,3);
				try {
					
					res = ExpDemo.div(9,3);
				}
				catch(ArithmeticException e) {
					//System.err.println(ae);
					
				
				  e.printStackTrace();
					}
				System.out.println("res");
				System.out.println("Close File");
			
			

		}

	private static int div(int i, int j) {
		
		return i/j;
	}

	}


