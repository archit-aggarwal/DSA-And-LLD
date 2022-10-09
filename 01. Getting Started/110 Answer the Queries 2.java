//Link : https://practice.geeksforgeeks.org/problems/java-collection-set-1-arraylist/1

class GfG
{
    /*inserts an element x at 
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
	    // Your code here
	    A.add(x);
    }	
	
    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
	    // Your code here
	    Collections.sort(A);
    }
	
    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
	    // Your code here
	    Collections.reverse(A);
    }
	
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
	// Your code here
	    return A.size();
    }
	
    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
    	// Your code here
    	Collections.sort(A);
    	Collections.reverse(A);
    }
	
    /*prints space separated 
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        for(int x : A) {
            System.out.print(x + " ");
        }
    }
}
