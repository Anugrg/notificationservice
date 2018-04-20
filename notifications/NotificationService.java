package asia.ait.sad.notifications;

import asia.ait.sad.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class NotificationService {
 @Autowired
 private EntityManager entityManager;

    @Transactional
    public UserToken save(UserToken userToken) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        accountRepository.save(account);
        return account;
    }

}
