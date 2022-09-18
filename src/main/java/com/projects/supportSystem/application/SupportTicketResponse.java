package com.projects.supportSystem.application;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SupportTicketResponse implements Serializable {
    private Integer id;
    private LocalDateTime dateAdded;
    private Boolean isSolved;
}
