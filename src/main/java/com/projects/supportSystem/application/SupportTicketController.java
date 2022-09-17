package com.projects.supportSystem.application;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/support")
public class SupportTicketController {

    @Resource
    private SupportTicketService supportTicketService;

    @PostMapping("/new")
    @Operation(summary = "Add new support ticket")
    public SupportTicketResponse addTicket(@RequestBody SupportTicketRequest request) {
        return supportTicketService.addTicket(request);
    }

    @GetMapping("/active")
    @Operation(summary = "Find all active tickets")
    public List<SupportTicketInfo> findAllActiveTickets() {
        return supportTicketService.findAllActiveTickets();
    }

    @PatchMapping("/status")
    @Operation(summary = "Update support ticket status")
    public void updateTicketStatus(@RequestBody SupportTicketInfo request) {
        supportTicketService.updateTicketStatus(request);
    }
}
