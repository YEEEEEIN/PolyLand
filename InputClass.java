package PolyLand;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputClass {

	public static final int BABY_PRICE = 0, ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 46000, TEEN_DAY_PRICE = 47000,
			TEEN_NIGHT_PRICE = 40000, CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000, OLD_DAY_PRICE = 44000,
			OLD_NIGHT_PRICE = 37000;

	public static int get_ticket() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �����ϼ���.\n");
		System.out.print("1. �ְ���\n");
		System.out.print("2. �߰���\n");
		int ticket = sc.nextInt();

		while (true) {
			if (ticket == 1 || ticket == 2) {

				break;
			} else {
				System.out.print("�ٽ� �Է����ּ���.\n");
			}

		}
		return ticket;
	}

	public static int get_age() {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���.(-���� �Է�)");
			String idNum = sc.nextLine();
			// ���� ��¥ ���� ����
			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM");
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd");
			int todayYear = Integer.parseInt(date.format(formatter));// 2023
			int todayMonth = Integer.parseInt(date.format(formatter1));// 04
			int todayDay = Integer.parseInt(date.format(formatter2));// 26

			// ������� ����
			int birthYear = Integer.parseInt(idNum.substring(0, 2)); // �⵵ �� ���ڸ�
			int birthMonth = Integer.parseInt(idNum.substring(2, 4)); // ��
			int birthDay = Integer.parseInt(idNum.substring(4, 6)); // ��
			int flag = Integer.parseInt(idNum.substring(6, 7)); // ����

			// flag �˻�
			if (birthYear >= 0 && birthYear < todayYear % 100) {
				if (flag != 3 && flag != 4) {
					System.out.print("�ٽ� �Է��ϼ���. �ֹι�ȣ ���ڸ��� 3,4�� �����մϴ�.\n");
					continue;
				}
			} else {
				if (flag != 1 && flag != 2) {
					System.out.print("�ٽ� �Է��ϼ���. �ֹι�ȣ ���ڸ��� 1,2�� �����մϴ�.\n");
					continue;
				}
			}
			
			// ���� ����ϱ�
			switch (flag) {
			case 1:
			case 2:
				birthYear += 1900;

				break;
			case 3:
			case 4:
				birthYear += 2000;
				break;
			default:
				System.out.print("�ٽ� �Է��ϼ���.flag�� 1,2,3,4�� ����\n");
				continue;
			}

			age = todayYear - birthYear;

			if (birthMonth > todayMonth) {
				// ������ ������ ����
				age--;
			} else if (birthMonth == todayMonth && birthDay > todayDay) {
				// ������ ������ ����
				age--;
			}

			if ((birthYear % 4 == 0 && birthYear % 100 != 0) || birthYear % 400 == 0) {
				// ������ ��� 2������ 29�� ����
				if (birthMonth == 2 && birthDay > 29) {
					System.out.print("�ٽ� �Է��ϼ���. 29�ϱ����Դϴ�.\n");
					continue;
				}
			} else {
				// ����� ��� 2������ 28�� ����
				if (birthMonth == 2 && birthDay > 28) {
					System.out.print("�ٽ� �Է��ϼ���. 28�ϱ����Դϴ�.\n");
					continue;
				}
			}
			if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) {
				if (birthDay > 30) {
					System.out.print("�ٽ� �Է��ϼ���. 30�ϱ����Դϴ�.\n");
					continue;
				}
			}
			if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8
					|| birthMonth == 10 || birthMonth == 12) {
				if (birthDay > 31) {
					System.out.print("�ٽ� �Է��ϼ���. 31�ϱ����Դϴ�.\n");
					continue;
				}
			}
			if (birthMonth == 0 || birthMonth > 12) {
				System.out.print("�ٽ� �Է��ϼ���. �ش� ���� �����ϴ�.\n");
				continue;
			}
			break;
		}
		return age;
	}

	public static int get_count() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
		int count = sc.nextInt();

		while (true) {
			if (count >= 1 && count <= 10) {
				break;
			} else {
				System.out.print("�ٽ� �Է����ּ���.\n");
			}

		}
		return count;

	}

	public static int get_first() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����ϼ���.\n");
		System.out.print("1. ���� (���� ���� �ڵ�ó��)\n");
		System.out.print("2. �����\n");
		System.out.print("3. ����������\n");
		System.out.print("4. ���ڳ�\n");
		System.out.print("5. �ӻ��\n");
		int first = sc.nextInt();
		while (true) {
			if (first >= 1 && first <= 5) {
				break;
			} else {
				System.out.print("�ٽ� �Է����ּ���.\n");
			}

		}
		return first;

	}

	public static int get_price(int ticket, int age) {
		int price = 0;
		if (ticket == 1) {
			if (age >= 19 && age <= 64) {
				int tickettype = 1;
				price = ADULT_DAY_PRICE;
			} else if (age >= 13 && age <= 18) {
				price = TEEN_DAY_PRICE;
				int tickettype = 2;
			} else if (age >= 3 && age <= 12) {
				price = CHILD_DAY_PRICE;
				int tickettype = 3;
			} else if (age >= 65) {
				price = OLD_DAY_PRICE;
				int tickettype = 4;
			} else {
				price = BABY_PRICE;
				int tickettype = 5;
			}
		}

		if (ticket == 2) {
			if (age >= 19 && age <= 64) {
				price = ADULT_NIGHT_PRICE;
				int tickettype = 1;
			} else if (age >= 13 && age <= 18) {
				price = TEEN_NIGHT_PRICE;
				int tickettype = 2;

			} else if (age >= 3 && age <= 12) {
				price = CHILD_NIGHT_PRICE;
				int tickettype = 3;
			} else if (age >= 65) {
				price = OLD_NIGHT_PRICE;
				int tickettype = 4;

			} else {
				price = BABY_PRICE;
				int tickettype = 5;
			}
		}
		return price;
	}

	public static double get_discount(int first) {
		double discount = 0;
		switch (first) {
		case 1:
			discount = 1;
			break;

		case 2:
			discount = 0.6;
			break;

		case 3:
			discount = 0.5;
			break;

		case 4:
			discount = 0.8;
			break;

		case 5:
			discount = 0.85;
			break;

		}
		return discount;
	}
}
