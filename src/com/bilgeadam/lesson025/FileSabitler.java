package com.bilgeadam.lesson025;

import java.io.File;
import java.nio.file.Path;

public class FileSabitler {

	public static Path path = Path.of("file.txt");
	public static File file = new File(path.toString());

}
