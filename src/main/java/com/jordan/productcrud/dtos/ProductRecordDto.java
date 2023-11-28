package com.jordan.productcrud.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record ProductRecordDto(@NotBlank String name, @NotBlank String description, @NotNull BigDecimal value, @NotBlank String ownerName, @NotBlank String ownerMail, @NotNull Date date) {


}
