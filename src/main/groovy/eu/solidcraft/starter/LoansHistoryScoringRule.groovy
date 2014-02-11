package eu.solidcraft.starter

import eu.solidcraft.starter.conf.Profiles
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Component("loanHistory")
@Profile([Profiles.PRODUCTION])
class LoansHistoryScoringRule implements ScoringRule {
  int maxScore

  void setMaxScore(int maxScore) {
    this.maxScore = maxScore
  }

  @Override
  int getScore() {
    return 0  //To change body of implemented methods use File | Settings | File Templates.
  }
}
