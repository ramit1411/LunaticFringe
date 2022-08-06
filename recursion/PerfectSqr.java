package recursion;

import java.util.ArrayList;
import java.util.List;

//not solved optimally
public class PerfectSqr {
	public static List<Integer> stepList = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sqr(2,0);
        System.out.println(stepList);
	}
	

    static void sqr(int n,int steps) {
        
        if(n == 0) {
            stepList.add(steps);
            return;
        }
        
        
        for(int i=1;i*i<=n;i++) {
            sqr(n-(i*i),steps+1);
        }
        
    }

}
