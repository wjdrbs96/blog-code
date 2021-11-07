package com.paging.repository;

import com.paging.entity.Post;
import com.paging.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by Gyunny 2021/11/07
 */
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findByUserOrderByIdDesc(User user, Pageable pageable);

}
