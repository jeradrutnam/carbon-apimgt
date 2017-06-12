package org.wso2.carbon.apimgt.core.configuration.models;
/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.wso2.carbon.kernel.annotations.Element;

/**
 * Class to hold JMS connection details
 */
public class JMSConnectionConfiguration {

    @Element(description = "Java naming factory initial")
    private String javaNamingfactoryInitial = "org.wso2.andes.jndi.PropertiesFileInitialContextFactory";
    @Element(description = "JMS Connectiontion factory JNDI name")
    private String jmsConnectionFactoryJNDIName = "TopicConnectionFactory";
    @Element(description = "Topic connection factory URL")
    private String topicConnectionFactoryURL = "tcp://localhost:61616";
    @Element(description = "Destination topic name")
    private String topic = "myTopic";

    public String getJavaNamingfactoryInitial() {
        return javaNamingfactoryInitial;
    }

    public String getJmsConnectionFactoryJNDIName() {
        return jmsConnectionFactoryJNDIName;
    }

    public String getTopicConnectionFactoryURL() {
        return topicConnectionFactoryURL;
    }

    public String getTopic() {
        return topic;
    }
}