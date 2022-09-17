package com.projects.supportSystem.application;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public List<SupportTicketInfo> findAllActiveTickets() {
        List<SupportTicket> supportTickets = supportTicketRepository.findByStatus(false);
        return supportTicketMapper.supportTicketsToSupportTicketInfos(supportTickets);
    }


    public void updateTicketStatus(Integer supportTicketId) {
        Optional<SupportTicket> supportTicket = supportTicketRepository.findById(supportTicketId);
//        SupportTicket supportTicket =
//        supportTicket.setIsSolved(true);
        supportTicketRepository.save(supportTicket);
    }


}

