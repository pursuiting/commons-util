package com.github.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间工具类
 * created by xiongqi on 2016/08/12.
 */
public class DateUtils {
	
	public static final String P1 = "yyyyMMdd";
	public static final String P2 = "yyyy-MM-dd";
	public static final String P3 = "yyyyMMddHHmm";
	public static final String P4 = "yyyyMMdd HH:mm";
	public static final String P5 = "yyyy-MM-dd HH:mm";
	public static final String P6 = "yyyyMMdd HH:mm:ss";
	public static final String P7 = "yyyy-MM-dd HH:mm:ss";
	public static final String P8 = "yyyy-MM-dd HH:mm:ss:SS";
	
	public static final int MILLISECOND = 1;
	public static final int SECOND = MILLISECOND * 1000;
	public static final int MINUTE = SECOND * 60;
	public static final int HOUR = MINUTE * 60;
	public static final int DAY = HOUR * 24;
	
	/**
	 * 解析指定格式的日期字符串为java.util.Date对象
	 * @param source
	 * @param pattern
	 * @return
	 */
	public static final Date parse(String source, String pattern) {
		Date date = null;
		try {
			date = new SimpleDateFormat(pattern).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 格式化给定的日期为指定模式的日期时间字符串
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static final String format(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static final String format(String source, String srcPattern, String tarPattern) {
		return format(parse(source, srcPattern), tarPattern);
	}
	
	/**
	 * 计算两个指定日期之间相差的时间值
	 * @param d1
	 * @param d2
	 * @param timeunit 时间单位(毫秒，秒， 分钟， 小时，天)
	 * @return
	 */
	public static long getTimeInterval(Date d1, Date d2, int timeunit) {
		return (d2.getTime() - d1.getTime()) / timeunit;
	}
	
}
