package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailBoImpl implements OrderDetailBo{

    OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();

    public ArrayList<OrderDetailDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.getAll();
    }

    public boolean addOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.add(dto);
    }

    public boolean updateOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.update(dto);
    }

    public boolean existOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.generateNewID();
    }

    public boolean deleteOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.delete(id);
    }

    public OrderDetailDTO searchOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.search(id);
    }
}
