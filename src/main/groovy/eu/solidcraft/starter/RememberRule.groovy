package eu.solidcraft.starter

import eu.solidcraft.starter.infrastructure.security.LoggedUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import java.util.concurrent.ConcurrentHashMap

@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//scope_prototype tworzy instancje per injection
class RememberRule implements ScoringRule {

  private LoggedUserRepository loggedUserRepository;

  @Autowired
  RememberRule(LoggedUserRepository loggedUserRepository) {
    this.loggedUserRepository = loggedUserRepository
  }

  private HashMap usersMap = new ConcurrentHashMap<String, Integer>();

  public increaseScore() {
    usersMap.put(loggedUserRepository.getLoggedUserName(), 10)
  }

  public int mapSize() {
    usersMap.size()
  }

  @Override
  int getScore() {
    return 0  //To change body of implemented methods use File | Settings | File Templates.
  }
}
