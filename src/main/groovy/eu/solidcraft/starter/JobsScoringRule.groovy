package eu.solidcraft.starter

class JobsScoringRule implements ScoringRule {
  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }

  int maxScore
}
