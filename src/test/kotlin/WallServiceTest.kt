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

        val post1 = WallService.add(
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
                    Video(
                        id = 1,
                        ownerId = 1,
                        title = "",
                        description = "",
                        duration = 0,
                        image = null,
                        firstFrame = null,
                        date = 1645875797,
                        addingDate = 10,
                        views = 1,
                        localViews = 1,
                        comments = 1,
                        player = "",
                        platform = "",
                        canAdd = true,
                        isPrivate = 1,
                        accessKey = "",
                        processing = 1,
                        isFavorite = false,
                        canComment = true,
                        canEdit = false,
                        canLike = true,
                        canRepost = true,
                        canSubscribe = true,
                        canAddToFaves = true,
                        canAttachLink = true,
                        width = 480,
                        height = 640,
                        userId = 1,
                        converting = true,
                        added = true,
                        isSubscribed = true,
                        repeat = 1,
                        type = "video",
                        balance = 1,
                        liveStatus = "",
                        live = 1,
                        upcoming = 1,
                        spectators = 2,
                        likes = Post.Likes(
                            count = 500,
                            userLikes = true,
                            canLike = true,
                            canPublish = false
                        ),
                        reposts = Post.Reposts(
                            count = 10,
                            userReposted = true
                        )
                    )
                )
            )
        )
        val post2 = WallService.add(
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

        val resultTrue = WallService.update(post2)

        assertTrue(resultTrue)
    }

    @Test
    fun update_shouldUpdatePostFalse() {

        val post1 = WallService.add(
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
        val post2 = WallService.add(
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
        val post3 = Post(
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

        val resultFalse = WallService.update(post3)
        assertFalse(resultFalse)
    }

    @After
    fun clearArray() {
        WallService.posts.clear()
    }
}