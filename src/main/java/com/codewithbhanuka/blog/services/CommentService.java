package com.codewithbhanuka.blog.services;

import com.codewithbhanuka.blog.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
