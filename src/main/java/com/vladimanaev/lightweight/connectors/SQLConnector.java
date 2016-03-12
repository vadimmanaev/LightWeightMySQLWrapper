/*******************************************************************************
 * Copyright 2013
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.vladimanaev.lightweight.connectors;

import com.vladimanaev.lightweight.model.Query;
import com.vladimanaev.lightweight.model.Result;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Vladi
 * Date: 3/12/2016
 * Time: 8:11 PM
 * Copyright VMSR
 */
public interface SQLConnector {

    void open() throws SQLException;

    void close() throws SQLException;

    boolean isConnected() throws SQLException;

    boolean commit() throws SQLException;

    boolean rollback() throws SQLException;

    Connection getConnection();

    void executeUpdateQuery(Query Query) throws SQLException;

    Result executeSelectQuery(Query Query) throws SQLException;

}