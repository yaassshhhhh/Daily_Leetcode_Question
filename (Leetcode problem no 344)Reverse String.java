class Solution {

    public void reverseString(char[] s) {
        int first = 0, last = s.length - 1;

        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        Solution obj = new Solution();
        obj.reverseString(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
