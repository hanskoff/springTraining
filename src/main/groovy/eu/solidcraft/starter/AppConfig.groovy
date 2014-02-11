package eu.solidcraft.starter

import eu.solidcraft.starter.infrastructure.security.LoggedUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
public class AppConfig {

  @Bean
  @Autowired
  public List<ScoringRule> rulesList(RememberRule remberRule,
                                     @Qualifier("loanHistory") ScoringRule loanHistoryScoringRule) {
    return [new JobsScoringRule(), remberRule, loanHistoryScoringRule]
  }

  @Bean(name = "polish")
  @Autowired
  public ScoreCalculator scoreCalculatorPL(List<ScoringRule> rulesList) {
    return new ScoreCalculator(new PolishFraudDetector(), rulesList)
  }

//  @Bean(name = "english")
//  public ScoreCalculator scoreCalculatorUK() {
//    return new ScoreCalculator(new EnglishFraudDetector(), rulesList())
//  }

  @Bean
  public LoggedUserRepository userServie() {
    return new LoggedUserRepository()
  }





}
