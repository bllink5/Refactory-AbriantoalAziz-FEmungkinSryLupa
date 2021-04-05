//
//internal object GFG {
//    private fun missingChars(
//            str: String, strLength: Int): ArrayList<Char> {
//        val MAX_CHARS = 26
//
//        // A boolean array to store characters
//        // present in string.
//        val present = BooleanArray(MAX_CHARS)
//        val charsList = ArrayList<Char>()
//
//        // Traverse string and mark characters
//        // present in string.
//        for (i in 0 until strLength) {
//            if ('A' <= str[i] &&
//                    str[i] <= 'Z') present[str[i] - 'A'] = true else if ('a' <= str[i] &&
//                    str[i] <= 'z') present[str[i] - 'a'] = true
//        }
//
//        // Store missing characters in alphabetic
//        // order.
//        for (i in 0 until MAX_CHARS) {
//            if (present[i] == false) charsList.add((i + 'a'.toInt()).toChar())
//        }
//        return charsList
//    }
//
//    // Driver Code
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val str = "The quick brown fox jumps " +
//                "over the dog"
//        val missing = missingChars(
//                str, str.length)
//        if (missing.size >= 1) {
//            for (character in missing) {
//                print(character)
//            }
//        }
//    }
//}