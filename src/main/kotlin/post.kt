data class Post (
    var id: Int = 0,                        // идентификатор записи
    val owner_id: Int = 0,                  // идентификатор владельца стены, на которой размещена запись
    val from_id: Int = 0,                   // идентификатор автора записи (от чьего имени опубликована запись)
    val created_by: Int = 0,                // идентификатор администратора, который опубликовал запись
    val date: Int = 0,                      // время публикации записи
    val text: String = "",                  // текст записи
    val reply_owner_id: Int = 0,            // идентификатор владельца записи, в ответ на которую была оставлена текущая
    val reply_post_id: Int = 0,             // идентификатор записи, в ответ на которую была оставлена текущая
    val friends_only: Boolean = false,      // True если запись создана с опцией "Только для друзей"
    val comments: Comments = Comments(),    // информация о комментариях к записи
    val copyright: String = "",             // источник материала
    val likes: Likes = Likes(),             // информация о лайках к записи
    val reposts: Reposts = Reposts(),       // информация о репостах записи ("Рассказать друзьям)
    val views: Views = Views(),             // информация о просмотрах записи
    val post_type: String = "",             // тип записи, может принимать значения post, copy, reply, postpone, suggest
    val signer_id: Int = 0,                 // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val can_pin: Boolean = false,           // информация о том, может ли текущий пользователь закрепить запись
    val can_delete: Boolean = false,        // информация о том, может ли текущий пользователь удалить запись
    val can_edit: Boolean = false,          // информация о том, может ли текущий пользователь редактировать запись
    val is_pinned: Boolean = false,         // информация о том, что запись закреплена
    val marked_as_ads: Boolean = false,     // информация о том, содержит ли запись отметку "реклама"
    val is_favorite: Boolean = false,       // True если объект добавлен в закладки у текущего пользователя
    val postponed_id: Int = 0               // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
)

data class Comments (
    val count: Int = 0,                     // количество комментариев
    val can_post: Boolean = false,          // может ли текущий пользователь комментировать запись
    val groups_can: Boolean = false,        // могут ли сообщества комментировать запись
    val can_close: Boolean = false,         // может ли текущий пользователь закрыть комментарии к записи
    val can_open: Boolean = false           // может ли текущий пользователь открыть комментарии к записи
)

data class Likes (
    val count: Int = 0,                     // число пользователей, которым понравилась запись
    val user_likes: Boolean = false,        // наличие отметки "Мне нравится" от текущего пользователя
    val can_like: Boolean = false,          // информация о том, может ли текущий пользователь поставить отметку "Мне нравится"
    val can_publish: Boolean = false        // информация о том может ли текущий пользователь сделать репост записи
)

data class Reposts (
    val count: Int = 0,                     // число пользователей, скопировавших запись
    val user_reposted: Boolean = false      // наличие репоста от текущего пользователя
)

data class Views (
    val count: Int = 0                      // число просмотров записи
)