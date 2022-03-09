/*
 *
 *  *
 *  *  * Licensed to the Apache Software Foundation (ASF) under one
 *  *  * or more contributor license agreements.  See the NOTICE file
 *  *  * distributed with this work for additional information
 *  *  * regarding copyright ownership.  The ASF licenses this file
 *  *  * to you under the Apache License, Version 2.0 (the
 *  *  * "License"); you may not use this file except in compliance
 *  *  * with the License.  You may obtain a copy of the License at
 *  *  *
 *  *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  * See the License for the specific language governing permissions and
 *  *  * limitations under the License.
 *  *
 *
 */

package com.dtstack.flinkx.connector.influxdb.source;

import com.dtstack.flinkx.connector.influxdb.conf.InfluxdbConfig;
import com.dtstack.flinkx.source.format.BaseRichInputFormatBuilder;

/**
 * Company：www.dtstack.com.
 *
 * @author shitou
 * @date 2022/3/8
 */
public class InfluxdbInputFormatBuilder extends BaseRichInputFormatBuilder<InfluxdbInputFormat> {

    protected InfluxdbInputFormat format;

    public InfluxdbInputFormatBuilder() {
        super.format = this.format = new InfluxdbInputFormat();
    }

    public void setInfluxdbConfig(InfluxdbConfig config) {
        super.setConfig(config);
        this.format.setConfig(config);
    }

    @Override
    protected void checkFormat() {
        //TODO
    }

}