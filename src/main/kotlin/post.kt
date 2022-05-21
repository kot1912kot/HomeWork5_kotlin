data class Post (
    var id: Int = 0,                        // ������������� ������
    val owner_id: Int = 0,                  // ������������� ��������� �����, �� ������� ��������� ������
    val from_id: Int = 0,                   // ������������� ������ ������ (�� ����� ����� ������������ ������)
    val created_by: Int = 0,                // ������������� ��������������, ������� ����������� ������
    val date: Int = 0,                      // ����� ���������� ������
    val text: String = "",                  // ����� ������
    val reply_owner_id: Int = 0,            // ������������� ��������� ������, � ����� �� ������� ���� ��������� �������
    val reply_post_id: Int = 0,             // ������������� ������, � ����� �� ������� ���� ��������� �������
    val friends_only: Boolean = false,      // True ���� ������ ������� � ������ "������ ��� ������"
    val comments: Comments = Comments(),    // ���������� � ������������ � ������
    val copyright: String = "",             // �������� ���������
    val likes: Likes = Likes(),             // ���������� � ������ � ������
    val reposts: Reposts = Reposts(),       // ���������� � �������� ������ ("���������� �������)
    val views: Views = Views(),             // ���������� � ���������� ������
    val post_type: String = "",             // ��� ������, ����� ��������� �������� post, copy, reply, postpone, suggest
    val signer_id: Int = 0,                 // ������������� ������, ���� ������ ���� ������������ �� ����� ���������� � ��������� �������������
    val can_pin: Boolean = false,           // ���������� � ���, ����� �� ������� ������������ ��������� ������
    val can_delete: Boolean = false,        // ���������� � ���, ����� �� ������� ������������ ������� ������
    val can_edit: Boolean = false,          // ���������� � ���, ����� �� ������� ������������ ������������� ������
    val is_pinned: Boolean = false,         // ���������� � ���, ��� ������ ����������
    val marked_as_ads: Boolean = false,     // ���������� � ���, �������� �� ������ ������� "�������"
    val is_favorite: Boolean = false,       // True ���� ������ �������� � �������� � �������� ������������
    val postponed_id: Int = 0               // ������������� ���������� ������. ��� ���� ������������ �����, ����� ������ ������ �� �������
)

data class Comments (
    val count: Int = 0,                     // ���������� ������������
    val can_post: Boolean = false,          // ����� �� ������� ������������ �������������� ������
    val groups_can: Boolean = false,        // ����� �� ���������� �������������� ������
    val can_close: Boolean = false,         // ����� �� ������� ������������ ������� ����������� � ������
    val can_open: Boolean = false           // ����� �� ������� ������������ ������� ����������� � ������
)

data class Likes (
    val count: Int = 0,                     // ����� �������������, ������� ����������� ������
    val user_likes: Boolean = false,        // ������� ������� "��� ��������" �� �������� ������������
    val can_like: Boolean = false,          // ���������� � ���, ����� �� ������� ������������ ��������� ������� "��� ��������"
    val can_publish: Boolean = false        // ���������� � ��� ����� �� ������� ������������ ������� ������ ������
)

data class Reposts (
    val count: Int = 0,                     // ����� �������������, ������������� ������
    val user_reposted: Boolean = false      // ������� ������� �� �������� ������������
)

data class Views (
    val count: Int = 0                      // ����� ���������� ������
)