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
@Table(name = "thumbnail_image")
@Entity
public class ThumbnailImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String thumbnailImageName;

    private String thumbnailImageSize;

    @OneToOne(fetch = FetchType.LAZY)
    private File file;

    @NoArgsConstructor
    @Getter
    public static class ThumbnailImageBuilderTwo {
        private Long id;
        private String thumbnailImageName;
        private String thumbnailImageSize;
        private File file;

        public ThumbnailImageBuilderTwo id(Long id) {
            this.id = id;
            return this;
        }

        public ThumbnailImageBuilderTwo thumbnailImageName(String thumbnailImageName) {
            this.thumbnailImageName = thumbnailImageName;
            return this;
        }

        public ThumbnailImageBuilderTwo thumbnailImageSize(String thumbnailImageSize) {
            this.thumbnailImageSize = thumbnailImageSize;
            return this;
        }

        public ThumbnailImageBuilderTwo file(File file) {
            this.file = file;
            return this;
        }

        public ThumbnailImage build() {
            return new ThumbnailImage(this);
        }
    }

    public ThumbnailImage(ThumbnailImageBuilderTwo thumbnailImageBuilderTwo) {
        this.id = thumbnailImageBuilderTwo.getId();
        this.thumbnailImageName = thumbnailImageBuilderTwo.getThumbnailImageName();
        this.thumbnailImageSize = thumbnailImageBuilderTwo.getThumbnailImageSize();
        this.file = thumbnailImageBuilderTwo.getFile();
        file.setThumbnailImage(this);
    }

}
