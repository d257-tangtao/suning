/**
 * 
 */
package com.yidu.gd.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.yidu.gd.suning.order.dao.impl.AdminOrderDaoImp;

/**
 * @author cl202
 *
 */
public class TestOrder {
	AdminOrderDaoImp adminOrder = new AdminOrderDaoImp();
	@Test
	public void allOrder(){
		
		//OrderBiz orderBiz = new OrderBiz();
	/*	List<Order> orderlist = orderBiz.ShowAllOrder("B3B8C4D11BAE4407");
		System.out.println(orderlist.toString());
		DateFormat date =new SimpleDateFormat("yyy/MM/dd");
		Date time = new Date();
		Calendar cal = Calendar.getInstance();
		//cal.add(cal.MONTH, -3);
		Date now = cal.getTime();
		System.out.println(date.format(now));
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.getActualMinimum(cal.YEAR));
		System.out.println(cal.getActualMaximum(cal.DATE));*/
		
		/*System.out.println(orderBiz.getOrderTimeStart("0"));
		System.out.println(orderBiz.getOrderTimeEnd("0"));*/
		
		/*Map<String, String> map = new HashMap<String,String>();
		map.put("ORDERID", "2018000001");
		map.put("ORDERSTATUS", "4");*/
		System.out.println(adminOrder.getAllOrderCount());
		System.out.println(adminOrder.findAllOrder());
		System.out.println(adminOrder.getStatusOrderCount("4"));
		System.out.println(adminOrder.findOrderItemById("2018000001"));
		//System.out.println(adminOrder.getAllOrderCount(map));
		System.out.println(adminOrder.getProductById("E5A281FD960C4B"));
		System.out.println(adminOrder.findAllOrder(1,2));
		System.out.println(adminOrder.findStatusOrder("4",1,2));
	}

}
