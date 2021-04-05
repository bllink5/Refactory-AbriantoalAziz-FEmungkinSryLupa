//internal object GFG {
//    fun censor(text: String,
//               a: String,
//               b: String,
//               c: String,
//               d: String,
//               e: String,
//               f: String,
//               g: String,): String {
//
//        val word_list = text.split(" ".toRegex()).toTypedArray()
//
//        var result = ""
//
//        var stars = ""
//        for (i in 0 until a.length) stars += '*'
//
//
//        var index = 0
//        for (i in word_list) {
//            if (i.compareTo(a) == 0 || i.compareTo(b) == 0 || i.compareTo(c) == 0
//                    || i.compareTo(d) == 0 || i.compareTo(e) == 0
//                    || i.compareTo(f) == 0 || i.compareTo(g) == 0)
//
//                word_list[index] = stars
//            index++
//        }
//
//
//        for (i in word_list) result += "$i "
//        return result
//    }
//
//    // Driver code
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val kalimat = "Lorem ipsum dolor sit amet, consectetur adipisicing elit , sed do eiusmod tempor incididunt ut labore et dolore magna aliqua .\n" +
//                "Ut enim ad minim veniam , quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat .\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur .\n" +
//                "Excepteur sint occaecat cupidatat non proident , sunt in culpa qui officia deserunt mollit anim id est laborum ."
//        val sensor = "dolor"
//        val sensor1 = "elit"
//        val sensor2 = "quis"
//        val sensor3 = "nisi"
//        val sensor4 = "fugiat"
//        val sensor5 = "proident"
//        val sensor6 = "laborum"
//        println(censor(kalimat, sensor, sensor1,sensor2, sensor3, sensor4, sensor5, sensor6))
//    }
//}