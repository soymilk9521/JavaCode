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
		 * File�ࣺ
		 * 	���ļ������ļ��з�װ�ɶ���
		 *  ������ļ������ļ��е����Խ��в���
		 *  File���������Ϊ���캯�����ݸ����Ĺ��캯��
		 *  
		 *  1. ���캯��
		 *  	
		 *  2. ��������
		 *  	2.1. ����
		 *  	createNewFile();
		 *  	mkdir();
		 *  	mkdirs();
		 *      2.2. �ж�
		 *      canExecute();
		 *      canRead();
		 *      canWrite();
		 *      exists();
		 *      isAbsolute();
		 *      isDirectory();
		 *      isFile();
		 *      isHidden();
		 *      2.3. ��ȡ
		 *      getAbsolutePath()��
		 *      getName()��
		 *      getParent()��
		 *      getFreeSpace()��
		 *      getPath()��
		 *      getTotalSpace()��
		 *      getUsableSpace()��
		 *      lastModified();
		 *      length();
		 *      list();
		 *      listFiles();
		 *      listRoots();
		 *      2.4. ����
		 *      renameTo(File dest) 
		 *      setExecutable(boolean executable) 
		 *      setReadable(boolean readable)
		 *      setWritable(boolean writable) 
		 *      setReadOnly()  
		 *      setLastModified(long time) 
		 *      toString() 
		 *      2.5. �Ƚ�
		 *      compareTo(File pathname) 
		 *      2.6. ɾ��
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
		// ��ϵͳ��ص�Ĭ������ - �ָ����ַ�
		System.out.println(File.separator);
		// ��ϵͳ��ص�·���ָ����ַ�
		System.out.println(File.pathSeparator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparatorChar);
	}
	private static void testConstructor() throws IOException {
		// ����һ���ļ�
		File f1 = new File("c:\\demo\\file.txt");
		// ��ָ��Ŀ¼�´���һ���ļ�
		File f2 = new File("c:\\demo", "file2.txt");
		// ��ֱ���ļ����´���һ���ļ�
		File pf = new File("c:\\demo");
		File f3 = new File(pf, "file3.txt");
	}
	
	private static void testCreate() throws IOException {
		File f1  = new File("c:\\demo\\create-file.txt");
		// ����һ�����ļ�
		boolean bf1 = f1.createNewFile();
		// ��Ĭ��·���´���һ����ʱ�ļ�������ָ��ǰ׺�ͺ�׺
		File f2 = File.createTempFile("date", "log");
		System.out.println(f2.getAbsolutePath());
		File dir = new File("c:\\demo");
		// ��ָ��Ŀ¼�´���һ����ʱ�ļ��� ����ָ���ļ���ǰ׺�ͺ�׺
		File f3 = File.createTempFile("date", "log", dir);
		System.out.println(f3.getAbsolutePath());
		
		System.out.println(bf1);
		File dir2 = new File("c:\\demo\\create-dir");
		// ����һ���ļ���
		boolean bd = dir2.mkdir();
		System.out.println(bd);
		File dir3 = new File("c:\\demo\\a\\b\\c");
		// ����һ���༶Ŀ¼
		boolean bd2 = dir3.mkdirs();
		System.out.println(bd2);
	}
	
	private static void testJudgement() throws IOException {
		File f1  = new File("create-file.txt");
		f1.createNewFile();
		// ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 
		System.out.println(f1.exists());
		// ���Դ˳���·������ʾ���ļ��Ƿ�Ϊ��ͨ�ļ��� 
		System.out.println(f1.isFile());
		// ���Դ˳���·������ʾ���ļ��Ƿ�ΪĿ¼�� 
		System.out.println(f1.isDirectory());
		// ���Դ˳���·�����������ļ��Ƿ�Ϊ�����ļ��� 
		System.out.println(f1.isHidden());
		// ����Ӧ�ó����Ƿ���Զ�ȡ�ɴ˳���·������ʾ���ļ��� 
		System.out.println(f1.canRead());
		// ����Ӧ�ó����Ƿ�����޸��ɴ˳���·������ʾ���ļ��� 
		System.out.println(f1.canWrite());
		// ����Ӧ�ó����Ƿ����ִ�д˳���·������ʾ���ļ��� 
		System.out.println(f1.canExecute());
		// �����������·�����Ƿ��Ǿ��Եġ�
		System.out.println(f1.isAbsolute());
	}
	
	private static void testGetInfo() {
		File f1  = new File("create-file.txt");
		// �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ� 
		System.out.println(f1.getName());
		// ���ش˳���·�����ĸ� null��·�����ַ����������·����δ����Ϊ��Ŀ¼���򷵻�null�� 
		System.out.println(f1.getParent());
		// ���˳���·����ת��Ϊ·�����ַ����� 
		System.out.println(f1.getPath());
		// ���ش˳���·�����ľ���·�����ַ���
		System.out.println(f1.getAbsolutePath());
		// ���ط���δ������ֽ��� named�˳���·������
		System.out.println(f1.getFreeSpace());
		// ͨ���˳���·�������ط��� named�Ĵ�С�� 
		System.out.println(f1.getTotalSpace());
		// �����ϵķ����ṩ������������ֽ��� named�˳���·������ 
		System.out.println(f1.getUsableSpace());
		// ���ش˳���·������ʾ���ļ��ϴ��޸ĵ�ʱ�䡣 
		System.out.println(f1.lastModified());
		// �����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 
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
		// �г�ָ��Ŀ¼�������ļ�
		File[] files = dir.listFiles();
		for(File file :files) {
			System.out.println(file.getName());
		}
	}
	
	public static void testListFilesWithFilter() {
		File dir = new File("c:\\demo");
		// �г�ָ��Ŀ¼�������ļ�
		File[] files = dir.listFiles(new MyFilenameFilter("mp3"));
		for(File file :files) {
			System.out.println(file.getName());
		}
	}
	
	public static void testListRoots() {
		// �г����õ��ļ�ϵͳ����
		File[] files = File.listRoots();
		for(File f: files) {
			System.out.println(f.getAbsolutePath());
		}
	}


	private static void testDelete() {
		File f1 = new File("c:\\demo\\a");
		// ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼
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
