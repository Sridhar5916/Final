package com.OrangeHRM.ExcelUtilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValues 
{
	public static String randomAlphabets()
	{
		String alphabets = RandomStringUtils.randomAlphabetic(5);
		return alphabets;
	}
	public static String randomUsn()
	{
		String alphabets = RandomStringUtils.randomAlphabetic(5);
		return alphabets;
	}
	public static String Password()
	{
		String psw = RandomStringUtils.randomAlphanumeric(5);
		String password = psw+"@"+psw;
		return password;
	}

}
