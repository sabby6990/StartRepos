package funstuff;

import java.util.HashSet;
import java.util.Set;

public class RareFeatures {
	public static void main(String[] args) {
		// double braces initialization
		Set coolSetInit = new HashSet<String>() {
			{
				add("Seomthing");
			}

		};
	}
}
