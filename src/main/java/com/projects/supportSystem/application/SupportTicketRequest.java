package com.projects.supportSystem.application;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SupportTicketRequest implements Serializable {
    private String requesterName;
    @NotNull
    private String requesterEMail;
    @NotNull
    private String title;
    private String description;
    @NotNull
    private LocalDate deadline;
}
