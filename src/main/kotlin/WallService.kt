object WallService {

    val posts = mutableListOf<Post>()
    private val comments = mutableListOf<Comment>()
    private const val MAXID = 1_000_000_000 // обусловленно предположением в 1 млрд постов

    fun add(post: Post): Post {
        var id: Int
        do {
            id = (0..MAXID).random()
        } while (posts.any { it.id == id })

        val olderPost = post.copy(id = id)
        posts.add(olderPost)

        return olderPost
    }

    fun update(post: Post): Boolean {
        for (postFromArr in posts) {
            if (postFromArr.id == post.id) {
                val copy = postFromArr.copy(
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isInteger = post.isInteger,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                posts.set(posts.indexOf(postFromArr), copy)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment, ownerId: Int = 0, postId: Int = 0, message: String = "", replyToComment: Int = 0,
                      attachments: List<Attachment> = mutableListOf(), stickerId: Int = 0, guid: String = "0",
                      fromGroup: Int = 0) {
        if (posts.any { it.id == postId }) {
            comments.add(comment)
        } else {
            throw PostNotFoundException("В массиве отсутствует пост с id равный postId")
        }
    }
}