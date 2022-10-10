class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
    
        double r = arr.get(0);
        double l = r;
        double b = (arr.size() == 2) ? arr.get(1) : 0;
    
        switch(choice) {
            case 1:
                return Math.PI *r *r;
            case 2:
                return l * b;
            default:
            return 0;
        }
    }
}
