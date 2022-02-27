package cap;

public class cap2 {
	String result = "*";
	public void f(int e) {
			for(int i=0;i<e;i++) {
				for(int j=0;j<e-i;j++) {
					System.out.print(" ");
				}
				System.out.printf("%s",result);
				result+="*";
				System.out.println();
			}
			
	}
}