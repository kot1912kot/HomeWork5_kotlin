import org.junit.Assert.*

fun main() {
    val service = WallService()
    val postId = service.add(Post(id = 1, text = "Какой-то текст"))
    val postId1 = service.add(Post(id = 2, text = "Какой-то текст ewrwer"))
    println(postId)
    println(postId1)
}

