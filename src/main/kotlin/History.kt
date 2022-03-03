class History(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val expiresAt: Int,
    val isExpires: Boolean,
    val isDeleted: Boolean,
    val canSee: Int,
    val seen: Int,
    val type: String,
    val photo: Photo,
    val video: Video,
    val link: Link,
    val parentStoryOwnerId: Int,
    val parentStoryId: Int,
    val parentStory: Int,
    val replies: Replies,
    val canReply: Boolean,
    val canShare: Boolean,
    val canComment: Boolean,
    val clickableStickers: ClickableStickers,
    val views: Int,
    val accessKey: String) : Attachment {

    data class Link(
        val text: String,
        val url: String
    )

    data class Replies(
        val count: Int,
        val new: Int
    )

    data class ClickableStickers(
        val originalWidth: Int,
        val originalHeight: Int,
        val clickableStickers: Array<ClickableStickers>
    )
}