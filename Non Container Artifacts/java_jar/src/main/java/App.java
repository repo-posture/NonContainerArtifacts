import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Tiny sample app whose fat JAR embeds Guava, Commons Lang, and Jackson
 * so Local Stage SBOM scanners detect real components.
 */
public class App {
  public static void main(String[] args) throws Exception {
    List<String> names = ImmutableList.of("alice", "bob", "carol");
    String joined = StringUtils.join(names, ",");
    String json = new ObjectMapper().writeValueAsString(Map.of("hello", joined));
    System.out.println(json);
  }
}
