package com.twitchclone.api.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignInRequest {

    @Size(min = 1, max = 50, message = "Имя пользователя должно содержать от 1 до 50 символов")
    @NotBlank(message = "Имя пользователя не может быть пустыми")
    private String username;

    @Size(min = 1, max = 255, message = "Длина пароля должна быть от 1 до 255 символов")
    @NotBlank(message = "Пароль не может быть пустыми")
    private String password;
}