package eu.solidcraft.starter

class ScoreCalculator {

  private FraudDetector fraudDetector

  private List<ScoringRule> rules

  ScoreCalculator() {
  }

  ScoreCalculator(FraudDetector fraudDetector, List<ScoringRule> rules) {
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

  Integer getScoring(){
    rules.sum { it -> it.getScore()}
  }
}
