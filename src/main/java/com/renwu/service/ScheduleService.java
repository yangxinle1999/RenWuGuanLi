package com.renwu.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

/**
 * second(秒), minute (分)，hour (时)，day of month (日)，month (月)，day of week (周几) .
 例如： 0 * * * * MON-FRI(表示周一到周五的整分钟时刻执行定时任务)
 **/
 @Scheduled(cron = "0 * * * * MON-FRI")
    public void hello(){
        System.out.println("hello...........");
    }
}
