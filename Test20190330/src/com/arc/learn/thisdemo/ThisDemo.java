package com.arc.learn.thisdemo;

public class ThisDemo {

	public static void main(String[] args) {
		/*
		 * this¹Ø¼ü×Ö
		 *  1. ÌØµã£º
		 *   1.1. this´ú±íËùÔÚº¯ÊýËùÊô¶ÔÏóµÄÒýÓÃ¡£
		 *   1.2. »»ÑÔÖ®£¬this´ú±í±¾Àà¶ÔÏóÒýÓÃ¡£
		 *   1.3. ¼òµ¥Ëµ£¬ÄÄ¸ö¶ÔÏóµ÷ÓÃthisËùÔÚµÄº¯Êý£¬this¾Í´ú±íÄÄ¸ö¶ÔÏóÒýÓÃ¡£
		 *  2. this¹Ø¼ü×ÖÄÚ´æÍ¼½â£º
		 *  3. ¹¹Ôìº¯Êýµ÷ÓÃ¹¹Ôìº¯Êý
		 *  	3.1. this.Person(); £¨X£© 
		 *  		´íÎóÔ­Òò£º¹¹Ôìº¯ÊýÊÇ´´½¨¶ÔÏóÊ±¸ø¶ÔÏó³õÊ¼»¯Ê¹ÓÃ£¬this´ú±íµ±Ç°¶ÔÏó¡£
		 *                  ¹¹Ôìº¯ÊýÏÈÓÚthis¹Ø¼ü×Ö²úÉúÔËÐÐÏûÊ§¡£
		 *  	3.2. ×¢Òâ£º¹¹Ôìº¯ÊýÖÐµ÷ÓÃ¹¹Ôìº¯ÊýÊ±£¬±ØÐë·ÅÔÚµÚÒ»ÐÐ¡£Ô­Òò¹¹Ôìº¯Êý³õÊ¼»¯ÒªÏÈÖ´ÐÐ¡£
		 *  	          ÕýÈ·Ð´·¨£ºthis(name);
		 *      3.3. Í¼½â¹¹Ôìº¯Êýµ÷ÓÃ¹¹Ôìº¯Êý
		 *  4. thisµ÷ÓÃ±¾Ààº¯Êý¡£   
		 *  5. ±È½ÏÁ½¸öÈËÄêÁäÊÇ·ñÏàµÈ
		 *   
		 */
		Person p = new Person("Eason");
		p.speak();
		Person p2 = new Person("Karen");
		p2.speak();
		Person p3 = new Person();
		p3.speak();
	}
}
/**
 * ÊôÐÔ£º
 *  Ãû³Æ
 *  ÄêÁä
 * ÐÐÎª£º
 *  Ëµ»°
 * @author kr
 *
 */
class Person {
	String name;
	int age;

	public Person() {
	}

	// 1.1. Í¬ÃûÒý³öthis¹Ø¼ü×Ö
	// 
	public Person(String name) { // ÓÐ²ÎÊý¹¹Ôìº¯Êý
		this.name = name;
	}
	void speak() {
		// 4. thisµ÷ÓÃ±¾ÀàÖÐµÄº¯Êý
		this.openMouse();
		System.out.println(this.name + ":" + this.age);
	}
	
	void openMouse() {
		System.out.print("°¡~ ÎÒÊÇ£º");
	}
	
	// 5. ±È½ÏÁ½¸öÈËÄêÁäÊÇ·ñÏàµÈ
	boolean compare(Person person) {
		// TODO ÄêÁä±È½Ï
		return false;
	}
}