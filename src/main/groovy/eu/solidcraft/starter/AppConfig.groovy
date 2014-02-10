package eu.solidcraft.starter

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

//@Configuration
@Component
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
  public List<ScoringRule> rulesList() {
    return [new AgeScoringRule(), new LoansHistoryScoringRule(), new JobsScoringRule()]
  }
}
