package org.sample;

public class Sample1 {

	
	public static void main (String[] args)
	{
		//int[] B = {6,42,11,7,1,42};
		//int[] A = {1,23,35,6,7,7,7,64,2,2,3,3,5,54,5,45,4,5,45,45,4,5,6,57,7,6,75,6,45,3,43,4,34,34,3,43,54,6,57,67,5,64,4,53,3,4,34,34,3,3,5,45,46,46,4,4,5,45,45,45,4,54,54,54,5,45,45,4,54,54,5,4};
		int [] a = {12};
		Solution sol = new Solution ();
		//sol.solution(7, 42,B);
		
		System.out.println(sol.solution(12,12,a));
	
	}
	
}

class Solution {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X) 
                nX += 1;
             if (A[i] == Y)
                nY += 1;
            if ( nX==nY) 
                result = i;
            
        }
        return result;
    }
}

