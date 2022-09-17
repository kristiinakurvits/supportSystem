package com.projects.supportSystem.application;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.time.Instant;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = Instant.class)
public interface SupportTicketMapper {
    SupportTicket supportTicketRequestToSupportTicket(SupportTicketRequest request);

    SupportTicketResponse supportTicketToSupportTicketResponse(SupportTicket savedTicket);
}
