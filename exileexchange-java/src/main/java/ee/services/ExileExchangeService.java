package ee.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("ee")
public class ExileExchangeService {

  @Scheduled(fixedDelay = 100)
  public void run() {

  }
}
