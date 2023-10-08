package nameAndDeflautArgs

fun main() {
    val poem = """
        |->Last night I saw upon the stair
        |->A little man who wasn't there
        |->He wasn't there again today
        |->Oh, how I wish he'd go away.
    """
    println(poem.trimMargin())
    println(poem.trimMargin(marginPrefix = "|->"))
}