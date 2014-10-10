/*
 * Copyright 2014 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.usergrid.corepersistence;

import org.apache.usergrid.persistence.collection.EntityCollectionManager;
import org.apache.usergrid.persistence.model.entity.Entity;


/**
 * Interface for classes that need to visit all collections, connections and entities.
 */
public interface CpVisitor {

    public void visitCollectionEntry( 
        EntityCollectionManager ecm, String collName, Entity collEntity, Entity memberEntity );

    public void visitConnectionEntry( 
        EntityCollectionManager ecm, String connType, Entity sourceEntity, Entity targetEntity );
}
