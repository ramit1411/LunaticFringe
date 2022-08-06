package recursion;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle1(4,0);
		triangle2(4,0);
	}
	
	static void triangle1(int row,int col) {
		
		if(row == 0) {
			return;
		}
		
		if(col<row) {
			System.out.print("x");
			triangle1(row,col+1);
		} else {
			System.out.println();
			triangle1(row-1,0);
		}
	}
	
	static void triangle2(int row,int col) {
		
		if(row == 0) {
			return;
		}
		
		if(col<row) {
			triangle2(row,col+1);
			System.out.print("x");
		} else {
			
			triangle2(row-1,0);
			System.out.println();
		}
	}

}
