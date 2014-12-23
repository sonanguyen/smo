package service.impl;

import java.util.List;

import models.Store;
import service.IStoreService;

import com.google.inject.Inject;

import dao.JPAQuery;
import dao.StoreDao;

public class StoreService extends AbstractService implements IStoreService {

    @Inject
    private StoreDao storeDao;
    
    @Override
    public Store createStore(Store store) {
        return storeDao.save(store);
    }

    @Override
    public void updateStore(Store store) {
        storeDao.update(store);
    }

    @Override
    public void deleteStore(Store store) {
        storeDao.delete(store);
    }

    @Override
    public Store getStoreById(Integer Id) {
        return storeDao.get(Id);
    }

    @Override
    public List<Store> getAllStore(String orderBy) {
        JPAQuery q = storeDao.find("SELECT s FROM Store s ORDER BY name");
        return q.fetch();
    }
   
}
