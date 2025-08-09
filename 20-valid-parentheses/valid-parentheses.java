class Solution {
    public boolean isValid(String s) {
        Stack<Character> sa = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                sa.push(current);
            } else {
                if (sa.isEmpty()) return false;

                char top = sa.pop();
                if ((current == ')' && top != '(') ||
                    (current == '}' && top != '{') ||
                    (current == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return sa.isEmpty();
    }
}