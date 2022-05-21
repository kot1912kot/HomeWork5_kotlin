class WallService () {

    private var posts = emptyArray<Post>()
    private var counter: Int = 0

    fun add(post: Post): Post {
        post.id = counter
        counter++
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val (match, result) = posts.partition { it.id == post.id }
        if (match.isNotEmpty()) {
            posts = result.plus(post.copy(id = match.first().id, date = match.first().date)).toTypedArray()
        }
        return match.isNotEmpty()
    }
}