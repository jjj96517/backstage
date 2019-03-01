package com.piaoniu.backstage.dao;


import com.piaoniu.backstage.pojo.Comment;
import com.piaoniu.backstage.pojo.CommentChild;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Ht_CommentDao {
    /**
     * 查看所有评论信息（主要评论）
     * @return
     */
    @Select("select s.show_name,u.user_username,c.* from pn_comment c,pn_show s,pn_user u where c.show_id=s.show_id and c.user_id=u.user_id")
    List<Comment> findAllCommentInfo();

    /**
     * 查看所有评论信息（评论回复）
     * @return
     */
    @Select("select comment.comment_message,user.user_username from pn_comment pcomment,pn_comment_child comment,pn_user user where comment.comment_parent_id=pcomment.comment_id and comment.user_id=user.user_id")
    List<CommentChild> findAllChildCommentInfo();

    /**
     * 通过评论ID删除评论（主要评论）
     * @param comment_id
     * @return
     */
    @Delete("delete from pn_comment where comment_id=#{comment_id}")
    int deleteComment(int comment_id);

    /**
     * 通过评论ID删除评论（评论回复）
     * @param comment_child_id
     * @return
     */
    @Delete("delete from pn_comment_child where comment_child_id=#{comment_child_id}")
    int deleteChirlComment(int comment_child_id);
}
