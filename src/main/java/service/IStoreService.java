package service;

import java.util.List;

import models.Store;

public interface IStoreService extends IAbstractService {
    Store createStore(Store store);
    void  updateStore(Store store);
    void  deleteStore(Store store);
    Store getStoreById(Integer Id);
    List<Store> getAllStore(String orderBy);
}
