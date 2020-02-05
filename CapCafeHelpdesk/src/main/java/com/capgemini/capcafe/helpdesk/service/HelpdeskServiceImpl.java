package com.capgemini.capcafe.helpdesk.service;

import java.util.List;

@Service
@Transactional(rollbackFor = HelpdeskException.class)
public class HelpdeskServiceImpl implements HelpdeskService {
	
	@Autowired
	private HelpdeskPersistence helpdeskPersistence;

	

	@Override
	public Order fetchOrderId(String OrderID) throws HelpdeskException {
		try {
			return helpdeskPersistence.findByOrderId(OrderID).get();
		} catch (Exception e) {
			throw new HelpdeskException("No details are available for OrderId: ");
		}
	}


	
}

