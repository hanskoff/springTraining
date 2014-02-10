package eu.solidcraft.starter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class ScoreCalculator {

  private FraudDetector fraudDetector

  private List<ScoringRule> rules

  ScoreCalculator() {
  }

  @Autowired
  ScoreCalculator(@Qualifier("polishFraud") FraudDetector fraudDetector, List<ScoringRule> rules) {
    this.fraudDetector = fraudDetector
    this.rules = rules
  }

  void setFraudDetector(FraudDetector fraudDetector) {
    this.fraudDetector = fraudDetector
  }

  void setRules(List<ScoringRule> rules) {
    this.rules = rules
  }

  static ScoreCalculator createInstance(FraudDetector fraudDetector, List<ScoringRule> rules) {
    new ScoreCalculator(fraudDetector, rules)
  }
}
