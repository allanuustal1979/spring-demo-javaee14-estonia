package com.sda.javaee14.springdemojavaee14.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data

public class GenericError {
    private LocalDateTime timestamp;
    private int responseCode;
    private String errorMessage;
    private String path;
}
