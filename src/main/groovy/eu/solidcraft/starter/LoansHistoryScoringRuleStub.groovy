package eu.solidcraft.starter

import eu.solidcraft.starter.conf.Profiles
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Component("loanHistory")
@Profile([Profiles.TEST])
class LoansHistoryScoringRuleStub implements ScoringRule {

  @Override
  int getScore() {
    return 100
  }
}
