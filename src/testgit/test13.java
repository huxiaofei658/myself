package testgit;

import java.util.Random;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int min = 0;
		int num = 0;
		for (int i = 0; i <= 100; i++) {
			Random rand = new Random();
			int r = rand.nextInt(99);
			System.out.println(r);
			if (r >= max) {
				max = r;
			} else if (r < min) {
				min = r;
			}
			if (r > 50) {
				++num;
			}

		}

		System.out.println("�����max=" + max + "\n" + "��С��min=" + min);

		System.out.println("����50�ĸ�����" + num);

	}

}
