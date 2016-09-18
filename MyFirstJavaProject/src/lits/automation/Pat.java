package lits.automation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pat {

	public static void main(String[] args) {
		String regexp = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
		String url = "http://habrahabr.ru/post/260767/";

		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(url);

	}

}
