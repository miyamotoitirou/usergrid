/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.usergrid.rest.test.resource2point0;


import org.apache.usergrid.rest.test.resource2point0.endpoints.Collection;
import org.apache.usergrid.rest.test.resource2point0.endpoints.RootResource;
import org.apache.usergrid.rest.test.resource2point0.model.Entity;
import org.apache.usergrid.rest.test.resource2point0.model.EntityResponse;


/**
 * Created by ApigeeCorporation on 12/4/14.
 */
public class DumbClient {

    private final Client client = new Client("http://localhost:8080");

    public void stuff(){
        EntityResponse itr  =  client.org( "test" ).getApp( "test" ).users().getEntityResponse();

        for(Entity entity: itr){

        }
    }

    public void stateful(){



        EntityResponse itr  =  client.org( "test" ).getApp( "test" ).users().getEntityResponse();

        for(Entity entity: itr){

        }
    }
}
