class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<Video.Image>?,
    val imagesWithBackground: Array<Video.Image>?,
    val animationUrl: String,
    val isAllowed: Boolean) : Attachment