package com.arc.learn.switchdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * switch(���ʽ){
		 * 	case ȡֵ1:
		 * 		ִ����䣻
		 * 		break��
		 *  case ȡֵ2��
		 *  	ִ����䣻
		 * 		break��
		 *  ...
		 *  default:
		 *  	ִ����䣻
		 *  	break��
		 * }
		 */
		
		int x = 4; 
		switch(x) { // byte, short, int, char�� �ַ�������String
		case 4:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;
		}
		
		
		// �򵥵ļ�����
		int m = 4; int n = 6;
		char c = '^';
		switch(c) { // byte, short, int, char, String
		default:
			System.out.println("��֪��");
//			break;
		case '+':
			System.out.println(m + n);
			break;
		case '-':
			System.out.println(m - n);
			break;
		case '*':
			System.out.println(m * n);
			break;
		case '/':
			System.out.println(m / n);
			break;
		}
		
		// break����
		// case���˳��ɱ�
		
		if(c == '^') {
			System.out.println("true");
		}
	}

}
