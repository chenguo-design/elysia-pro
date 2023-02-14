package com.cg.elysia.common.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     *
     * @param cur 当前日期
     * @param k 往前几天
     * @return 当前日期前k天对应的Date
     */
    public static Date getBeforeDay(Date cur, int k){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(cur);
        calendar.add(Calendar.DAY_OF_YEAR, -k);
        System.out.println("no");
        return calendar.getTime();
    }
}
