package Song

fun main(args: Array<String>) {
    val Songs = arrayOf(
        Song("Smooth Criminal", "Michael Jackson"),
        Song("Billie Jean", "Michael Jackson")
    )

    Songs.forEach {
        it.play()
        it.stop()
    }
}