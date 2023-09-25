package Pattern_Questions;

public class Diamond_Pattern {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i+k);j++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
			
		}
		

	}

}
