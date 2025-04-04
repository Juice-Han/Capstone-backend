package com.example.capstoneback.Error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode { //에러 정보를 정리해놓는 enum 클래스


    USER_DOESNT_EXIST(400, "user doesnt exist"),
    FILE_EMPTY(400, "file should not be empty"),
    FAILED_TO_SAVE_FILE(500, "failed to save file"),
    EMAIL_DOESNT_EXIST(400, "email doesnt exist"),
    FILE_DOESNT_EXIST(400, "file doesnt exist"),
    FILE_ALREADY_EXIST(400, "file already exist"),
    EMAIL_SEND_FAILED(500, "failed to send email")
    ;

    private int status;
    private String message;
}
