package com.zikozee.quartz_email_scheduler.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleEmailResponse {
    private boolean success;
    private String jobId;
    private String jobGroup;
    private String message;

    public ScheduleEmailResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Getters and Setters (Omitted for brevity)
}