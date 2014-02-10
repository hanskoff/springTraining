package eu.solidcraft.starter

import org.springframework.stereotype.Component

@Component
class AgeScoringRule implements ScoringRule {
  int maxScore

  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }
}
