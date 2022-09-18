package com.projects.supportSystem.application;

import com.projects.supportSystem.Validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
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
        supportTicket.setDateAdded(LocalDateTime.now());
        supportTicket.setIsSolved(false);
        SupportTicket savedTicket = supportTicketRepository.save(supportTicket);
        return supportTicketMapper.supportTicketToSupportTicketResponse(savedTicket);
    }

    public List<SupportTicketInfo> findAllActiveTickets() {
        List<SupportTicket> supportTickets = supportTicketRepository.findByStatus(false);
        return supportTicketMapper.supportTicketsToSupportTicketInfos(supportTickets);
    }

    public void markTicketSolved(Integer supportTicketId) {
        Optional<SupportTicket> optionalSupportTicket = supportTicketRepository.findById(supportTicketId);
        ValidationService.validateTicketExists(optionalSupportTicket);
        SupportTicket supportTicket = optionalSupportTicket.get();
        supportTicket.setIsSolved(true);
        supportTicketRepository.save(supportTicket);
    }
}



