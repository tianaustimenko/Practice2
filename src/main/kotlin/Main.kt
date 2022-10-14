fun main(args: Array<String>) {
    val age1 = 42.00
    val age2 = 21.00
    println(age1)
    println(age2)

    val avg1 = (age1+age2)/2
    println(avg1)

    val firstName = "Татьяна"
    val lastName = "Устименко"

    val fullName = "$firstName $lastName"
    println(fullName)

    val myDetails = "Привет, меня зовут $fullName"
    println(myDetails)

    val triple = Triple(4,3,4)
    val month = triple.first
    val day = triple.second
    val year = triple.third

    val str = """
        |$month
        |
        |$year
    """.trimMargin()

    val e = Pair (3, year)
}