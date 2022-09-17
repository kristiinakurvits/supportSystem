package com.projects.supportSystem.application;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class SupportTicketService {

    @Resource
    private SupportTicketMapper supportTicketMapper;

    @Resource
    private SupportTicketRepository supportTicketRepository;

    public SupportTicketResponse addTicket(SupportTicketRequest request) {
        SupportTicket supportTicket = supportTicketMapper.supportTicketRequestToSupportTicket(request);
        supportTicket.setDateAdded(LocalDate.now());
        supportTicket.setIsSolved(false);
        SupportTicket savedTicket = supportTicketRepository.save(supportTicket);
        return supportTicketMapper.supportTicketToSupportTicketResponse(savedTicket);
    }

    public SupportTicketRequest findTicketDetails(Integer supportTicketId) {
    }

    public List<SupportTicketInfo> findActiveTickets(Integer supportTicketId) {
    }

    public void updateTicketStatus(SupportTicketInfo request) {
    }
}
}
