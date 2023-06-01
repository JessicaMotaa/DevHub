package com.devhub.exceptions.details;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandardDetails {
    private String timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
