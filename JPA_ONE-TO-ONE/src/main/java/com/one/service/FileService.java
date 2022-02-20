package com.one.service;

import com.one.domain.EntityNotFoundException;
import com.one.domain.File;
import com.one.domain.FileRepository;
import com.one.domain.ThumbnailImage;
import com.one.domain.ThumbnailRepository;
import com.one.dto.FileResponseDto;
import com.one.dto.ThumbnailImageRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by Gyunny 2022/02/13
 */
@RequiredArgsConstructor
@Service
public class FileService {

    private final FileRepository fileRepository;
    private final ThumbnailRepository thumbnailRepository;

    @PostConstruct
    public void init() {
        for (int i = 0; i < 5; ++i) {
            File build = File.builder()
                    .filename("파일" + i)
                    .fileSize(String.valueOf(1000 + i))
                    .build();
            File file = fileRepository.save(build);

            ThumbnailImage build1 = new ThumbnailImage.ThumbnailImageBuilderTwo()
                    .thumbnailImageName("썸네일" + i)
                    .thumbnailImageSize(String.valueOf(1000 + i))
                    .file(file)
                    .build();
            thumbnailRepository.save(build1);
        }
    }

    public List<FileResponseDto> getFiles() {
        return fileRepository.findAll().stream()
                .map(FileResponseDto::from)
                .collect(Collectors.toList());
    }

//    @Transactional
//    public void update() {
//        var file = fileRepository.findById(1L).orElseThrow(IllegalArgumentException::new);
//        for (int i = 0; i < 100; ++i) {
//            file.update("changeName" + i, String.valueOf(2000 + i));
//        }
//    }
//
//    @Transactional
//    public void saveThumbnail(final Long fileId, final ThumbnailImageRequestDto thumbnailImageRequestDto) {
//        var file = fileRepository.findById(fileId).orElseThrow(EntityNotFoundException::new);
//        var thumbnailImage = thumbnailRepository.save(thumbnailImageRequestDto.toEntity());
//        file.updateThumbnail(thumbnailImage.getId());
//    }

}
