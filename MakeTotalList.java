package PolyLand;

import java.util.ArrayList;
import java.util.List;

public class MakeTotalList {

	/* �ڷ����� ������� ���� �������� ����Ʈ �����*/

	//<OderList - 1> ��ü ����, �ʱ�ȭ (��������ó�� ����)
	public List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null;

	/*<OderList - 4> ���� ���ϴ� ���´�� ���ڸ� �޴� �޼ҵ� �����ϰ�, orderlist���������� �޼ҵ� ���� ����!
	 *<OderList - 5> orderlist ��ü�� add�Լ� �̿��Ͽ� ��Ʈ�� �ִ� ���� ���ϱ�*/

	public void OrderList(int ticket,int age,int price,int count,int first,double discount,double total) {
		OrderList order = new OrderList();
		order.setTicket(ticket);
		order.setAge(age);
		order.setPrice(price);
		order.setCount(count);
		order.setFirst(first);
		order.setDiscount(discount);
		order.setTotal(total);

		data.add(order);
	}

	public List<OrderList> getData() {
		return data;
	}
}
