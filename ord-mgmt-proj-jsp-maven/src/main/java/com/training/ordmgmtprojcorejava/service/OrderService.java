package com.training.ordmgmtprojcorejava.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.training.ordmgmtprojcorejava.model.Item;
import com.training.ordmgmtprojcorejava.model.Order;

public interface OrderService {
	
	abstract public List<Item> getCartItems();
	
	abstract public List<Item> getItemsSelected(List<Item> itemList);
	
	abstract public boolean addToCart(Item item, HttpSession session);
	
	abstract public Order calculatePrice(List<Item> cartItems);
	
	abstract public long insertOrder(Order order);
	
	abstract public boolean clearCartItems();
	
	abstract public Order getOrderByOrderId(Long orderId);
	
	abstract public boolean deleteOrder(Long orderId);
	
	abstract public List<Item> getCartItems(HttpSession httpSession);

}
