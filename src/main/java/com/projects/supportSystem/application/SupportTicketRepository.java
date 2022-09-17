package com.projects.supportSystem.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SupportTicketRepository extends JpaRepository<SupportTicket, Integer> {
    @Query("select s from SupportTicket s where s.isSolved = ?1 order by s.deadline")
    List<SupportTicket> findByStatus(Boolean isSolved);


}