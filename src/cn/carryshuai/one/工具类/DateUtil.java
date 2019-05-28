package cn.carryshuai.one.工具类;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateUtil {


	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

	public static List<String> queryData(Date startAt, Date endAt) {
		List<String> dates = new ArrayList<>();
		Calendar start = Calendar.getInstance();
		start.setTime(startAt);
		Calendar end = Calendar.getInstance();
		end.setTime(endAt);
		while (start.before(end) || start.equals(end)) {
			dates.add(dateFormat.format(start.getTime()));
			start.add(Calendar.DAY_OF_YEAR, 1);
		}
		return dates;
	}

	/**
	 * 解析两个日期段之间的所有日期
	 * 
	 * @param beginDateStr
	 *            开始日期 ，至少精确到yyyy-MM-dd
	 * @param endDateStr
	 *            结束日期 ，至少精确到yyyy-MM-dd
	 * @return MM-dd日期集合
	 */
	public static List<String> getDayListOfDate(String beginDateStr, String endDateStr) {
		// 指定要解析的时间格式
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		// 定义一些变量
		Date beginDate = null;
		Date endDate = null;
		Calendar beginGC = null;
		Calendar endGC = null;
		List<String> list = new ArrayList<String>();
		try {
			// 将字符串parse成日期
			beginDate = f.parse(beginDateStr);
			endDate = f.parse(endDateStr);
			// 设置日历
			beginGC = Calendar.getInstance();
			beginGC.setTime(beginDate);
			endGC = Calendar.getInstance();
			endGC.setTime(endDate);
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
			// 直到两个时间相同
			while (beginGC.getTime().compareTo(endGC.getTime()) <= 0) {
				list.add(sdf.format(beginGC.getTime()));
				// 以日为单位，增加时间
				beginGC.add(Calendar.DAY_OF_MONTH, 1);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取当前时间的近24小时小时列表
	 * 
	 * @param beginDateStr
	 *            开始日期 ，至少精确到yyyy-MM-dd
	 * @param endDateStr
	 *            结束日期 ，至少精确到yyyy-MM-dd
	 * @return List<String> 小时集合
	 **/
	public static List<String> getLast24Hours() {
		List<String> list = new ArrayList<String>();

		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int endHour = cal.get(Calendar.HOUR_OF_DAY); // 小时
		int startHour = 24 - Math.abs(endHour - 24) + 1;
		for (int i = 0; i < 24; i++) {
			if (startHour < 10) {
				list.add("0" + startHour + "");
			} else {
				list.add(startHour + "");
			}
			startHour += 1;
			if (startHour >= 24) {
				startHour = 0;
			}
		}
		return list;
	}

	/**
	 * 获取当前周 最近8周 周数列表
	 * 
	 * @param beginDateStr
	 *            开始日期 ，至少精确到yyyy-MM-dd
	 * @param endDateStr
	 *            结束日期 ，至少精确到yyyy-MM-dd
	 * @return MM-dd日期集合
	 **/
	public static List<Integer> getLast8Weeks() {
		Date date = new Date(); // 当前时间
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// int endWeeks = cal.get(Calendar.WEEK_OF_YEAR); //当前周数
		cal.add(Calendar.DATE, (-7 * (8-1)));

		int moveweeks =  cal.get(Calendar.WEEK_OF_YEAR); // 开始的周数
		List<Integer> weeks = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			weeks.add(moveweeks);
			cal.add(Calendar.DATE, 7);
			moveweeks = cal.get(Calendar.WEEK_OF_YEAR);
		}
		return weeks;
	}

	/**
	 * 时间戳转换成日期格式字符串
	 * 
	 * @param seconds
	 *            精确到秒的字符串
	 * @param formatStr
	 * @return
	 */
	public static String timeStamp2Date(String ms) {
		Long mx = Long.parseLong(ms);
		Date dat = new Date(mx);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dat);
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String sb = format.format(gc.getTime());
		return sb;

	}

}
