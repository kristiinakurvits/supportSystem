package com.projects.supportSystem.application;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SupportTicketInfo implements Serializable {
    private final String requesterName;
    private final String requesterEMail;
    private final String title;
    private final String description;
    private final LocalDate dateAdded;
    private final LocalDate deadline;
}
