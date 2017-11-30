package com.example.nobeansofauditeventrepositorytypefound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
    @Autowired
    private AuditEventRepository auditEventRepository;

    @RequestMapping("/public")
    public String publicResource()
    {
        return "{\"public\": true}";
    }
}
