package by.gsu.pms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertToBYN {
	public static String convertToByn(int commodityPrice, int divider, int scale) {
		BigDecimal bd = new BigDecimal(commodityPrice);
		BigDecimal result = bd.divide(new BigDecimal(divider));
		result = result.setScale(scale, RoundingMode.CEILING);
		return result.toString();
	}

}