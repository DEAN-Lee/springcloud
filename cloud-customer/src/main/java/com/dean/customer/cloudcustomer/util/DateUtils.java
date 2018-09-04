package com.dean.customer.cloudcustomer.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtils  {

    /**
     * 获得当天零时零分零秒
     * @return
     */
    public static Date getTodayStartDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获得当天9点的时间
     * @return
     */
    public static Date getTodayNineDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 9);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获取当前月第一天开始时间
     * @return
     */
    public static Date getMonthStartDate() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 获取当天几天前/几天后开始的日期
     * @return
     */
    public static Date getTodayBeforeOrAfterStartDate(int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(getTodayStartDate());
        c.add(Calendar.DAY_OF_MONTH, days);
        return c.getTime();
    }

    /**
     * 获取当前年份
     */
    public static String getCurrentYear(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 获取当前月份
     */
    public static String getCurrentMonth(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 获取某年某月有多少天
     * @param year
     * @param month
     * @return
     */
    public static int getDaysOfMonth(int year, int month){
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 时间戳转日期
     * @param timestamp
     * @return
     */
    public static Date timestamp2Date(long timestamp) {
        return timestamp > 0L ? new Date(timestamp) : null;
    }


    public static void main(String[] args) {
        Map tesMap = new HashMap<>();
        tesMap.put("1", "1");
        System.out.println("args = [" + tesMap.get("1") + "]");

    }
}
