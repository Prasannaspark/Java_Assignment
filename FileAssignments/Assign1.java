package FileAssignments;

import java.io.*;

public class Assign1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int flag = 0;
		String filename = "file3.txt";
		File directory = new File("D:\\FileAssignment");

		String[] directorylist = directory.list();

		for (int i = 0; i < directorylist.length; i++) {

			if (directorylist[i].equals(filename)) {
				flag = 1;

			} else {
				flag = 0;
			}

		}

		if (flag == 1) {
			System.out.println("exists in directory");
		} else {
			System.out.println("not exists in directory");
		}

	}

}
