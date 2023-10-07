fun main() {
    print("Veuillez entrez votre poids: ")
    val poids = readln().toDouble()
    print("Veuillez entrez votre taille en mètre: ")
    val kilo = readln().toDouble()
    val result = calculateBMI(poids,kilo)
    println(result)
}

fun calculateBMI(kg: Double, meter: Double): String {
    val bmi = kg / (meter * meter)
    return when {
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal weight"
        else -> "Overweight"
    }
}