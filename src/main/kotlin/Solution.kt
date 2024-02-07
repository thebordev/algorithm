import java.lang.StringBuilder

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        for (index in 0..word1.length + word2.length) {
            if (word1.length > index) {
                result.append(word1[index])
            }
            if (word2.length > index) {
                result.append(word2[index])
            }
        }
        return result.toString()
    }
    fun gcdOfStrings(str1: String, str2: String): String {
        val result = StringBuilder()

        return result.toString()
    }
}