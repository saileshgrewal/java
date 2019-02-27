package programs.learn.date.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss dd-mm-yyyy");
		System.out.println(sdf.format(dt));

	}

}
