class Solution {
    public int bulbSwitch(int n) {
        
        int count = 0;
        for(int i=1;i<=n;i++) {
            int sqrt = (int)Math.sqrt(i);
            if(sqrt * sqrt == i) count++;
        }
        
        return count;
    }
}
