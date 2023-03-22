package Song

class Song (val title: String, val artist: String) {
    fun play() {
        println("Playing song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}