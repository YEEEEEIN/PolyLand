package PolyLand;

import java.util.List;

public class PrintClass {
	public static void printTotalList(MakeTotalList makeTotalList) {
		List<OrderList> aa = makeTotalList.getData();
		int sum = 0;
		System.out.print("==================== �������� ====================\n");

		for (int i = 0; i < aa.size(); i++) {
			switch (aa.get(i).getTicket()) {
			case 1:
				System.out.print("�ְ��� ");
				break;
			case 2:
				System.out.print("�߰��� ");
				break;
			}
			switch (aa.get(i).getTicket()) {
			case 1:
				System.out.print("�ְ��� ");
				break;
			case 2:
				System.out.print("�߰��� ");
				break;
			}

			switch (aa.get(i).getAge()) {
			case 1:
				System.out.print("���� X ");
				break;
			case 2:
				System.out.print("û�ҳ� X");
				break;
			case 3:
				System.out.print("���� X");
				break;
			case 4:
				System.out.print("��� X");
				break;
			case 5:
				System.out.print("���� X");
				break;
			}

			System.out.printf("%d", aa.get(i).getCount());
			System.out.printf(" %d", aa.get(i).getPrice());

			switch (aa.get(i).getFirst()) {
			case 1:
				System.out.print(" * ������� ����\n");
				break;
			case 2:
				System.out.print(" * ����� �������\n");
				break;
			case 3:
				System.out.print(" * ���������� �������\n");
				break;
			case 4:
				System.out.print(" * ���ڳ� �������\n");
				break;
			case 5:
				System.out.print(" * �ӻ�� �������\n");
				break;
			}
			sum += aa.get(i).getTotal();
		}
		System.out.printf("������� �Ѿ��� %d�Դϴ�.\n", sum);

	}
}
