package com.hao.blogservice.service;

import com.hao.base.dto.RespDTO;
import com.hao.base.exception.CommonException;
import com.hao.base.exception.ErrorCode;
import com.hao.blogservice.client.UserServiceClient;
import com.hao.blogservice.dao.BlogDao;
import com.hao.blogservice.dto.BlogDetailDTO;
import com.hao.blogservice.entity.Blog;
import com.hao.blogservice.entity.User;
import com.hao.blogservice.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogService {

    @Autowired
    BlogDao blogDao;

    @Autowired
    UserServiceClient userServiceClient;

    public Blog postBlog(Blog blog) {
        return blogDao.save(blog);
    }

    public List<Blog> findBlogs(String username) {
        return blogDao.findByUsername(username);
    }


    public BlogDetailDTO findBlogDetail(Long id) {
        Blog blog = blogDao.findById(id).get();
        if (null == blog) {
            throw new CommonException(ErrorCode.BLOG_IS_NOT_EXIST);
        }
        RespDTO<User> respDTO = userServiceClient.getUser(UserUtils.getCurrentToken(), blog.getUsername());
        if (respDTO==null) {
            throw new CommonException(ErrorCode.RPC_ERROR);
        }
        BlogDetailDTO blogDetailDTO = new BlogDetailDTO();
        blogDetailDTO.setBlog(blog);
        blogDetailDTO.setUser(respDTO.data);
        return blogDetailDTO;
    }

}
