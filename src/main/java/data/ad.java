package data;

import java.io.IOException;

import util.dataExtractor;

public class ad {
	public static void main(String[] args) {
		
		dataExtractor da =  new dataExtractor();
		try {
			System.out.println(da.getData("TC_003", "Name"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
