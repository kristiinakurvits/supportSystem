package com.projects.supportSystem.application;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SupportTicketRequest implements Serializable {
    private String requesterName;
    private String requesterEMail;
    private String title;
    private String description;
    private LocalDate deadline;
}
