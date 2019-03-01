package com.piaoniu.backstage.service;


import com.piaoniu.backstage.pojo.Comment;
import com.piaoniu.backstage.pojo.CommentChild;

import java.util.List;

public interface HtCommentService {
    List<Comment> findAllCommentInfo();
    List<CommentChild> findAllChildCommentInfo();
    int deleteComment(int comment_id);
    int deleteChirlComment(int comment_child_id);
}
