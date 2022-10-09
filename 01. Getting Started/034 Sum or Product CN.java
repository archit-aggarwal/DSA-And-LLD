public class Solution {

    public static long sum(int n) {
        return (long)((n*(n+1))/2);
    }
    
    public static long factorial(int n) {
        if(n == 0) return 1L;
        long product = 1L;
        for(int i=n;i>=1;i--) {
            product = (product * i) % 1000000007;
        }
        
        return product;
    }
    
	public static long sumOrProduct(int n, int q) {

		if(q == 1) {
            //sum
            return sum(n);
        } else {
            //factorial
            return factorial(n);
        }
	}
}
