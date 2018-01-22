package tracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tracker.model.Comment;
import tracker.repository.CommentRepository;
import tracker.service.CommentService;

import java.util.List;

/**
 * Created by igor
 */
@Service
public class CommentServicrImpl implements CommentService {

    @Autowired
    protected CommentRepository commentRepository;

    @Transactional
    @Override
    public List<Comment> commentList() {
        return commentRepository.findAll();
    }

    @Transactional
    @Override
    public Comment commentGet(Integer id) {
        return commentRepository.findOne(id);
    }

    @Transactional
    @Override
    public void commentCreate(Comment comment) {
        commentRepository.save(comment);
    }

    @Transactional
    @Override
    public void commentUpdate(Comment comment) {
        commentRepository.save(comment);
    }

    @Transactional
    @Override
    public void commentDelete(Integer id) {
        commentRepository.delete(id);
    }
}
