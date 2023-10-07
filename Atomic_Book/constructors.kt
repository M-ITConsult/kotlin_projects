class AlienSpecies(
    private val name: String,
    private val eyes: Int,
    private val hands: Int,
    private val legs: Int) {
    fun describe() = "$name with $eyes eyes, " +
            "$hands hands and $legs legs"
}