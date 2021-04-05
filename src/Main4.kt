//5 Char Counter
//
//Given a string and count how many occurrence of each character of the string.
//The output is a dictionary data type, key for chars and value is sum of the chars.
//The character only letter, not space, or any symbols.

object Char_frequency {
    const val SIZE = 26

    // function to print the character and its
    // frequency in order of its occurrence
    fun printCharWithFreq(str: String) {
        // size of the string 'str'
        val n = str.length

        // 'freq[]' implemented as hash table
        val freq = IntArray(SIZE)

        // accumulate freqeuncy of each character
        // in 'str'
        for (i in 0 until n) freq[str[i] - 'a']++

        // traverse 'str' from left to right
        for (i in 0 until n) {

            // if frequency of character str.charAt(i)
            // is not equal to 0
            if (freq[str[i] - 'a'] != 0) {

                // print the character along with its
                // frequency
                print(str[i])
                print(freq[str[i] - 'a'].toString() + " ")

                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                freq[str[i] - 'a'] = 0
            }
        }
    }

    // Driver program to test above
    @JvmStatic
    fun main(args: Array<String>) {
        val str = "sakikkapalodenmak"
        val str2 = "alunjuoilangnyolaimak"
        println(printCharWithFreq(str))
        println(printCharWithFreq(str2))
    }
}