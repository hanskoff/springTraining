package eu.solidcraft.starter

class AgeScoringRule implements ScoringRule {
  AgeScoringRule() {
    print("I am initialized only once")
  }

  int maxScore

  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }

  @Override
  int getScore() {
    return 0  //To change body of implemented methods use File | Settings | File Templates.
  }
}
