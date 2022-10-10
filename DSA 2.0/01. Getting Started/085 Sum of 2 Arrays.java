class Solution {
    
    int[] sum(int[] a, int[] b) {
        int size = (a.length > b.length) ? a.length + 1 : b.length + 1;
        int[] res = new int[size];
        
        int i = a.length -1, j = b.length-1, k = size-1;
        int ca = 0;
        
        while(i >= 0 || j >= 0 || ca > 0) {
            int d1 = (i >= 0) ? a[i] : 0;
            int d2 = (j >= 0) ? b[j] : 0;
            
            if(d1 + d2 + ca < 10) {
                res[k] = d1 + d2 + ca;
                ca = 0;
            } else {
                res[k] = (d1 + d2 + ca) % 10;
                ca = (d1 + d2 + ca) / 10;
            }
            
            i--;j--;k--;
        }
        
        return res;
        
    }
    
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        int[] res = sum(a,b);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<res.length;i++) {
            if(i == 0 && res[i] == 0) {
                continue;
            } else {
                list.add(res[i]);
            }
        }
        
        return list;
    }
}
