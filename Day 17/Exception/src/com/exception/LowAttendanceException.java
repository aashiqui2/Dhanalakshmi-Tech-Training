package com.exception;

public class LowAttendanceException extends RuntimeException {

	public static void main(String[] args) {
		Demo la=new Demo();
		la.attendancePercantage(74);
	}

}
