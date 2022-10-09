//Link : https://practice.geeksforgeeks.org/problems/java-arraylist5312/1
ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
        if(Q == 1) {
            int p = Query.get(0);
            int r = Query.get(1);
            A.add(p,r);
            return A;
        } else {
            ArrayList<Integer> res = new ArrayList<>();
            int p = Query.get(0);
            for(int i=A.size()-1;i>=0;i--) {
                if(A.get(i) == p) {
                    res.add(i);
                    return res;
                }
            }
            
            res.add(-1);
            return res;
        }
    }
