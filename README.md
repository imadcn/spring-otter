# spring xml配置
###### ConnectionFactory
```xml
<bean id="canalConnectionFactory"
    class="com.imadcn.framework.canal.connection.ZkClusterConnetionFactory">
    <property name="zkServers" value="${canal.zookeeper.servers}" ></property>
    <property name="destination" value="${canal.destination}" ></property>
    <property name="username" value="${canal.username}" ></property>
    <property name="password" value="${canal.password}" ></property>
</bean>
```
###### MessageContainer
```xml
<bean id="canalMessageListenerContainer"
    class="com.imadcn.framework.canal.listener.SimpleMessageListenerContainer">
    <property name="connectionFactory" ref="canalConnectionFactory" />
    <property name="messageListener" ref="canalMessageListener" />
    <property name="autoStartup" value="true" />
</bean>
```

###### MessageListener
```xml
<bean id="canalMessageListener" class="com.imadcn.demo.canal.CanalMessageListener" />
```
