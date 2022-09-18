package com.projects.supportSystem.application;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SupportTicketInfo implements Serializable {
    private final String requesterName;
    private final String requesterEMail;
    private final String title;
    private final String description;
    private final LocalDateTime dateAdded;
    private final LocalDateTime deadline;
}
