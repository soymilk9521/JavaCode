package com.arc.learn.filedemo;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class FileDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * File类：
		 * 	将文件或者文件夹封装成对象
		 *  方便对文件或者文件夹的属性进行操作
		 *  File对象可以作为构造函数传递给流的构造函数
		 *  
		 *  1. 构造函数
		 *  	
		 *  2. 常见方法
		 *  	2.1. 创建
		 *  	createNewFile();
		 *  	mkdir();
		 *  	mkdirs();
		 *      2.2. 判断
		 *      canExecute();
		 *      canRead();
		 *      canWrite();
		 *      exists();
		 *      isAbsolute();
		 *      isDirectory();
		 *      isFile();
		 *      isHidden();
		 *      2.3. 获取
		 *      getAbsolutePath()；
		 *      getName()；
		 *      getParent()；
		 *      getFreeSpace()；
		 *      getPath()；
		 *      getTotalSpace()；
		 *      getUsableSpace()；
		 *      lastModified();
		 *      length();
		 *      list();
		 *      listFiles();
		 *      listRoots();
		 *      2.4. 设置
		 *      renameTo(File dest) 
		 *      setExecutable(boolean executable) 
		 *      setReadable(boolean readable)
		 *      setWritable(boolean writable) 
		 *      setReadOnly()  
		 *      setLastModified(long time) 
		 *      toString() 
		 *      2.5. 比较
		 *      compareTo(File pathname) 
		 *      2.6. 删除
		 *      delete();
		 *      
		 */
//		testField();
//		testConstructor();
//		testCreate();
//		testJudgement();
//		testGetInfo();
//		testList();
//		testListWithFilter();
//		testListFiles();
//		testListFilesWithFilter();
//		testListRoots();
//		testDelete();
//		testRename();
//		testToString();
//		testCompareTo();

		File dir = new File("C:\\demo\\deep-dir_0");
		testDeepDelete(dir);
	}

	private static void testField() {
		// 与系统相关的默认名称 - 分隔符字符
		System.out.println(File.separator);
		// 与系统相关的路径分隔符字符
		System.out.println(File.pathSeparator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparatorChar);
	}
	private static void testConstructor() throws IOException {
		// 创建一个文件
		File f1 = new File("c:\\demo\\file.txt");
		// 在指定目录下创建一个文件
		File f2 = new File("c:\\demo", "file2.txt");
		// 在直接文件夹下创建一个文件
		File pf = new File("c:\\demo");
		File f3 = new File(pf, "file3.txt");
	}
	
	private static void testCreate() throws IOException {
		File f1  = new File("c:\\demo\\create-file.txt");
		// 创建一个新文件
		boolean bf1 = f1.createNewFile();
		// 在默认路径下创建一个临时文件，可以指定前缀和后缀
		File f2 = File.createTempFile("date", "log");
		System.out.println(f2.getAbsolutePath());
		File dir = new File("c:\\demo");
		// 在指定目录下创建一个临时文件， 可以指定文件的前缀和后缀
		File f3 = File.createTempFile("date", "log", dir);
		System.out.println(f3.getAbsolutePath());
		
		System.out.println(bf1);
		File dir2 = new File("c:\\demo\\create-dir");
		// 创建一个文件夹
		boolean bd = dir2.mkdir();
		System.out.println(bd);
		File dir3 = new File("c:\\demo\\a\\b\\c");
		// 创建一个多级目录
		boolean bd2 = dir3.mkdirs();
		System.out.println(bd2);
	}
	
	private static void testJudgement() throws IOException {
		File f1  = new File("create-file.txt");
		f1.createNewFile();
		// 测试此抽象路径名表示的文件或目录是否存在。 
		System.out.println(f1.exists());
		// 测试此抽象路径名表示的文件是否为普通文件。 
		System.out.println(f1.isFile());
		// 测试此抽象路径名表示的文件是否为目录。 
		System.out.println(f1.isDirectory());
		// 测试此抽象路径名命名的文件是否为隐藏文件。 
		System.out.println(f1.isHidden());
		// 测试应用程序是否可以读取由此抽象路径名表示的文件。 
		System.out.println(f1.canRead());
		// 测试应用程序是否可以修改由此抽象路径名表示的文件。 
		System.out.println(f1.canWrite());
		// 测试应用程序是否可以执行此抽象路径名表示的文件。 
		System.out.println(f1.canExecute());
		// 测试这个抽象路径名是否是绝对的。
		System.out.println(f1.isAbsolute());
	}
	
	private static void testGetInfo() {
		File f1  = new File("create-file.txt");
		// 返回由此抽象路径名表示的文件或目录的名称。 
		System.out.println(f1.getName());
		// 返回此抽象路径名的父 null的路径名字符串，如果此路径名未命名为父目录，则返回null。 
		System.out.println(f1.getParent());
		// 将此抽象路径名转换为路径名字符串。 
		System.out.println(f1.getPath());
		// 返回此抽象路径名的绝对路径名字符串
		System.out.println(f1.getAbsolutePath());
		// 返回分区未分配的字节数 named此抽象路径名。
		System.out.println(f1.getFreeSpace());
		// 通过此抽象路径名返回分区 named的大小。 
		System.out.println(f1.getTotalSpace());
		// 返回上的分区提供给该虚拟机的字节数 named此抽象路径名。 
		System.out.println(f1.getUsableSpace());
		// 返回此抽象路径名表示的文件上次修改的时间。 
		System.out.println(f1.lastModified());
		// 返回由此抽象路径名表示的文件的长度。 
		System.out.println(f1.length());
		
		Date d = new Date(f1.lastModified());
		System.out.println(d);
	}
	
	public static void testList() {
		File dir = new File("c:\\demo");
		String[] names = dir.list(); 
		System.out.println(Arrays.asList(names));
	}
	
	public static void testListWithFilter() {
		File dir = new File("c:\\demo");
		String[] names = dir.list(new MyFilenameFilter("mp3"));
		System.out.println(Arrays.asList(names));
	}
	
	public static void testListFiles() {
		File dir = new File("c:\\demo");
		// 列出指定目录下所有文件
		File[] files = dir.listFiles();
		for(File file :files) {
			System.out.println(file.getName());
		}
	}
	
	public static void testListFilesWithFilter() {
		File dir = new File("c:\\demo");
		// 列出指定目录下所有文件
		File[] files = dir.listFiles(new MyFilenameFilter("mp3"));
		for(File file :files) {
			System.out.println(file.getName());
		}
	}
	
	public static void testListRoots() {
		// 列出可用的文件系统根。
		File[] files = File.listRoots();
		for(File f: files) {
			System.out.println(f.getAbsolutePath());
		}
	}


	private static void testDelete() {
		File f1 = new File("c:\\demo\\a");
		// 删除由此抽象路径名表示的文件或目录
		System.out.println(f1.delete());
	}
	
	private static void testRename() {
		File f1 = new File("C:\\demo\\a.txt");
		File f2 = new File("D:\\demo\\a.txt");
		System.out.println(f1.renameTo(f2));
	}
	
	private static void testToString() {
		File f1 = new File("c:\\demo\\test.txt");
		System.out.println(f1.toString());
	}
	
	private static void testCompareTo() {
		File f1 = new File("c:\\demo\\test.txt");
		File f2 = new File("c:\\demo\\test.txt");
		System.out.println(f1.compareTo(f2));
	}
	
	
	private static void testDeepDelete() {
		File dir = new File("C:\\demo\\deep-dir_0");
		File[] files = dir.listFiles();
		for(File file : files) {
			File[] fs =  file.listFiles();
			for(File f:fs) {
				System.out.println(f.delete());
			}
		}
	}
	
	private static void testDeepDelete2() {
		File dir = new File("C:\\demo\\deep-dir_0");
		File[] files = dir.listFiles();
		List<File> list = Arrays.asList(files);
		Iterator<File> it = list.iterator();
		while(it.hasNext()) {
			File f  = it.next();
			System.out.println(f.delete());
		}
	}
	
	private static void testDeepDelete(File dir) {
		if (dir != null) {
			File[] fs = dir.listFiles();
			for(File f:fs) {
				if(f.isDirectory()) {
					testDeepDelete(f);
				}else {
					System.out.println(f.delete());
				}
			}
			System.out.println(dir.delete());
		}
	}
	
}
