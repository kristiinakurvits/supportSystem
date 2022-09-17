package com.projects.supportSystem.Validation;

import com.projects.supportSystem.application.SupportTicket;

import java.util.Optional;

public class ValidationService {

    public static final String INCORRECT_DETAILS = "Sellist pöördumist ei leitud";

    public static void validateTicketExists(Optional<SupportTicket> supportTicket) {
        if (supportTicket.isEmpty()) {
            throw new BusinessException(INCORRECT_DETAILS, "Sellist pöördumist ei leitud. Proovi uuesti");
        }
    }
}
