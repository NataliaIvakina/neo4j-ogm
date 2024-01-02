/*
 * Copyright (c) 2002-2024 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
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
package org.neo4j.ogm.persistence.types.nativetypes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class SomethingRelated {

    LocalDate localDate;
    private Long id;

    @Relationship(value = "REL", direction = Relationship.Direction.INCOMING)
    private Collection<SomethingRelationship> rels = new ArrayList<>();

    public Collection<SomethingRelationship> getRels() {
        return rels;
    }
}
