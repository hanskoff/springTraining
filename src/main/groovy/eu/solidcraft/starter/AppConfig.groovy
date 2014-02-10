package eu.solidcraft.starter

import eu.solidcraft.starter.infrastructure.security.LoggedUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
public class AppConfig {

  @Bean(name = "polish")
  public ScoreCalculator scoreCalculatorPL() {
    return new ScoreCalculator(new PolishFraudDetector(), rulesList())
  }

  @Bean(name = "english")
  public ScoreCalculator scoreCalculatorUK() {
    return new ScoreCalculator(new EnglishFraudDetector(), rulesList())
  }

  @Bean
  @Autowired
  public List<ScoringRule> rulesList(RememberRule remberRule) {
    return [new AgeScoringRule(), new LoansHistoryScoringRule(), new JobsScoringRule(), remberRule]
  }

  @Bean
  public LoggedUserRepository userServie(){
    return new LoggedUserRepository()
  }
}
