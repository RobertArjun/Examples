package com.robert.alpha;

public class Sample {

	public static void main(String[] args) {
		/*
		 * String from = "AGH"; String to = "FSK"; String search = "ARJUN"; char
		 * defaultFrom = 'A'; char defaultTo = 'Z';
		 */

		String from = "G";
		String to = "H";
		String search = "GARUN";
		char defaultFrom = 'A';
		char defaultTo = 'Z';

		if (to.length() <= 3 & from.length() < to.length()) {
			StringBuilder sb = new StringBuilder(from);
			for (int z = from.length(); z < to.length(); z++) {
				sb.append(String.valueOf(defaultFrom));
				from = new String(sb);
			}
		} else if (from.length() <= 3 & to.length() < from.length()) {
			StringBuilder sb = new StringBuilder(to);
			for (int z = to.length(); z < from.length(); z++) {
				sb.append(String.valueOf(defaultTo));
				to = new String(sb);
			}
		}

		char[] froms = from.toCharArray();
		char[] tos = to.toCharArray();
		char[] searchs = search.toCharArray();

		boolean isAlpha = false;

		for (char i = froms[0]; i <= tos[0]; i++) {
			if (i == searchs[0]) {
				if (froms.length == 1 && tos.length == 1)
					isAlpha = true;
				else {
					for (char j = froms[1]; j <= tos[1]; j++) {
						if (j == searchs[1]) {
							if (froms.length == 2 && tos.length == 2)
								isAlpha = true;
							else {
								for (char k = froms[2]; k <= tos[2]; k++) {
									if (k == searchs[2])
										isAlpha = true;
								}
							}
						}
					}
				}
			}
		}

		System.out.println("===================================");
		System.out.println("isAlpha " + isAlpha);
		System.out.println("===================================");

	}

}
