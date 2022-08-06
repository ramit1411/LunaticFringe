package maths;

public class FlipAndInvertImage {

	
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0;i<image.length;i++) {
            
            int q = 0;
            int w = image[i].length-1;
            
            while(q<=w) {
                int k = image[i][q] ^ 1; //xor makes it complement
                image[i][q] = image[i][w] ^ 1;
                image[i][w] = k;
                
                q= q+ 1;
                w = w-1;
            }
        }
        
        return image;
    }
	//https://leetcode.com/problems/flipping-an-image/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
