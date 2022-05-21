import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class WallServiceTest {

    @Test
    fun updatePost() {
        val service = WallService()
        service.add(Post(id = 1, text = "�����-�� �����"))
        service.add(Post(id = 1, text = "2-�� �����-�� �����"))
        service.add(Post(id = 2, text = "3-�� �����-�� �����"))
        val update = Post(id = 1, text = "��� �� ��������")
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun noUpdatePost() {
        val service = WallService()
        service.add(Post(id = 1, text = "�����-�� �����"))
        service.add(Post(id = 1, text = "2-�� �����-�� �����"))
        service.add(Post(id = 2, text = "3-�� �����-�� �����"))
        val update = Post(id = 6, text = "��� �� ��������")
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun addPost() {
        val service = WallService()
        val postId = service.add(Post(id = 1, text = "�����-�� �����"))
        val postId1 = service.add(Post(id = 2, text = "�����-�� ����� ewrwer"))
        assertEquals(1, postId1.id)
    }
}