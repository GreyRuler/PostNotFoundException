class Photo( val id: Int,
             val albumId: Int,
             val ownerId: Int,
             val userId: Int,
             val text: String,
             val date: Int,
             val sizes: Sizes,
             val width: Int,
             val height: Int) : Attachment {

    data class Sizes (
        val type: String,
        val url: String,
        val width: Int,
        val height: Int)
}