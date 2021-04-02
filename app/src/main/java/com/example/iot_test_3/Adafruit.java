//package com.example.iot_test_3;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import com.example.iot_test_3.R;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
//import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
//import org.eclipse.paho.client.mqttv3.MqttException;
//import org.eclipse.paho.client.mqttv3.MqttMessage;
//
//import java.nio.charset.Charset;
//
//public class Adafruit  extends AppCompatActivity {
//    MQTTService mqtt;
//    Button btn0;
//    Button btn1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.adafruit);
//        Log.i("ADAFRUIT", "onCreate");
//
//        mqtt = new MQTTService(Adafruit.this);
//
//        mqtt.setCallback(new MqttCallbackExtended() {
//            @Override
//            public void connectComplete(boolean reconnect, String serverURI) {
//
//            }
//
//            @Override
//            public void connectionLost(Throwable cause) {
//
//            }
//
//            @Override
//            public void messageArrived(String topic, MqttMessage message) throws Exception {
//                Log.d("Mqtt", message.toString() + "is from " +  topic);
//            }
//
//            @Override
//            public void deliveryComplete(IMqttDeliveryToken token) {
//
//            }
//        });
//
//        btn0 = findViewById(R.id.send0);
//        btn1 = findViewById(R.id.send1);
//
//        btn0.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                sendDataMQTT("0");
//            }
//        });
//
//        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                sendDataMQTT("1");
//            }
//        });
//    }
//
//
//    private void sendDataMQTT(String data){
//
//        MqttMessage msg = new MqttMessage();
//        msg.setId(1234);
//        msg.setQos(0);
//        msg.setRetained(true);
//
//        byte[] b = data.getBytes(Charset.forName("UTF-8"));
//        msg.setPayload(b);
//
//        Log.d("Mqtt","Publish :" + msg);
//        try {
//            mqtt.mqttAndroidClient.publish("thanhdanh27600/feeds/bbc-led", msg);
//
//        }catch (MqttException e){
//        }
//    }
//
//}
