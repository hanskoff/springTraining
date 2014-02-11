package eu.solidcraft.starter

class JobsScoringRule implements ScoringRule {
  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }

  int maxScore

  @Override
  int getScore() {
    return 0  //To change body of implemented methods use File | Settings | File Templates.
  }
}
