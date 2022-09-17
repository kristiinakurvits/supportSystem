package com.projects.supportSystem.application;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SupportTicketResponse implements Serializable {
    private Integer id;
    private LocalDate dateAdded;
    private Boolean isSolved;
}
