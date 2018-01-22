package tracker.service;

import tracker.model.Comment;

import java.util.List;

/**
 * Created by igor
 */
public interface CommentService {

    List<Comment> commentList();

    Comment commentGet(Integer id);

    void commentCreate(Comment comment);

    void commentUpdate(Comment comment);

    void commentDelete(Integer id);
}
