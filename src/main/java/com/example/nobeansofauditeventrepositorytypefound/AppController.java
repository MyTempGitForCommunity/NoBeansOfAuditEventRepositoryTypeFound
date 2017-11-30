package com.example.nobeansofauditeventrepositorytypefound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
    private final AuditEventRepository auditEventRepository;

    @Autowired
    public AppController(AuditEventRepository auditEventRepository)
    {
        this.auditEventRepository = auditEventRepository;
    }

    @RequestMapping("/public")
    public String publicResource()
    {
        return "{\"public\": true}";
    }
}
