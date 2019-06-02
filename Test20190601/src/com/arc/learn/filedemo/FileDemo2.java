package com.arc.learn.filedemo;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		/**
		 * 深度遍历 遍历指定目录中所文件和文件夹，包含其子文件和文件夹
		 */
		File pdir = new File("c:\\demo");
//		createDeepDirectory(pdir, "deep-dir", 3);

		listAll(pdir, 0);
	}

	public static void createDeepDirectory(File pdir, String name, int level) {
		if (level == 0) {
			return;
		}
		level--;
		for (int i = 0; i < 3; i++) {
			String filename = name + "_" + i;
			File dir = new File(pdir, filename);
			System.out.println(dir.mkdir());
			createDeepDirectory(dir, filename, level);
		}
	}

	public static void listAll(File pdir, int level) {
		System.out.println(getSpace(level) + pdir.getName());
		level++;
		File[] dirs = pdir.listFiles();
		for (File dir : dirs) {
			if (dir.isDirectory()) {
				listAll(dir, level);
			} else {
				System.out.println(getSpace(level) + dir.getName());
			}
		}
	}

	private static String getSpace(int level) {
		StringBuilder sb = new StringBuilder();
		sb.append("|--");
		for (int i = 0; i < level; i++) {
			sb.insert(0, "|  ");
		}
		return sb.toString();
	}

}
