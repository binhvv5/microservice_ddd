package com.food.ordering.system.customer.service.domain.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public record CreateCustomerCommand(@NotNull UUID customerId, @NotNull String username,
                                    @NotNull String firstName, @NotNull String lastName) {
}
