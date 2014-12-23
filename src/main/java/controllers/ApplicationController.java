/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Store;
import models.UserRole;
import ninja.Result;
import ninja.Results;
import ninja.params.Param;
import service.IStoreService;

import com.google.inject.Inject;
import com.google.inject.Singleton;


@Singleton
public class ApplicationController {

	@Inject private IStoreService storeService;
	
    public Result index() {
        Result result = Results.html();
        List<UserRole> userRoles = new ArrayList<UserRole>(Arrays.asList(UserRole.values()));
        result.render("userRoles",userRoles);
        return result;
    }
    
    public Result registerUser(@Param("userEmail") String userEmail,  @Param("userPassword") String userPassword, 
                                                   @Param("userRePassword") String userRePassword, @Param("userRole") String userRole) {    
        List<Store> stores = storeService.getAllStore("");
        return Results.json().render(stores);
    }
    
    public Result helloWorldJson() {    
        
        //SimplePojo simplePojo = new SimplePojo();
        //simplePojo.content = "Test Hello World! Hello Json!";
        
        //return Results.json().render(simplePojo);
    	List<Store> stores = storeService.getAllStore("");
    	return Results.json().render(stores);
    }
    
    public Result createStore() {
        List<Store> stores = storeService.getAllStore("");
        return Results.json().render(stores);
    }
    
    public static class SimplePojo {

        public String content;
        
    }
}
