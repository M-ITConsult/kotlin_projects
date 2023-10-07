class AlienSpecies(val name: String,
                   val eyes: Int,
                   val hands: Int,
                   val legs: Int) {
    fun describe() = "$name with $eyes eyes, " +
            "$hands hands and $legs legs"

}