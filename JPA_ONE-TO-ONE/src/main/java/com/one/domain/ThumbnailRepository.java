package com.one.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by Gyunny 2022/02/19
 */
public interface ThumbnailRepository extends JpaRepository<ThumbnailImage, Long> {
}
