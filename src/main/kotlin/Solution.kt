import kotlin.math.abs

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

    fun binarySearch(elements: IntArray, elementToFind: Int, low: Int, high: Int): Int {
        var highLevel = high
        var lowLevel = low
        while (low <= highLevel) {
            val mid = (low + highLevel) / 2
            if (elements[mid] == elementToFind) {
                return mid
            } else if (elements[mid] > highLevel) {
                highLevel = mid - 1
            } else {
                lowLevel = mid - 1
            }
        }
        return 0
    }

    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        val n = result.size
        var i = 0
        var j = n - 1
        for (p in j downTo 0) {
            if (abs(nums[i]) > abs(nums[j])) {
                nums[p] = nums[i] * nums[i]
                i++
            } else {
                nums[p] = nums[j] * nums[j]
                j--
            }
        }
        return result
    }

    fun sortPowHard(numbers: List<Int>): List<Int> {
        val newArray = ArrayList<Int>()
        numbers.forEach {
            newArray.add(it.square())
        }
        newArray.sort()
        quickSortLomuto(newArray.toIntArray())
        return newArray
    }

    fun quickSortLomuto(arr: IntArray, start: Int = 0, end: Int = arr.size - 1) {
        if (start < end) {
            val pivot = partitionLomuto(arr, start, end)
            quickSortLomuto(arr, start, pivot - 1)
            quickSortLomuto(arr, pivot + 1, end)
        }
    }

    fun partitionLomuto(arr: IntArray, start: Int, end: Int): Int {
        val pivot = arr[end]
        var i = start
        for (j in start until end) {
            if (arr[j] < pivot) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                i++
            }
        }
        val temp = arr[i]
        arr[i] = arr[end]
        arr[end] = temp
        return i
    }

    private fun Int.square() = this * this

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