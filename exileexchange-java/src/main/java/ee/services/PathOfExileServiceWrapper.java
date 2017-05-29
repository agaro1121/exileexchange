package ee.services;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class PathOfExileServiceWrapper {

  private static final Logger log = LoggerFactory.getLogger(PathOfExileServiceWrapper.class);

  private static final String pathOfExileServiceHost = "http://www.pathofexile.com/api/public-stash-tabs";

  private static final RestTemplate restTemplate = new RestTemplate();

  public Object get(String id) {
    if (StringUtils.isEmpty(id)) {
      log.info("GET <{}>", pathOfExileServiceHost);
      return getForObject(pathOfExileServiceHost);
    } else {
      log.info("GET <{}?id={}>", pathOfExileServiceHost, id);
      return getForObject(pathOfExileServiceHost + "?id=" + id);
    }
  }

  private Object getForObject(final String url) {
    return restTemplate.getForObject(url, Object.class);
  }

}
