package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailBo {

    ArrayList<OrderDetailDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException;

    boolean addOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;

    boolean updateOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;

    boolean existOrderDetails(String id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;

    boolean deleteOrderDetails(String id) throws SQLException, ClassNotFoundException;

    OrderDetailDTO searchOrderDetails(String id) throws SQLException, ClassNotFoundException;
}
