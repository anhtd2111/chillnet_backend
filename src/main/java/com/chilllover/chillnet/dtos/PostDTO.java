package com.chilllover.chillnet.dtos;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostDTO {
    Long postId;

    @Size(max = 1000, message = "Content must not exceed 1000 characters")
    String content;

    List<String> media;
}
