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
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = ArrayList<Boolean>()
        val max = candies.max()
        candies.forEach {
            result.add(it.plus(extraCandies) >= max)
        }
        return result
    }
}