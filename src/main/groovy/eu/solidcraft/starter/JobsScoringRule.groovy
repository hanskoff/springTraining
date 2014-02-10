package eu.solidcraft.starter

import org.springframework.stereotype.Component

@Component
class JobsScoringRule implements ScoringRule {
  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }

  int maxScore
}
