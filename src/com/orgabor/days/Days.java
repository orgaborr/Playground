package com.orgabor.days;

public enum Days {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int dayOrder;
	
	private Days(int dayOrder) {
		this.dayOrder = dayOrder;
	}
	
	public int getDayOrder() {
		return dayOrder;
	}
	
	
}
