package asia.ait.sad.notifications;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @PostMapping(path="/refresh_token", consumes = "application/json", produces = "application/json")
    String refreshToken(
            @RequestBody String token)
    {
        return "{\"return\":\""+token+"\"}";
    }

}
