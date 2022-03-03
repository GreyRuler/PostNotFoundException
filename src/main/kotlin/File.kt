class File( val id: Int,
            val ownerId: Int,
            val title: String,
            val size: Int,
            val ext: String,
            val url: String,
            val date: Int,
            val type: Int,
            val preview: Preview) : Attachment {

    data class Preview(
        val photo: PhotoFile,
        val graffiti: Graffiti,
        val audioMessage: AudioMessage
    )

    data class PhotoFile(
        val sizes: Photo.Sizes
    )

    data class Graffiti(
        val src: String,
        val width: Int,
        val height: Int,
    )

    data class AudioMessage(
        val duration: Int,
        val waveform: Array<Int>?,
        val linkOgg: String,
        val linkMp3: String
    )
}