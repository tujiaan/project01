package cn.tja.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

public class MyDataConverter implements Converter {

	@Override
	public <T> T convert(Class<T> arg0, Object str) {
		DateFormat df= new SimpleDateFormat("yyyy-mm-dd");
		Date date=null;
		try {
			date = df.parse((String) str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) date;
		 
	}

}
