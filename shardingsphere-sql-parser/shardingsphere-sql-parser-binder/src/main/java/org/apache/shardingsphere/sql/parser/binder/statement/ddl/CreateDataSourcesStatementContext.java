/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.binder.statement.ddl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.sql.parser.binder.statement.CommonSQLStatementContext;
import org.apache.shardingsphere.sql.parser.sql.statement.ddl.CreateDataSourcesStatement;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Create dataSource statement context.
 */
public final class CreateDataSourcesStatementContext extends CommonSQLStatementContext<CreateDataSourcesStatement> {
    
    public CreateDataSourcesStatementContext(final CreateDataSourcesStatement sqlStatement) {
        super(sqlStatement);
    }
    
    /**
     * Get dataSource contexts.
     *
     * @return dataSource contexts
     */
    public Collection<DataSourceContext> getDataSourceContexts() {
        return new LinkedList<>();
    }
    
    @RequiredArgsConstructor
    @Getter
    public static final class DataSourceContext {
        
        private final String name;
        
        private final String url;
        
        private final String userName;
        
        private final String password;
    }
}
