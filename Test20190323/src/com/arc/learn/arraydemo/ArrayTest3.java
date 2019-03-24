package com.arc.learn.arraydemo;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] weeks = new String[] {"","星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
//										0    1        2			3 		4			5		6		7
		int x = 8;
		String str = getWeek(weeks, x);
		System.out.println(str);
	}
	
	/**
	 * 明确参数列表 
	 *  String[] weeks
	 * 	int x
	 * 明确返回值类型
	 * 	String 
	 */
	public static String getWeek(String[] weeks, int x) {
		if(weeks != null && x>=0 && x<weeks.length) {
			return weeks[x];
		}
		return "没有找到星期";
		
//		if(weeks == null || (x>7 || x<0)) {
//			return "没有找到星期";
//		}
//		return weeks[x];
	}
	
	
	
	

}
