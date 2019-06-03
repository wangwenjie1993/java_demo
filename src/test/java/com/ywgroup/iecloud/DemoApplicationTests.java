package com.ywgroup.iecloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.TriggerUtils;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    public static List<String> getRecentExecTime(String cronExpression, Integer numTimes) {
        List<String> list = new ArrayList<>();
        try {
            CronTriggerImpl cronTrigger = new CronTriggerImpl();
            cronTrigger.setCronExpression(cronExpression);
            // 这里写要准备猜测的cron表达式
            Calendar calendar = Calendar.getInstance();
            Date now = calendar.getTime();
            // 把统计的区间段设置为从现在到2年后的今天（主要是为了方法通用考虑，如那些1个月跑一次的任务，如果时间段设置的较短就不足20条)
            calendar.add(Calendar.YEAR, 2);
            // 这个是重点，一行代码搞定
            List<Date> dates = TriggerUtils.computeFireTimesBetween(cronTrigger, null, now, calendar.getTime());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (int i = 0; i < dates.size(); i++) {
                // 这个是提示的日期个数
                if (i < numTimes) {
                    list.add(dateFormat.format(dates.get(i)));
                } else {
                    break;
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getNextExecTime(String cronExpression, Integer numTimes) {
        List<String> list = new ArrayList<>();
        CronTriggerImpl cronTriggerImpl = new CronTriggerImpl();
        try {
            cronTriggerImpl.setCronExpression(cronExpression);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 这个是重点，一行代码搞定
        List<Date> dates = TriggerUtils.computeFireTimes(cronTriggerImpl, null, numTimes);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date date : dates) {
            list.add(dateFormat.format(date));
        }
        return list;
    }


}
