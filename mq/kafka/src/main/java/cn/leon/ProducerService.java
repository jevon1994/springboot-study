package cn.leon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mujian
 * @date 2019-4-25 0025
 **/
@Slf4j
@Service
public class ProducerService {
//    @Autowired
//    private Producer producer;

    public void send(String message){
//        producer.send(message);
    }
//
//    /**
//     * 注入KafkaTemplate
//     *
//     * @param kafkaTemplate kafka模版类
//     */
//    @Autowired
//    private KafkaTemplate<Integer, String> template;
//
//    public void sendMessage(MessageForm form) {
//        log.info("kafka sendMessage start");
//        ListenableFuture<SendResult<Integer, String>> future = template.send(form.getTopic(), form.getContent());
//        future.addCallback(new ListenableFutureCallback<SendResult<Integer, String>>() {
//
//            @Override
//            public void onFailure(Throwable ex) {
//                log.error("kafka sendMessage error, ex = {}, topic = {}, data = {}", ex, form.getTopic(), form.getContent());
//            }
//
//            @Override
//            public void onSuccess(SendResult<Integer, String> result) {
////                log.info("kafka sendMessage success topic = {}, data = {}", form.getTopic(), form.getContent());
//            }
//        });
//        log.info("kafka sendMessage end");
//    }
}
