// https://practice.geeksforgeeks.org/problems/huffman-decoding/1
// Time = O(N + L), Space = O(N) Recursion Stack Space

class MinHeapNode {
    char data;
    int freq;
    MinHeapNode left, right, top;

    MinHeapNode(char c, int freq) {
        left = right = null;
        this.data = c;
        this.freq = freq;
    }
}

class Decode {
    static String decodeHuffmanData(MinHeapNode root, String binaryString) {
        if (binaryString.equals(""))
            return "";

        MinHeapNode curr = root;
        int idx = 0;

        while (curr.data == '$') {
            if (binaryString.charAt(idx) == '0')
                curr = curr.left;
            else
                curr = curr.right;
            idx++;
        }

        return curr.data + decodeHuffmanData(root, binaryString.substring(idx));
    }
}