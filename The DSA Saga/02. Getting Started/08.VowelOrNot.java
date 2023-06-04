// https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1

// Time: O(1) - Space O(1)

class Solution {
    String isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return "YES";
        else
            return "NO";
    }
}
