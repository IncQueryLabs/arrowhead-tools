package com.incquerylabs.conptest.mqtt;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.incquerylabs.conptest.Receiver;

public class MqttRec extends Thread implements MqttCallback, Receiver{
	
	 	private final int qos = 1;
	    public static final String TOPIC = "test";
	    private MqttClient rec;
	    private String IP = "127.0.0.1";
	    private int port = 9002;
	    private String recName = "Mqtt rec";
	    Map<Integer, Instant> map = new HashMap<Integer, Instant>();
	    
	    @Override
	    public void run(){
	        MqttConnectOptions options = new MqttConnectOptions();
	        options.setAutomaticReconnect(true);
	        options.setCleanSession(true);
	        options.setConnectionTimeout(10);
	        String url = "tcp://" + IP + ":" + port;

	        try {
				rec = new MqttClient(url, recName, new MemoryPersistence());
				rec.setCallback(this);
		        rec.connect(options);

		        rec.subscribe(TOPIC, qos);
			} catch (MqttException e) {
				System.out.println("MQtteX");
			}
	    }

	    @Override
	    public void connectionLost(Throwable cause) {
	        System.out.println("Connection lost because: " + cause);
	        System.exit(1);
	    }

	    @Override
	    public void deliveryComplete(IMqttDeliveryToken token) {
	    }

	    @Override
	    public void messageArrived(String topic, MqttMessage message) throws MqttException {
	        ByteBuffer buf = ByteBuffer.wrap(message.getPayload());
	        Integer index = buf.getInt();
	        map.put(index, Instant.now());
	        System.out.println("Rec: " + index + " ar " + Instant.now().toString());
	    }

		@Override
		public Instant getEnd(Integer n) {
			return map.get(n);
		}
}
