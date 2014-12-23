package dao;

import static org.junit.Assert.assertThat;

import java.util.Date;
import java.util.List;

import models.Store;
import ninja.NinjaRunner;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import service.IStoreService;

import com.google.inject.Inject;

@RunWith(NinjaRunner.class)
public class ServicesTest  {
  @Inject private IStoreService storeService;
  
  @Test
  public void testCreateStore(){
	  Store s = new Store();
	  s.setName("Store1");
	  s.setAddress("ABC");
	  s.setCreatedBy(1);
	  s.setUpdatedBy(1);
	  storeService.createStore(s);
	  List<Store> stores = storeService.getAllStore("");
	  assertThat(stores.size(), CoreMatchers.is(1));
	  assertThat(stores.get(0).getId(), CoreMatchers.notNullValue());
  }
  
  @Test
  public void testRemoveStore(){
/*	  List<Store> stores = storeService.getAllStore("");
	  for(Store dto:stores){
	      storeService.deleteStore(dto);
	  }
	  stores = storeService.getAllStore("");
	  assertThat(stores.size(), CoreMatchers.is(0));*/
  }
}
