package com.piaoniu.backstage.service.impl;

import com.piaoniu.backstage.dao.Ht_CommentDao;
import com.piaoniu.backstage.pojo.Comment;
import com.piaoniu.backstage.pojo.CommentChild;
import com.piaoniu.backstage.service.HtCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HtCommentServiceImpl implements HtCommentService {
    @Resource
    private Ht_CommentDao ht_commentDao;
    @Override
    public List<Comment> findAllCommentInfo() {
        return ht_commentDao.findAllCommentInfo();
    }

    @Override
    public List<CommentChild> findAllChildCommentInfo() {
        return ht_commentDao.findAllChildCommentInfo();
    }

    @Override
    public int deleteComment(int comment_id) {
        return ht_commentDao.deleteComment(comment_id);
    }

    @Override
    public int deleteChirlComment(int comment_child_id) {
        return ht_commentDao.deleteChirlComment(comment_child_id);
    }
}
