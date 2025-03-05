package com.usermanager.manager.dto;

import jakarta.validation.constraints.NotBlank;

public record UserResponseDTO(@NotBlank String name, @NotBlank String login, @NotBlank String password) {

}
