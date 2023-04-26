package PolyLand;

import java.util.Scanner;

public class Main {

	static int totalordercount = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			MakeTotalList makeTotalList = new MakeTotalList();
			while (true) {
				int ticket = InputClass.get_ticket();
				int age = InputClass.get_age();
				int price = InputClass.get_price(ticket, age);
				int count = InputClass.get_count();
				int first = InputClass.get_first();
				double discount = InputClass.get_discount(first);
				double total = price * count * discount;
				makeTotalList.OrderList(ticket, age, price, count, first, discount, total);
				System.out.printf("������ %.0f �� �Դϴ�.\n", total);
				System.out.print("�����մϴ�.\n");

				System.out.print("��� �߱��Ͻðڽ��ϱ�?\n");
				System.out.print("1. Ƽ�� �߱�\n");
				System.out.print("2. ����\n");
				int end = sc.nextInt();

				if (end == 2) {
					break;
				}
				totalordercount++;
			}

			System.out.print("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n\n");

			PrintClass.printTotalList(makeTotalList);

			System.out.print("��� ����(1: ���ο� �ֹ�, 2: ���α׷� ����):");
			int ing = sc.nextInt();
			if (ing == 2) {
				break;
			}
		}
	}

	
}
