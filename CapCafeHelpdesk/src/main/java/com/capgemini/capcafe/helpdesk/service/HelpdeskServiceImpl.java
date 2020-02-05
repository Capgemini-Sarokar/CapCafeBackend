package com.capgemini.capcafe.helpdesk.service;

import java.util.List;

@Service
@Transactional
public class HelpdeskServiceImpl implements HelpdeskService {

	@Autowired
	private HelpdeskPersistence repo;
	@Override
	public List<Orders> getAllOrders() {
		
		return repo.findAll();
	}
	
	@Override
	public Orders addNewOrder(Orders order) {
		
		return repo.save(order);
	}

	@Override
	public Orders getById(int orderId) {
		
		return repo.findById(orderId).get();
	}
}


	


