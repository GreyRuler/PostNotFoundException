data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Post.Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: List<Attachment>,
    var parentsStack: List<Int>,
    val thread: Thread
) {
    data class Thread(
        val count: Int,
        val items: List<Comment>,
        val canPost: Boolean,
        val showReplyButton: Boolean,
        val groupsCanPost: Boolean
    )
}