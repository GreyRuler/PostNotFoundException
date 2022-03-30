object WallService {

    private val posts = mutableListOf<Post>()
    private val comments = mutableListOf<Comment>()
    private var postID = 0

    fun add(post: Post): Post {
        val olderPost = post.copy(id = ++postID)
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
                posts[posts.indexOf(postFromArr)] = copy
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        if (posts.any { it.id == comment.fromId }) {
            comments.add(comment)
            return true
        } else {
            throw PostNotFoundException("В массиве отсутствует пост с id ${comment.fromId}")
        }
    }

    fun postsClear() {
        posts.clear()
    }

}