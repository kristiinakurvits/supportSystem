package com.projects.supportSystem.Validation;

import com.projects.supportSystem.application.SupportTicket;
import com.projects.supportSystem.infrastructure.exception.BusinessException;
import java.util.Optional;

public class ValidationService {

    public static final String INCORRECT_DETAILS = "Can't find support ticket";

    public static void validateTicketExists(Optional<SupportTicket> supportTicket) {
        if (supportTicket.isEmpty()) {
            throw new BusinessException(INCORRECT_DETAILS, "Can't find support ticket. Please check your support ticket Id");
        }
    }
}
