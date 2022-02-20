package com.one.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * created by Gyunny 2022/02/13
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "file")
@Entity
public class File {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;

    private String fileSize;

    @OneToOne(mappedBy = "file", fetch = FetchType.LAZY)
    private ThumbnailImage thumbnailImage;

    public void update(String filename, String fileSize) {
        this.filename = filename;
        this.fileSize = fileSize;
    }

    public void updateThumbnail(Long thumbnailId) {

    }

    public void setThumbnailImage(ThumbnailImage thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

}
