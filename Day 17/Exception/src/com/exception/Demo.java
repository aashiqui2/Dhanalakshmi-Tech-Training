package com.exception;

public class Demo {

	public void attendancePercantage(int percentage)
	{
		if(percentage>75)
		{
			System.out.println("permitted to write exam");
		}
		else {
			try{
				throw new LowAttendanceException();
			}
			catch(LowAttendanceException lw)
			{
				System.out.println("poor attendance");
			}
		}
	}
}
