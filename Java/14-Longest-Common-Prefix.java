class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return \\;
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentCharacter = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentCharacter) {
                    return output.toString();
                }
            }

            output.append(currentCharacter);
            }
        return output.toString();
    }
}
