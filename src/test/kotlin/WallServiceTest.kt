import kotlinx.datetime.Clock
import org.junit.After
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_shouldAddPost() {

        val post = WallService.add(
            Post(
                id = 0,
                ownerId = 1,
                fromId = (0..10000).random(),
                createdBy = (0..10000).random(),
                date = 1645866739,
                text = "",
                replyOwnerId = (0..10000).random(),
                replyPostId = (0..10000).random(),
                friendsOnly = true,
                comments = Post.Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                ),
                copyright = Post.Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                ),
                likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                reposts = Post.Reposts((0..10000).random(), true),
                views = Post.Views((0..10000).random()),
                postType = "post",
                signerId = (0..10000).random(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isInteger = (0..10000).random(),
                markedAsAds = true,
                isFavorite = true,
                donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
                postponedId = (0..10000).random(),
                attachment = listOf(
                    Photo(
                        id = 1,
                        albumId = 1,
                        ownerId = 2,
                        userId = 2,
                        text = "",
                        date = 1645875482,
                        sizes = Photo.Sizes(
                            type = "",
                            url = "",
                            width = 640,
                            height = 480
                        ),
                        width = 480,
                        height = 640
                    )
                )
            )
        )

        assertNotEquals(post.id, 0)
    }

    @Test
    fun update_shouldUpdatePostTrue() {

        val post = WallService.add(
            Post(
                id = 0,
                ownerId = 1,
                fromId = (0..10000).random(),
                createdBy = (0..10000).random(),
                date = 1645866739,
                text = "Hello",
                replyOwnerId = (0..10000).random(),
                replyPostId = (0..10000).random(),
                friendsOnly = true,
                comments = Post.Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                ),
                copyright = Post.Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                ),
                likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                reposts = Post.Reposts((0..10000).random(), true),
                views = Post.Views((0..10000).random()),
                postType = "post",
                signerId = (0..10000).random(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isInteger = (0..10000).random(),
                markedAsAds = true,
                isFavorite = true,
                donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
                postponedId = (0..10000).random(),
                attachment = listOf(
                    Photo(
                        id = 1,
                        albumId = 1,
                        ownerId = 2,
                        userId = 2,
                        text = "",
                        date = 1645875482,
                        sizes = Photo.Sizes(
                            type = "",
                            url = "",
                            width = 640,
                            height = 480
                        ),
                        width = 480,
                        height = 640
                    )
                )
            )
        )

        val resultTrue = WallService.update(post)

        assertTrue(resultTrue)
    }

    @Test
    fun update_shouldUpdatePostFalse() {

        val post = Post(
            id = 7,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "Hello",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = listOf(
                Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 2,
                    userId = 2,
                    text = "",
                    date = 1645875482,
                    sizes = Photo.Sizes(
                        type = "",
                        url = "",
                        width = 640,
                        height = 480
                    ),
                    width = 480,
                    height = 640
                )
            )
        )
        WallService.add(
            Post(
                id = 0,
                ownerId = 1,
                fromId = (0..10000).random(),
                createdBy = (0..10000).random(),
                date = 1645866739,
                text = "Hi!",
                replyOwnerId = (0..10000).random(),
                replyPostId = (0..10000).random(),
                friendsOnly = true,
                comments = Post.Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                ),
                copyright = Post.Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                ),
                likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                reposts = Post.Reposts((0..10000).random(), true),
                views = Post.Views((0..10000).random()),
                postType = "post",
                signerId = (0..10000).random(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isInteger = (0..10000).random(),
                markedAsAds = true,
                isFavorite = true,
                donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
                postponedId = (0..10000).random(),
                attachment = listOf(
                    File(
                        id = 1,
                        ownerId = 1,
                        title = "title",
                        size = 100,
                        ext = "",
                        url = "url",
                        date = 1645875797,
                        type = 1,
                        preview = File.Preview(
                            photo = File.PhotoFile(
                                sizes = Photo.Sizes(
                                    type = "",
                                    url = "",
                                    width = 640,
                                    height = 480
                                )
                            ),
                            graffiti = File.Graffiti(
                                src = "",
                                width = 640,
                                height = 480
                            ),
                            audioMessage = File.AudioMessage(
                                duration = 1,
                                waveform = null,
                                linkOgg = "",
                                linkMp3 = ""
                            )
                        )
                    )
                )
            )
        )
        WallService.add(
            Post(
                id = 0,
                ownerId = 1,
                fromId = (0..10000).random(),
                createdBy = (0..10000).random(),
                date = 1645866739,
                text = "Hello",
                replyOwnerId = (0..10000).random(),
                replyPostId = (0..10000).random(),
                friendsOnly = true,
                comments = Post.Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                ),
                copyright = Post.Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                ),
                likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                reposts = Post.Reposts((0..10000).random(), true),
                views = Post.Views((0..10000).random()),
                postType = "post",
                signerId = (0..10000).random(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isInteger = (0..10000).random(),
                markedAsAds = true,
                isFavorite = true,
                donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
                postponedId = (0..10000).random(),
                attachment = listOf(
                    File(
                        id = 1,
                        ownerId = 1,
                        title = "title",
                        size = 100,
                        ext = "",
                        url = "url",
                        date = 1645875797,
                        type = 1,
                        preview = File.Preview(
                            photo = File.PhotoFile(
                                sizes = Photo.Sizes(
                                    type = "",
                                    url = "",
                                    width = 640,
                                    height = 480
                                )
                            ),
                            graffiti = File.Graffiti(
                                src = "",
                                width = 640,
                                height = 480
                            ),
                            audioMessage = File.AudioMessage(
                                duration = 1,
                                waveform = null,
                                linkOgg = "",
                                linkMp3 = ""
                            )
                        )
                    )
                )
            )
        )

        val resultFalse = WallService.update(post)
        assertFalse(resultFalse)
    }

    @Test
    fun createComment_shouldAddComment() {
        val post = Post(
            id = 57,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = listOf(
                Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 2,
                    userId = 2,
                    text = "",
                    date = 1645875482,
                    sizes = Photo.Sizes(
                        type = "",
                        url = "",
                        width = 640,
                        height = 480
                    ),
                    width = 480,
                    height = 640
                )
            )
        )
        val comment = Comment(
            id = 1,
            fromId = (0..100).random(),
            date = Clock.System.now().epochSeconds.toInt(),
            text = "Hello",
            donut = Post.Donut(
                isDonut = true,
                paidDuration = (0..100).random(),
                placeholder = Post.Donut.Placeholder(),
                canPublishFreeCopy = true,
                editMode = "Edit"
            ),
            replyToUser = (0..100).random(),
            replyToComment = (0..100).random(),
            attachments = listOf(
                Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 2,
                    userId = 2,
                    text = "",
                    date = 1645875482,
                    sizes = Photo.Sizes(
                        type = "",
                        url = "",
                        width = 640,
                        height = 480
                    ),
                    width = 480,
                    height = 640
                )
            ),
            parentsStack = listOf((0..100).random(), (0..100).random()),
            thread = Comment.Thread(
                count = (0..100).random(),
                items = emptyList(),
                canPost = true,
                showReplyButton = true,
                groupsCanPost = true
            )
        )
        val postId = 57

        WallService.posts.add(post)
        WallService.createComment(comment, postId)

        assertTrue(WallService.comments.isNotEmpty())
    }

    @Test(expected = PostNotFoundException::class)
    fun createComment_shouldThrow() {
        val post = Post(
            id = 57,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = listOf(
                Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 2,
                    userId = 2,
                    text = "",
                    date = 1645875482,
                    sizes = Photo.Sizes(
                        type = "",
                        url = "",
                        width = 640,
                        height = 480
                    ),
                    width = 480,
                    height = 640
                )
            )
        )
        val comment = Comment(
            id = 1,
            fromId = (0..100).random(),
            date = Clock.System.now().epochSeconds.toInt(),
            text = "Hello",
            donut = Post.Donut(
                isDonut = true,
                paidDuration = (0..100).random(),
                placeholder = Post.Donut.Placeholder(),
                canPublishFreeCopy = true,
                editMode = "Edit"
            ),
            replyToUser = (0..100).random(),
            replyToComment = (0..100).random(),
            attachments = listOf(
                Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 2,
                    userId = 2,
                    text = "",
                    date = 1645875482,
                    sizes = Photo.Sizes(
                        type = "",
                        url = "",
                        width = 640,
                        height = 480
                    ),
                    width = 480,
                    height = 640
                )
            ),
            parentsStack = listOf((0..100).random(), (0..100).random()),
            thread = Comment.Thread(
                count = (0..100).random(),
                items = emptyList(),
                canPost = true,
                showReplyButton = true,
                groupsCanPost = true
            )
        )
        val postId = 0

        WallService.posts.add(post)
        WallService.createComment(comment, postId)
    }

    @After
    fun clearArray() {
        WallService.posts.clear()
    }
}