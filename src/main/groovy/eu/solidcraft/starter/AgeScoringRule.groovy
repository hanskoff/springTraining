package eu.solidcraft.starter

class AgeScoringRule implements ScoringRule {
  AgeScoringRule() {
    print("I am initialized only once")
  }

  int maxScore

  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }
}
