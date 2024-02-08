
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

    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }

    fun Char.isVowel(): Boolean {
        return when (this.toLowerCase()) {
            'a' -> true
            'e' -> true
            'i' -> true
            'o' -> true
            'u' -> true
            else -> { false }
        }
    }

    fun reverseVowels(s: String): String {
        val result = StringBuilder()
        var vowels: CharArray = CharArray(s.length)
        var j = 0
        s.forEachIndexed { index, c ->
            if (c.isVowel()) {
                vowels[j] = c
                j++
            }
        }
        s.forEachIndexed { index, c ->
            if (c.isVowel()) {
                j--
                result.append(vowels[j])
            } else {
                result.append(c)
            }
        }
        return result.toString()
    }

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var result = 0
        var lastStep = false
        for (i: Int in 1 until flowerbed.size) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && !lastStep) {
                if (flowerbed.size > i && flowerbed[i + 1] == 1) {

                } else {
                    result++
                    lastStep = true
                }
            } else {
                lastStep = false
            }
        }
        println(result)
        return result == n
    }
}