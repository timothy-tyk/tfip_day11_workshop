import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class Homepage {
  @GetMapping()
  public String showHomepage(){
    return "index";
  }

}
