package com.projects.supportSystem.application;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "support_ticket")
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "requester_name", nullable = false)
    private String requesterName;

    @Column(name = "requester_e_mail", nullable = false)
    private String requesterEMail;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false, length = 510)
    private String description;

    @Column(name = "date_added", nullable = false)
    private LocalDate dateAdded;

    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "is_solved", nullable = false)
    private Boolean isSolved = false;


}